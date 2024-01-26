package edu.ksu.canvas.impl;

import com.google.common.reflect.TypeToken;
import edu.ksu.canvas.interfaces.AnnouncementReader;
import edu.ksu.canvas.interfaces.AnnouncementWriter;
import edu.ksu.canvas.model.announcement.Announcement;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import edu.ksu.canvas.requestOptions.ListCourseAnnouncementOptions;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AnnouncementImpl extends BaseImpl<Announcement, AnnouncementReader, AnnouncementWriter> implements AnnouncementReader, AnnouncementWriter{

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
        String courseContextCode = listCourseAnnouncementOptions.getCourseIdList().stream()
                .map(courseId->String.format("context_codes[]=course_%s", courseId))
                .collect(HashMap);
        String url = buildCanvasUrl("announcements", new HashMap<>());
        return getListFromCanvas(url);
    }
}
