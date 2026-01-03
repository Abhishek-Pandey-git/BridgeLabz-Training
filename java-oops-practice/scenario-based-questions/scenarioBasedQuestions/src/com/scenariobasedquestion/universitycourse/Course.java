package com.scenariobasedquestion.universitycourse;

// Course class with simple attributes
public class Course {
    private String code;
    private String name;
    private int credits;
    private boolean passFail; // true if pass/fail course

    public Course(String code, String name, int credits, boolean passFail) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.passFail = passFail;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public int getCredits() { return credits; }
    public boolean isPassFail() { return passFail; }

    public void display() {
        System.out.println(name + " (" + code + ") - " + credits + " credits" + (passFail ? " [Pass/Fail]" : ""));
    }
}
