package com.scenariobasedquestion.vehiclerental;

// Car has extra insurance surcharge per day
public class Car extends Vehicle {
    private boolean automatic;
    private double insurancePerDay;

    public Car(String model, int year, double baseRate, boolean automatic, double insurancePerDay) {
        super(model, year, baseRate);
        this.automatic = automatic;
        this.insurancePerDay = insurancePerDay;
    }

    @Override
    public double calculateRent(int days) {
        double base = super.calculateRent(days);
        double insurance = insurancePerDay * days; // operator usage
        // surcharge for automatic cars
        double autoSurcharge = automatic ? (base * 0.05) : 0; // 5% extra
        return base + insurance + autoSurcharge;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Automatic: " + (automatic ? "Yes" : "No"));
        System.out.println("Insurance/day: " + insurancePerDay);
    }
}
