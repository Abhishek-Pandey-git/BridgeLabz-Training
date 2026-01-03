package com.scenariobasedquestion.hospitalscenario;

// Base patient class
public class Patient {
    protected String id;
    protected String name;
    private int age;
    private String medicalHistory; // sensitive

    // Normal admission
    public Patient(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.medicalHistory = "";
    }

    // Overloaded constructor for emergency admission with medical history
    public Patient(String id, String name, int age, String medicalHistory) {
        this(id, name, age);
        this.medicalHistory = medicalHistory;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    // expose a short summary only
    public String getSummary() {
        if (medicalHistory == null || medicalHistory.isEmpty()) return "No prior history.";
        if (medicalHistory.length() > 40) return medicalHistory.substring(0, 40) + "...";
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public void displayInfo() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Medical Summary: " + getSummary());
    }
}
