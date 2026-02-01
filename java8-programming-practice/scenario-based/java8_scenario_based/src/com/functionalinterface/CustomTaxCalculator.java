package com.functionalinterface;

@FunctionalInterface
interface TaxCalculator {
    double calculateTax(double income);
}

public class CustomTaxCalculator {
    public static void main(String[] args) {
        // Custom functional interface for tax calculation
        TaxCalculator taxCalc = income -> {
            if (income <= 250000) return 0;
            else if (income <= 500000) return (income - 250000) * 0.05;
            else return 12500 + (income - 500000) * 0.2;
        };
        
        System.out.println("Income Rs.200000: Tax Rs." + taxCalc.calculateTax(200000));
        System.out.println("Income Rs.400000: Tax Rs." + taxCalc.calculateTax(400000));
        System.out.println("Income Rs.600000: Tax Rs." + taxCalc.calculateTax(600000));
    }
}
