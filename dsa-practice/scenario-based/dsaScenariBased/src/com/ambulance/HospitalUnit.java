package com.ambulance;

public class HospitalUnit {
    String name;
    boolean isAvailable;
    HospitalUnit next;
    
    public HospitalUnit(String name) {
        this.name = name;
        this.isAvailable = true;
        this.next = null;
    }
}
