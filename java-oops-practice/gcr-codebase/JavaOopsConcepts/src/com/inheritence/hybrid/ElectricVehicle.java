package com.inheritence.hybrid;

// Electric vehicle with charge behavior
public class ElectricVehicle extends Vehicle {
    private double batteryLevel; // percent

    public ElectricVehicle(String model, int maxSpeed, double batteryLevel) {
        super(model, maxSpeed);
        this.batteryLevel = batteryLevel;
    }

    public void charge(double percent) {
        batteryLevel += percent;
        if (batteryLevel > 100) batteryLevel = 100;
        System.out.println("Charged to " + batteryLevel + "%");
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}
