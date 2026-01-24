package com.examscanner;

import java.util.List;

public class AnswerSheet<T> {
    private String studentName;
    private List<String> answers;
    private T subject;
    private int score;

    public AnswerSheet(String studentName, List<String> answers, T subject) {
        this.studentName = studentName;
        this.answers = answers;
        this.subject = subject;
        this.score = 0;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public T getSubject() {
        return subject;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return studentName + " - Score: " + score + " (" + subject + ")";
    }
}
