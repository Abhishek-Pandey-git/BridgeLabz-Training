package com.linkedlist.singlylinkedlist;

/**
 * Immutable student identity with a mutable grade for updates.
 */
public class StudentRecord {
    private final int rollNumber;
    private final String name;
    private final int age;
    private String grade;

    public StudentRecord(int rollNumber, String name, int age, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Roll: " + rollNumber
                + ", Name: " + name
                + ", Age: " + age
                + ", Grade: " + grade;
    }
}