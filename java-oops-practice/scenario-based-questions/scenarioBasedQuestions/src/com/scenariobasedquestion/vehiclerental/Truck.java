package com.scenariobasedquestion.vehiclerental;

// Truck has loading surcharge
public class Truck extends Vehicle {
    private double loadCapacityTons;
    private double loadingSurcharge; // fixed per rental

    public Truck(String model, int year, double baseRate, double loadCapacityTons, double loadingSurcharge) {
        super(model, year, baseRate);
        this.loadCapacityTons = loadCapacityTons;
        this.loadingSurcharge = loadingSurcharge;
    }

    @Override
    public double calculateRent(int days) {
        double base = super.calculateRent(days);
        // trucks have higher rate and a fixed loading surcharge
        double heavySurcharge = base * 0.15; // 15% extra
        return base + heavySurcharge + loadingSurcharge;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load capacity (tons): " + loadCapacityTons);
        System.out.println("Loading surcharge: " + loadingSurcharge);
    }
}
