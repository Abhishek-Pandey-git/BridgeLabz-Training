package com.scenariobasedquestion.universitycourse;

// Letter grading implementation
public class LetterGrader implements Graded {
    @Override
    public void assignGrade(Student student, Course course, String grade) {
        // accept only A,B,C,D,F
        String g = grade.trim().toUpperCase();
        if (!g.matches("A|B|C|D|F")) {
            System.out.println("Invalid letter grade. Use A/B/C/D/F. Grade not assigned.");
            return;
        }
        student.addGrade(course, g);
        System.out.println("Assigned grade " + g + " to " + student.getName() + " for " + course.getCode());
    }
}
