package com.scenariobasedquestion.universitycourse;

// Faculty holds a grader strategy
public class Faculty {
    private String id;
    private String name;
    private Graded grader;

    public Faculty(String id, String name, Graded grader) {
        this.id = id;
        this.name = name;
        this.grader = grader;
    }

    public void assignGrade(Student student, Course course, String grade) {
        grader.assignGrade(student, course, grade);
    }

    public void display() {
        System.out.println("Faculty: " + name + " (" + id + ")");
    }
}
