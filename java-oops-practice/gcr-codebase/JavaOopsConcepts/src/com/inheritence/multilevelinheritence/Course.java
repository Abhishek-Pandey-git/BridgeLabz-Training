package com.inheritence.multilevelinheritence;

// Basic course class
public class Course {
    protected String courseName;
    protected int duration; // duration in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}
