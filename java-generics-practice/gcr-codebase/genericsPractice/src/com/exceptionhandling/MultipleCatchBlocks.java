package com.exceptionhandling;

import java.util.Scanner;

// Demonstrates handling multiple exception types with separate catch blocks
public class MultipleCatchBlocks {
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
			
			System.out.print("Enter index to retrieve: ");
			int index = input.nextInt();
			
			// Accessing array element at user-specified index
			System.out.println("Value at index " + index + ": " + array[index]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid index!");
		} catch (NullPointerException e) {
			System.err.println("Array is not initialized!");
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
		
		input.close();
	}
}
