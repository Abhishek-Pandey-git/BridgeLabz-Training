package com.encapsulationpolymorphisminterfaceandabstractclass;

//abstract patient class
public abstract class Q7_Patient {
    
    private int patientId;
    private String name;
    private int age;
    
    public Q7_Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    
    //abstract method
    public abstract double calculateBill();
    
    //concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    //getters and setters
    public int getPatientId() {
        return patientId;
    }
    
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
