package com.lambdaexpression;

import java.util.function.Predicate;

public class MinimumBalanceChecker {
    public static void main(String[] args) {
        // Lambda to check minimum balance
        Predicate<Double> hasMinBalance = balance -> balance >= 1000;
        
        System.out.println("Balance Rs.1500: " + (hasMinBalance.test(1500.0) ? "Valid" : "Below Minimum"));
        System.out.println("Balance Rs.800: " + (hasMinBalance.test(800.0) ? "Valid" : "Below Minimum"));
        System.out.println("Balance Rs.1000: " + (hasMinBalance.test(1000.0) ? "Valid" : "Below Minimum"));
    }
}
