package com.exceptionhandling;

import java.util.Scanner;

// Demonstrates throw keyword to raise exception and throws keyword to propagate it
public class ThrowVsThrows {
	
	public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
		// Validate input and throw exception if invalid
		if (amount < 0 || rate < 0) {
			throw new IllegalArgumentException("Amount and rate must be positive");
		}
		
		return (amount * rate * years) / 100;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter amount: ");
			double amount = input.nextDouble();
			
			System.out.print("Enter rate: ");
			double rate = input.nextDouble();
			
			System.out.print("Enter years: ");
			int years = input.nextInt();
			
			double interest = calculateInterest(amount, rate, years);
			System.out.println("Calculated interest: " + interest);
			
		} catch (IllegalArgumentException e) {
			System.err.println("Invalid input: " + e.getMessage());
		}
		
		input.close();
	}
}
