package com.scenariobasedquestion.universitycourse;

// Simple Enrollment record
public class Enrollment {
    private Student student;
    private Course course;
    private Faculty faculty;

    public Enrollment(Student student, Course course, Faculty faculty) {
        this.student = student;
        this.course = course;
        this.faculty = faculty;
    }

    public void assignGrade(String grade) {
        faculty.assignGrade(student, course, grade);
    }

    public void printSummary() {
        System.out.println("Enrollment: " + student.getName() + " -> " + course.getCode() + " (Instructor: ");
        faculty.display();
    }
}
