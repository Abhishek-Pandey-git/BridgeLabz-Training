package com.multithreading;

import java.time.LocalDateTime;

class Transaction implements Runnable {

    private final BankAccount account;
    private final int amount;
    private final String customerName;

    public Transaction(BankAccount account, int amount, String customerName) {
        this.account = account;
        this.amount = amount;
        this.customerName = customerName;
    }

    @Override
    public void run() {

        System.out.println("[" + Thread.currentThread().getName() +
                "] Attempting to withdraw " + amount +
                " at " + LocalDateTime.now());

        boolean success = account.withdraw(amount);

        if (success) {
            System.out.println("Transaction successful: " +
                    customerName + ", Amount: " + amount +
                    ", Balance: " + account.getBalance());
        } else {
            System.out.println("Transaction failed: " +
                    customerName + ", Insufficient balance");
        }
    }
}
