package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> students; // aggregation: students can exist independently

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student s) {
        if (s != null && !students.contains(s)) students.add(s);
    }

    public void removeStudent(Student s) {
        students.remove(s);
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
    }

    public void showStudents() {
        System.out.println("School: " + name);
        if (students.isEmpty()) {
            System.out.println("  (no students)");
            return;
        }
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}
