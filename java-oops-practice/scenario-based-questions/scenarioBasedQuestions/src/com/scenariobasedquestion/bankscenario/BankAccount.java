package com.scenariobasedquestion.bankscenario;

// BankAccount class as base
public class BankAccount {
    // account balance
    double accountBalance;

    // constructor
    public BankAccount(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    // method to deposit
    public void depositMoney(double amount) {
        accountBalance += amount;
    }

    // method to withdraw
    public void withdrawMoney(double amount) {
        if (accountBalance >= amount) {
            accountBalance -= amount;
        }
    }
}