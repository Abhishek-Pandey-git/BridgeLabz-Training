package com.multithreading;

class BankAccount {

    private int balance = 10000;

    // synchronized to prevent race condition
    public synchronized boolean withdraw(int amount) {
        if (balance >= amount) {
            try {
                // simulate ATM processing delay
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            balance -= amount;
            return true;
        }
        return false;
    }

    public synchronized int getBalance() {
        return balance;
    }
}
