package com.scenariobasedquestion.universitycourse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Base Student class
public class Student {
    protected String id;
    protected String name;
    private double gpa; // private, update internally
    private List<String> electivePreferences; // optional
    private Map<String, String> grades = new HashMap<>(); // courseCode -> grade

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.electivePreferences = new ArrayList<>();
        this.gpa = 0.0;
    }

    // constructor with electives
    public Student(String id, String name, List<String> electives) {
        this(id, name);
        if (electives != null) this.electivePreferences.addAll(electives);
    }

    public String getId() { return id; }
    public String getName() { return name; }

    // called by graders to add a grade and recalc GPA
    public void addGrade(Course course, String grade) {
        grades.put(course.getCode(), grade);
        recalcGpa();
    }

    private void recalcGpa() {
        if (grades.isEmpty()) { gpa = 0.0; return; }
        double total = 0.0;
        int count = 0;
        for (String g : grades.values()) {
            double pts = gradeToPoints(g);
            if (pts >= 0) { total += pts; count++; }
        }
        gpa = count == 0 ? 0.0 : (total / count);
    }

    // simple mapping: A=4,B=3,C=2,D=1,F=0, PASS=4, FAIL=0
    private double gradeToPoints(String g) {
        if (g == null) return -1;
        g = g.trim().toUpperCase();
        switch (g) {
            case "A": return 4.0;
            case "B": return 3.0;
            case "C": return 2.0;
            case "D": return 1.0;
            case "F": return 0.0;
            case "PASS": return 4.0;
            case "FAIL": return 0.0;
            default: return -1;
        }
    }

    // public access to transcript
    public void printTranscript() {
        System.out.println("Transcript for " + name + " (" + id + ")");
        for (Map.Entry<String, String> e : grades.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        System.out.println("GPA: " + String.format("%.2f", gpa));
    }

    public double getGpa() { return gpa; }
}
