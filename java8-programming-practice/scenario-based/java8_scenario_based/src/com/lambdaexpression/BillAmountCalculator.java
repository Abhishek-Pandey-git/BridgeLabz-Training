package com.lambdaexpression;

import java.util.function.BiFunction;

public class BillAmountCalculator {
    public static void main(String[] args) {
        // Lambda to calculate final bill with tax
        BiFunction<Double, Double, Double> calculateBill = (amount, taxPercent) -> 
            amount + (amount * taxPercent / 100);
        
        System.out.println("Amount Rs.1000, Tax 18%: Final Bill Rs." + calculateBill.apply(1000.0, 18.0));
        System.out.println("Amount Rs.2500, Tax 12%: Final Bill Rs." + calculateBill.apply(2500.0, 12.0));
        System.out.println("Amount Rs.500, Tax 5%: Final Bill Rs." + calculateBill.apply(500.0, 5.0));
    }
}
