package com.regex;

import java.util.Scanner;

public class ValidateHexColor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter hex color code: ");
		String color = input.nextLine();
		
		// Starts with # followed by 6 hex characters
		String regex = "^#[0-9A-Fa-f]{6}$";
		
		if (color.matches(regex)) {
			System.out.println("Valid hex color");
		} else {
			System.out.println("Invalid hex color");
		}
		
		input.close();
	}
}
