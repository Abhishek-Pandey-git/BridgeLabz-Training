package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    void addCourse(Course c) {
        if (c != null && !courses.contains(c)) courses.add(c);
    }

    void removeCourse(Course c) {
        courses.remove(c);
    }

    public List<Course> getCourses() {
        return new ArrayList<>(courses);
    }

    public void viewCourses() {
        System.out.println("Student: " + name);
        if (courses.isEmpty()) {
            System.out.println("  (no courses)");
            return;
        }
        for (Course c : courses) {
            System.out.println(" - " + c.getName());
        }
    }
}
