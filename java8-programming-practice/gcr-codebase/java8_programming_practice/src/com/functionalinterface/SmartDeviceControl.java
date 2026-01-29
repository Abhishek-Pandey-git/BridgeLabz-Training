package com.functionalinterface;

// Smart Device Interface
interface SmartDevice {
    void turnOn();
    void turnOff();
}

// Light implementation
class Light implements SmartDevice {
    private String location;
    
    public Light(String location) {
        this.location = location;
    }
    
    @Override
    public void turnOn() {
        System.out.println(location + " Light turned ON");
    }
    
    @Override
    public void turnOff() {
        System.out.println(location + " Light turned OFF");
    }
}

// AC implementation
class AirConditioner implements SmartDevice {
    private String room;
    
    public AirConditioner(String room) {
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
class Television implements SmartDevice {
    private String brand;
    
    public Television(String brand) {
        this.brand = brand;
    }
    
    @Override
    public void turnOn() {
        System.out.println(brand + " TV powered ON");
    }
    
    @Override
    public void turnOff() {
        System.out.println(brand + " TV powered OFF");
    }
}

public class SmartDeviceControl {
    public static void main(String[] args) {
        SmartDevice light = new Light("Living Room");
        SmartDevice ac = new AirConditioner("Bedroom");
        SmartDevice tv = new Television("Samsung");
        
        // Control all devices
        light.turnOn();
        ac.turnOn();
        tv.turnOn();
        
        System.out.println();
        
        light.turnOff();
        ac.turnOff();
        tv.turnOff();
    }
}
