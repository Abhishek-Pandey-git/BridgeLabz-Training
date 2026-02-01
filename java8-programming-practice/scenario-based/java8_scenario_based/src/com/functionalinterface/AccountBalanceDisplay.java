package com.functionalinterface;

import java.util.function.Consumer;

public class AccountBalanceDisplay {
    public static void main(String[] args) {
        // Consumer to display account balance
        Consumer<Double> displayBalance = balance -> 
            System.out.println("Current Account Balance: Rs." + balance);
        
        displayBalance.accept(10000.0);
        displayBalance.accept(25000.0);
        displayBalance.accept(5000.0);
    }
}
