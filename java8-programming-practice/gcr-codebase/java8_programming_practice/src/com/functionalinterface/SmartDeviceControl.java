package com.functionalinterface;

// Interface for smart devices
interface Device {
    void turnOn();
    void turnOff();
}

// Light implementation
class Light implements Device {
    private String location;
    
    public Light(String location) {
        this.location = location;
    }
    
    @Override
    public void turnOn() {
        System.out.println(location + " light turned ON");
    }
    
    @Override
    public void turnOff() {
        System.out.println(location + " light turned OFF");
    }
}

// AC implementation
class AC implements Device {
    private String room;
    
    public AC(String room) {
        this.room = room;
    }
    
    @Override
    public void turnOn() {
        System.out.println(room + " AC turned ON - Cooling started");
    }
    
    @Override
    public void turnOff() {
        System.out.println(room + " AC turned OFF");
    }
}

// TV implementation
class TV implements Device {
    private String brand;
    
    public TV(String brand) {
        this.brand = brand;
    }
    
    @Override
    public void turnOn() {
        System.out.println(brand + " TV turned ON");
    }
    
    @Override
    public void turnOff() {
        System.out.println(brand + " TV turned OFF");
    }
}

public class SmartDeviceControl {
    public static void main(String[] args) {
        Device light = new Light("Living Room");
        Device ac = new AC("Bedroom");
        Device tv = new TV("Samsung");
        
        // Turn on all devices
        light.turnOn();
        ac.turnOn();
        tv.turnOn();
        
        System.out.println();
        
        // Turn off all devices
        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
