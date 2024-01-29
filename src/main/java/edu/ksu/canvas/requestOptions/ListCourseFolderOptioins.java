package edu.ksu.canvas.requestOptions;

public class ListCourseFolderOptioins extends BaseOptions {
	private String courseId;

	public ListCourseFolderOptioins(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseId() {
		return courseId;
	}
}
