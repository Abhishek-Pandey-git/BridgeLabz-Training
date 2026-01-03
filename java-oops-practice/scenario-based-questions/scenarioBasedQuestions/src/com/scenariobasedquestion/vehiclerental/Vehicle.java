package com.scenariobasedquestion.vehiclerental;

// Base vehicle class
public class Vehicle implements Rentable {
    protected String model;
    protected int year;
    protected double baseRate; // per day

    public Vehicle(String model, int year, double baseRate) {
        this.model = model;
        this.year = year;
        this.baseRate = baseRate;
    }

    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getBaseRate() { return baseRate; }

    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }
    public void setBaseRate(double baseRate) { this.baseRate = baseRate; }

    @Override
    public double calculateRent(int days) {
        // simple calculation: baseRate * days
        return baseRate * days;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + " (" + year + ")");
        System.out.println("Base rate/day: " + baseRate);
    }
}
