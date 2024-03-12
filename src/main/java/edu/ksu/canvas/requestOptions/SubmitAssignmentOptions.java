package edu.ksu.canvas.requestOptions;

public class SubmitAssignmentOptions extends BaseOptions {
	private String courseId;
	private String assignmentId;


	public SubmitAssignmentOptions(String courseId, String assignmentId) {
		this.courseId = courseId;
		this.assignmentId = assignmentId;
	}



}
