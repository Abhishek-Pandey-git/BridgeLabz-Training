package com.objectmodelling.assistedproblems;

public class Account {
    private static int nextId = 1;
    private final int id;
    private Bank bank;
    private Customer owner;
    private double balance;

    Account(Bank bank, Customer owner, double initialBalance) {
        this.id = nextId++;
        this.bank = bank;
        this.owner = owner;
        this.balance = initialBalance;
    }

    public int getId() {
        return id;
    }

    public Bank getBank() {
        return bank;
    }

    public Customer getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Account#" + id + " (" + bank.getName() + ") - Balance: " + balance;
    }
}
