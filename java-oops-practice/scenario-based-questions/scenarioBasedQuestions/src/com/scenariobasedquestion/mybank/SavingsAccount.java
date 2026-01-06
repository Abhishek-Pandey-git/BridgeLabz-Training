package com.scenariobasedquestion.mybank;

/**
 * Savings account earns slightly higher interest.
 */
public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
        this.interestRate = 4.5;
    }

    public SavingsAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
        this.interestRate = 4.5;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100.0;
    }
}