package com.exceptionhandling;

import java.util.Scanner;

// Nested try-catch handles different exceptions at different levels
public class NestedTryCatch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter array size: ");
			int size = input.nextInt();
			
			int[] array = new int[size];
			
			System.out.println("Enter " + size + " elements:");
			for (int i = 0; i < size; i++) {
				array[i] = input.nextInt();
			}
			
			System.out.print("Enter index to access: ");
			int index = input.nextInt();
			
			int element = array[index];
			
			// Inner try-catch for division operation
			try {
				System.out.print("Enter divisor: ");
				int divisor = input.nextInt();
				
				int result = element / divisor;
				System.out.println("Result: " + result);
				
			} catch (ArithmeticException e) {
				System.err.println("Cannot divide by zero!");
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid array index!");
		}
		
		input.close();
	}
}
