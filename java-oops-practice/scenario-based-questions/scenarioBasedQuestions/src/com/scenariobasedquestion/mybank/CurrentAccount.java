package com.scenariobasedquestion.mybank;

/**
 * Current account keeps funds ready for daily use.
 */
public class CurrentAccount extends Account {

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
        this.interestRate = 2.0;
    }

    public CurrentAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
        this.interestRate = 2.0;
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100.0;
    }
}