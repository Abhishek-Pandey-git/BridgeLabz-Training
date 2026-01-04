package com.encapsulationpolymorphisminterfaceandabstractclass;

//abstract bank account class
public abstract class Q4_BankAccount {
    
    private String accountNumber;
    private String holderName;
    private double balance;
    
    public Q4_BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    
    //concrete methods
    public void deposit(double amount) {
        if(amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: Rs." + amount);
        }
    }
    
    public void withdraw(double amount) {
        if(amount > 0 && balance >= amount) {
            balance = balance - amount;
            System.out.println("Withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    //abstract method
    public abstract double calculateInterest();
    
    //getters and setters
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    public String getHolderName() {
        return holderName;
    }
    
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
