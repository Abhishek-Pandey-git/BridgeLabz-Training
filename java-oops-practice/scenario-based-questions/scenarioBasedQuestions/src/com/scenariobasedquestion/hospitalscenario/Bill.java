package com.scenariobasedquestion.hospitalscenario;

// Simple bill implementation
public class Bill implements Payable {
    private double serviceCharges;
    private double medicineCharges;
    private double discountPercent; // e.g., 10 for 10%
    private double taxPercent; // e.g., 5 for 5%

    public Bill(double serviceCharges, double medicineCharges, double discountPercent, double taxPercent) {
        this.serviceCharges = serviceCharges;
        this.medicineCharges = medicineCharges;
        this.discountPercent = discountPercent;
        this.taxPercent = taxPercent;
    }

    @Override
    public double calculatePayment() {
        double subtotal = serviceCharges + medicineCharges;
        double discount = subtotal * discountPercent / 100.0;
        double taxed = (subtotal - discount) * taxPercent / 100.0;
        return subtotal - discount + taxed;
    }

    public void displayBreakdown() {
        System.out.println("Service Charges: " + serviceCharges);
        System.out.println("Medicine Charges: " + medicineCharges);
        System.out.println("Discount (%): " + discountPercent);
        System.out.println("Tax (%): " + taxPercent);
        System.out.println("Total Payable: " + calculatePayment());
    }
}
