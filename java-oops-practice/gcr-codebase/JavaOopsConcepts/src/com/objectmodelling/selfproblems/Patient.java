package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    void addDoctor(Doctor d) {
        if (d != null && !doctors.contains(d)) doctors.add(d);
    }

    public List<Doctor> getDoctors() {
        return new ArrayList<>(doctors);
    }

    public void viewDoctors() {
        System.out.println("Patient: " + name);
        if (doctors.isEmpty()) {
            System.out.println("  (no doctors)");
            return;
        }
        for (Doctor d : doctors) {
            System.out.println(" - Dr. " + d.getName());
        }
    }
}
