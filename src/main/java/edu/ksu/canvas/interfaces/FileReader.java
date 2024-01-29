package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.File;
import edu.ksu.canvas.requestOptions.ListCourseFileOptions;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

/**
 * This is just used for getting a file after it's been uploaded at the moment.
 */
public interface FileReader extends CanvasReader<File, FileReader> {

    /**
     * This is used primarily when you have a redirect after you've uploaded a file.
     * @param url The URL of the file that has been uploaded.
     * @return The file object wrapped in an optional.
     * @throws IOException When there is an error communicating with Canvas
     */
    Optional<File> getFile(String url) throws IOException;
	List<File> listCourseFile(ListCourseFileOptions listCourseFileOptions) throws IOException;
}
