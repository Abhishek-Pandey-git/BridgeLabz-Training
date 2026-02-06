package com.multithreading;

public class BankingSystem {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new Transaction(account, 3000, "Customer-1"), "Customer-1");
        Thread t2 = new Thread(new Transaction(account, 4000, "Customer-2"), "Customer-2");
        Thread t3 = new Thread(new Transaction(account, 2000, "Customer-3"), "Customer-3");
        Thread t4 = new Thread(new Transaction(account, 5000, "Customer-4"), "Customer-4");
        Thread t5 = new Thread(new Transaction(account, 1500, "Customer-5"), "Customer-5");

        // Display thread states before processing
        System.out.println("Thread states before start:");
        System.out.println("Customer-1: " + t1.getState());
        System.out.println("Customer-2: " + t2.getState());
        System.out.println("Customer-3: " + t3.getState());
        System.out.println("Customer-4: " + t4.getState());
        System.out.println("Customer-5: " + t5.getState());

        // Start all transaction threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

