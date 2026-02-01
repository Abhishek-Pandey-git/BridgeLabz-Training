package com.functionalinterface;

import java.util.function.Predicate;

public class BankWithdrawalValidator {
    public static void main(String[] args) {
        double accountBalance = 10000.0;
        
        // Predicate to validate withdrawal
        Predicate<Double> isValidWithdrawal = amount -> amount > 0 && amount <= accountBalance;
        
        System.out.println("Withdraw Rs.5000: " + isValidWithdrawal.test(5000.0));
        System.out.println("Withdraw Rs.15000: " + isValidWithdrawal.test(15000.0));
        System.out.println("Withdraw Rs.-500: " + isValidWithdrawal.test(-500.0));
    }
}
