package com.scenariobasedquestion.universitycourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Small interactive demo to enroll students and assign grades
public class UniversityDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Create student: Undergraduate or Postgraduate? (u/p)");
        String t = scanner.nextLine().trim().toLowerCase();
        System.out.println("Enter student id:");
        String sid = scanner.nextLine();
        System.out.println("Enter name:");
        String sname = scanner.nextLine();

        Student student;
        if (t.equals("u")) {
            System.out.println("Enter comma-separated elective preferences (or blank):");
            String elect = scanner.nextLine();
            List<String> list = new ArrayList<>();
            if (!elect.trim().isEmpty()) {
                for (String e : elect.split(",")) list.add(e.trim());
            }
            student = new Undergraduate(sid, sname, list);
        } else {
            student = new Postgraduate(sid, sname);
        }

        System.out.println("Create course. Enter code:");
        String code = scanner.nextLine();
        System.out.println("Enter course name:");
        String cname = scanner.nextLine();
        System.out.println("Enter credits:");
        int credits = Integer.parseInt(scanner.nextLine());
        System.out.println("Is this a pass/fail course? (yes/no)");
        boolean pf = scanner.nextLine().trim().toLowerCase().startsWith("y");
        Course course = new Course(code, cname, credits, pf);

        System.out.println("Create faculty: enter id:");
        String fid = scanner.nextLine();
        System.out.println("Enter faculty name:");
        String fname = scanner.nextLine();
        Graded grader = pf ? new PassFailGrader() : new LetterGrader();
        Faculty faculty = new Faculty(fid, fname, grader);

        Enrollment en = new Enrollment(student, course, faculty);

        System.out.println("Assign grade (for pass/fail use PASS/FAIL or letter A-F):");
        String grade = scanner.nextLine();
        en.assignGrade(grade);

        System.out.println("\nStudent Transcript:");
        student.printTranscript();

        scanner.close();
    }
}
