package com.scenariobasedquestion.ewallet;

import java.util.ArrayList;
import java.util.List;

// Base wallet class
public abstract class Wallet implements Transferrable {
    private double balance;
    protected User owner;
    protected List<Transaction> history;

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
        this.history = new ArrayList<>();
    }

    void setOwner(User owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    // add money to wallet
    protected void addBalance(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            Transaction t = new Transaction("SYSTEM", owner.getId(), amount, "Deposit");
            history.add(t);
        }
    }

    // remove money from wallet
    protected boolean deduct(double amount) {
        if (amount <= 0) {
            return false;
        }
        if (amount > balance) {
            return false;
        }
        balance = balance - amount;
        Transaction t = new Transaction(owner.getId(), "SYSTEM", amount, "Withdraw");
        history.add(t);
        return true;
    }

    public void printHistory() {
        System.out.println("Transaction History:");
        for (int i = 0; i < history.size(); i++) {
            history.get(i).print();
        }
    }
}
 
