package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.Folder;
import edu.ksu.canvas.requestOptions.ListCourseFolderOptioins;

import java.io.IOException;
import java.util.List;

public interface FolderReader extends CanvasReader<Folder, FolderReader> {
	List<Folder> listCourseFolder(ListCourseFolderOptioins listCourseFolderOptioins) throws IOException;

}
