package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

//in patient class
public class Q7_InPatient extends Q7_Patient implements Q7_MedicalRecord {
    
    private int daysAdmitted;
    private double roomCharges;
    private ArrayList<String> medicalRecords;
    
    public Q7_InPatient(int patientId, String name, int age, int daysAdmitted, double roomCharges) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.roomCharges = roomCharges;
        this.medicalRecords = new ArrayList<>();
    }
    
    @Override
    public double calculateBill() {
        //bill calculation for in patient
        double totalBill = daysAdmitted * roomCharges;
        double medicineCharges = 500 * daysAdmitted;
        return totalBill + medicineCharges;
    }
    
    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
        System.out.println("Record added for patient: " + getName());
    }
    
    @Override
    public void viewRecords() {
        System.out.println("Medical Records:");
        for(int i=0; i<medicalRecords.size(); i++) {
            System.out.println("- " + medicalRecords.get(i));
        }
    }
    
    public int getDaysAdmitted() {
        return daysAdmitted;
    }
    
    public void setDaysAdmitted(int daysAdmitted) {
        this.daysAdmitted = daysAdmitted;
    }
    
    public double getRoomCharges() {
        return roomCharges;
    }
    
    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }
}
