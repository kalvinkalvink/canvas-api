package edu.ksu.canvas.interfaces;

import edu.ksu.canvas.model.quizzes.QuizSubmission;
import edu.ksu.canvas.exception.OauthTokenRequiredException;

import java.io.IOException;
import java.util.List;

public interface QuizSubmissionReader extends CanvasReader<QuizSubmission, QuizSubmissionReader> {
    /**
     * Retrieve a list of quiz submissions from Canvas by its course and quiz Canvas ID numbers
     * @param courseId   The Canvas ID of the course
     * @param quizId     The Canvas ID of the quiz
     * @return List of quiz submissions in the course with the course ID
     * @throws OauthTokenRequiredException
     * @throws IOException
     */
    List<QuizSubmission> getQuizSubmissions(String courseId, String quizId) throws OauthTokenRequiredException, IOException;

}