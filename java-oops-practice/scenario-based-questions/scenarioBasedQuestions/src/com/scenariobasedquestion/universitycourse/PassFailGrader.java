package com.scenariobasedquestion.universitycourse;

// Pass/Fail grading implementation
public class PassFailGrader implements Graded {
    @Override
    public void assignGrade(Student student, Course course, String grade) {
        String g = grade.trim().toUpperCase();
        if (!g.equals("PASS") && !g.equals("FAIL")) {
            System.out.println("Invalid pass/fail grade. Use PASS or FAIL. Grade not assigned.");
            return;
        }
        student.addGrade(course, g);
        System.out.println("Assigned " + g + " to " + student.getName() + " for " + course.getCode());
    }
}
