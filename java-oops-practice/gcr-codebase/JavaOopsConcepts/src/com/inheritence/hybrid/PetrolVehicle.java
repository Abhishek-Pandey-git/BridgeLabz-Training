package com.inheritence.hybrid;

// Petrol vehicle that can be refueled
public class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelLevel; // liters

    public PetrolVehicle(String model, int maxSpeed, double fuelLevel) {
        super(model, maxSpeed);
        this.fuelLevel = fuelLevel;
    }

    @Override
    public void refuel(double liters) {
        if (liters > 0) {
            fuelLevel += liters;
            System.out.println("Refueled " + liters + " liters. Current fuel: " + fuelLevel);
        }
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Fuel Level: " + fuelLevel + " liters");
    }
}
