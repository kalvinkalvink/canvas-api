package edu.ksu.canvas.impl;

import com.google.gson.reflect.TypeToken;
import edu.ksu.canvas.interfaces.CanvasReader;
import edu.ksu.canvas.interfaces.FolderReader;
import edu.ksu.canvas.interfaces.FolderWriter;
import edu.ksu.canvas.model.File;
import edu.ksu.canvas.model.Folder;
import edu.ksu.canvas.net.RestClient;
import edu.ksu.canvas.oauth.OauthToken;
import edu.ksu.canvas.requestOptions.ListCourseFolderOptioins;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class FolderImpl extends BaseImpl<Folder, FolderReader, FolderWriter> implements FolderReader, FolderWriter {
	/**
	 * Construct a new CanvasApi class with an OAuth token
	 *
	 * @param canvasBaseUrl      The base URL of your canvas instance
	 * @param apiVersion         The version of the Canvas API (currently 1)
	 * @param oauthToken         OAuth token to use when executing API calls
	 * @param restClient         a RestClient implementation to use when talking to Canvas
	 * @param connectTimeout     Timeout in seconds to use when connecting
	 * @param readTimeout        Timeout in seconds to use when waiting for data to come back from an open connection
	 * @param paginationPageSize How many objects to request per page on paginated requests
	 * @param serializeNulls     Whether or not to include null fields in the serialized JSON. Defaults to false if null
	 */
	public FolderImpl(String canvasBaseUrl, Integer apiVersion, OauthToken oauthToken, RestClient restClient, int connectTimeout, int readTimeout, Integer paginationPageSize, Boolean serializeNulls) {
		super(canvasBaseUrl, apiVersion, oauthToken, restClient, connectTimeout, readTimeout, paginationPageSize, serializeNulls);
	}

	@Override
	protected Type listType() {
		return new TypeToken<List<Folder>>() {
		}.getType();
	}

	@Override
	protected Class<Folder> objectType() {
		return Folder.class;
	}

	@Override
	public List<Folder> listCourseFolder(ListCourseFolderOptioins listCourseFolderOptioins) throws IOException {
		String url = buildCanvasUrl("courses/" + listCourseFolderOptioins.getCourseId() + "/folders", listCourseFolderOptioins.getOptionsMap());
		return getListFromCanvas(url);
	}
}
