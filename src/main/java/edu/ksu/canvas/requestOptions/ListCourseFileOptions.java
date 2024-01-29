package edu.ksu.canvas.requestOptions;

public class ListCourseFileOptions extends BaseOptions {
	private String courseId;

	public ListCourseFileOptions(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseId() {
		return courseId;
	}
}
