package com.constructors.levelone;

import java.util.Scanner;

public class BankAccount {
	// public variable - can be accessed from anywhere
	public String accountNumber;
	
	// protected variable - can be accessed in same package and subclasses
	protected String accountHolder;
	
	// private variable - can only be accessed within this class
	private double balance;
	
	// constructor
	public BankAccount(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	// method to get balance
	public double getBalance() {
		return balance;
	}
	
	// method to set balance
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// method to deposit money
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Amount deposited successfully");
	}
	
	// method to withdraw money
	public void withdraw(double amount) {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("Amount withdrawn successfully");
		} else {
			System.out.println("Insufficient balance");
		}
	}
	
	// method to display account details
	public void displayAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Balance: " + balance);
	}
}

// subclass SavingsAccount to demonstrate access modifiers
class SavingsAccount extends BankAccount {
	// constructor
	public SavingsAccount(String accountNumber, String accountHolder, double balance) {
		super(accountNumber, accountHolder, balance);
	}
	
	// method to show savings account details
	public void showSavingsDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Balance: " + getBalance());
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// creating regular bank account
		System.out.println("Enter Bank Account details:");
		System.out.print("Enter account number: ");
		String accNum1 = input.nextLine();
		System.out.print("Enter account holder name: ");
		String holder1 = input.nextLine();
		System.out.print("Enter initial balance: ");
		double balance1 = input.nextDouble();
		input.nextLine(); // consume newline
		
		BankAccount account = new BankAccount(accNum1, holder1, balance1);
		
		System.out.println("\nBank Account Details:");
		account.displayAccountDetails();
		
		// creating savings account
		System.out.println("\nEnter Savings Account details:");
		System.out.print("Enter account number: ");
		String accNum2 = input.nextLine();
		System.out.print("Enter account holder name: ");
		String holder2 = input.nextLine();
		System.out.print("Enter initial balance: ");
		double balance2 = input.nextDouble();
		
		SavingsAccount savingsAccount = new SavingsAccount(accNum2, holder2, balance2);
		
		System.out.println("\nSavings Account Details:");
		savingsAccount.showSavingsDetails();
		
		input.close();
	}
}
