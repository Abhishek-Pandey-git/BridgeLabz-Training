package com.lambdaexpression;

import java.util.function.BiPredicate;

public class WithdrawalValidator {
    public static void main(String[] args) {
        double balance = 10000;
        
        // Lambda to validate withdrawal
        BiPredicate<Double, Double> isValidWithdrawal = (amount, bal) -> 
            amount > 0 && amount <= bal;
        
        System.out.println("Withdraw Rs.5000: " + (isValidWithdrawal.test(5000.0, balance) ? "Valid" : "Invalid"));
        System.out.println("Withdraw Rs.15000: " + (isValidWithdrawal.test(15000.0, balance) ? "Valid" : "Invalid"));
        System.out.println("Withdraw Rs.-500: " + (isValidWithdrawal.test(-500.0, balance) ? "Valid" : "Invalid"));
    }
}
