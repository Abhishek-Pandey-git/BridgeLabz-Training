package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void consult(Patient p) {
        if (p == null) return;
        if (!patients.contains(p)) patients.add(p);
        p.addDoctor(this);
        System.out.println("Dr. " + name + " consulted patient " + p.getName());
    }

    public List<Patient> getPatients() {
        return new ArrayList<>(patients);
    }
}
