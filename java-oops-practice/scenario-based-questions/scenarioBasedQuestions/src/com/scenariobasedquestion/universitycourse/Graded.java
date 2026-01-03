package com.scenariobasedquestion.universitycourse;

// Grading behavior abstraction
public interface Graded {
    void assignGrade(Student student, Course course, String grade);
}
