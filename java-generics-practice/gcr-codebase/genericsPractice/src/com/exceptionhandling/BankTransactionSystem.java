package com.exceptionhandling;

import java.util.Scanner;

// Bank account class with withdrawal validation
class BankAccount {
	private double balance;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
		// Validate withdrawal amount and balance
		if (amount < 0) {
			throw new IllegalArgumentException("Invalid amount!");
		}
		
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance!");
		}
		
		balance -= amount;
		System.out.println("Withdrawal successful, new balance: " + balance);
	}
	
	public double getBalance() {
		return balance;
	}
}

public class BankTransactionSystem {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter initial balance: ");
			double initialBalance = input.nextDouble();
			
			BankAccount account = new BankAccount(initialBalance);
			System.out.println("Current balance: " + account.getBalance());
			
			System.out.print("Enter withdrawal amount: ");
			double amount = input.nextDouble();
			
			account.withdraw(amount);
			
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		
		input.close();
	}
}
