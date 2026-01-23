package com.exceptionhandling;

import java.util.Scanner;

// Finally block always executes regardless of exception occurrence
public class FinallyBlockExecution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter first number: ");
			int num1 = input.nextInt();
			
			System.out.print("Enter second number: ");
			int num2 = input.nextInt();
			
			int result = num1 / num2;
			System.out.println("Result: " + result);
			
		} catch (ArithmeticException e) {
			System.err.println("Error: Cannot divide by zero!");
		} finally {
			System.out.println("Operation completed");
			input.close();
		}
	}
}
