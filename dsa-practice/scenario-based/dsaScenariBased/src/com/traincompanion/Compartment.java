package com.traincompanion;

public class Compartment {
    String name;
    String service; // like "Pantry", "WiFi", "AC", "Sleeper" etc
    Compartment next;
    Compartment prev;
    
    public Compartment(String name, String service) {
        this.name = name;
        this.service = service;
        this.next = null;
        this.prev = null;
    }
    
    @Override
    public String toString() {
        return "Compartment: " + name + " | Service: " + service;
    }
}
