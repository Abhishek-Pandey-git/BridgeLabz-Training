package com.scenariobasedquestion.bankscenario;

// SavingAccount class extends BankAccount
public class SavingAccount extends BankAccount {
    // interest rate
    double interestRate;

    // constructor
    public SavingAccount(double accountBalance, double interestRate) {
        super(accountBalance);
        this.interestRate = interestRate;
    }

    // method to calculate interest
    public void calculateInterest() {
        double interest = accountBalance * interestRate / 100;
        accountBalance += interest;
    }
}