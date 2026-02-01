package com.lambdaexpression;

import java.util.Comparator;

public class AccountBalanceComparison {
    public static void main(String[] args) {
        // Lambda to compare balances
        Comparator<Double> compareBalance = (b1, b2) -> Double.compare(b1, b2);
        
        double balance1 = 15000;
        double balance2 = 25000;
        
        int result = compareBalance.compare(balance1, balance2);
        
        if (result > 0) {
            System.out.println("Account 1 (Rs." + balance1 + ") has higher balance");
        } else if (result < 0) {
            System.out.println("Account 2 (Rs." + balance2 + ") has higher balance");
        } else {
            System.out.println("Both accounts have equal balance");
        }
    }
}
