package com.scenariobasedquestion.vehiclerental;

// Bike is a light vehicle with small base rate
public class Bike extends Vehicle {
    private boolean helmetIncluded;

    public Bike(String model, int year, double baseRate, boolean helmetIncluded) {
        super(model, year, baseRate);
        this.helmetIncluded = helmetIncluded;
    }

    public boolean isHelmetIncluded() { return helmetIncluded; }

    @Override
    public double calculateRent(int days) {
        double total = super.calculateRent(days);
        // give small discount for long rentals
        if (days >= 7) {
            total = total * 0.9; // 10% off
        }
        return total;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Helmet included: " + (helmetIncluded ? "Yes" : "No"));
    }
}
