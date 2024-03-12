package edu.ksu.canvas.impl;

import com.google.common.reflect.TypeToken;
import edu.ksu.canvas.interfaces.AnnouncementReader;
import edu.ksu.canvas.interfaces.AnnouncementWriter;
import edu.ksu.canvas.model.announcement.Announcement;
import edu.ksu.canvas.net.Response;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import edu.ksu.canvas.requestOptions.ListCourseAnnouncementOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

public class AnnouncementImpl extends BaseImpl<Announcement, AnnouncementReader, AnnouncementWriter> implements AnnouncementReader, AnnouncementWriter{
	private static final Logger LOG = LoggerFactory.getLogger(AnnouncementImpl.class);
    public AnnouncementImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient, int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
        super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout, paginationPageSize, serializeNulls);
    }

    @Override
    protected Type listType() {
        return new TypeToken<List<Announcement>>(){}.getType();
    }

    @Override
    protected Class<Announcement> objectType() {
        return Announcement.class;
    }

    @Override
    public List<Announcement> listCourseAnnouncement(ListCourseAnnouncementOptions listCourseAnnouncementOptions) throws IOException {
        String url = buildCanvasUrl("announcements", listCourseAnnouncementOptions.getOptionsMap());
        return getListFromCanvas(url);
    }

	private Optional<Announcement> retrieveCourseAnnouncementFromCanvas(OauthToken oauthToken, String url) throws IOException {
		Response response = canvasMessenger.getSingleResponseFromCanvas(oauthToken, url);
		if(response.getErrorHappened()||response.getResponseCode() !=200){
			return Optional.empty();
		}
		return responseParser.parseToObject(Announcement.class, response);
	}
}
