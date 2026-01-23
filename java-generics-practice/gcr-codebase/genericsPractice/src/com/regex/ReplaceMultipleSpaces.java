package com.regex;

import java.util.Scanner;

public class ReplaceMultipleSpaces {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter text: ");
		String text = input.nextLine();
		
		// Replace multiple spaces with single space
		String result = text.replaceAll(" +", " ");
		
		System.out.println("Result: " + result);
		
		input.close();
	}
}
