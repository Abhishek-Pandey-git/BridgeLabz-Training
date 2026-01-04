package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

//out patient class
public class Q7_OutPatient extends Q7_Patient implements Q7_MedicalRecord {
    
    private double consultationFee;
    private int numberOfVisits;
    private ArrayList<String> medicalRecords;
    
    public Q7_OutPatient(int patientId, String name, int age, double consultationFee, int numberOfVisits) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.numberOfVisits = numberOfVisits;
        this.medicalRecords = new ArrayList<>();
    }
    
    @Override
    public double calculateBill() {
        //bill for out patient
        return consultationFee * numberOfVisits;
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
    
    public double getConsultationFee() {
        return consultationFee;
    }
    
    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }
    
    public int getNumberOfVisits() {
        return numberOfVisits;
    }
    
    public void setNumberOfVisits(int numberOfVisits) {
        this.numberOfVisits = numberOfVisits;
    }
}
