package com.examscanner;

public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(other.score, this.score);
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}
