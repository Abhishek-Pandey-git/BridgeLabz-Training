package com.scenariobasedquestion.mybank;

/**
 * Base account class with shared data and simple guards.
 */
public abstract class Account implements ITransaction {
    private String accountNumber;
    private double balance;
    protected double interestRate;

    public Account(String accountNumber) {
        this(accountNumber, 0.0);
    }

    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = Math.max(0.0, openingBalance);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    protected double getBalance() {
        return balance;
    }

    protected void updateBalance(double value) {
        this.balance = value;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.println("Deposited Rs." + amount + " into " + accountNumber);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew Rs." + amount + " from " + accountNumber);
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    public abstract double calculateInterest();
}