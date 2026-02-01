package com.functionalinterface;

import java.util.function.Function;

public class AnnualSalaryCalculator {
    public static void main(String[] args) {
        // Function to calculate annual salary
        Function<Double, Double> calculateAnnual = monthlySalary -> monthlySalary * 12;
        
        System.out.println("Monthly Rs.30000: Annual Rs." + calculateAnnual.apply(30000.0));
        System.out.println("Monthly Rs.45000: Annual Rs." + calculateAnnual.apply(45000.0));
        System.out.println("Monthly Rs.50000: Annual Rs." + calculateAnnual.apply(50000.0));
    }
}
