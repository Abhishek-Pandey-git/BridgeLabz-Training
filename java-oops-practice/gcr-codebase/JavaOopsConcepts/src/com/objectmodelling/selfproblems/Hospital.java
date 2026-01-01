package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDoctor(Doctor d) {
        if (d != null && !doctors.contains(d)) doctors.add(d);
    }

    public void addPatient(Patient p) {
        if (p != null && !patients.contains(p)) patients.add(p);
    }

    public void showAll() {
        System.out.println("Hospital: " + name);
        System.out.println("Doctors:");
        for (Doctor d : doctors) System.out.println(" - Dr. " + d.getName());
        System.out.println("Patients:");
        for (Patient p : patients) System.out.println(" - " + p.getName());
    }
}
