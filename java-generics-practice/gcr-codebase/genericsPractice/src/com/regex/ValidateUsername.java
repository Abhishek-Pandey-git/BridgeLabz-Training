package com.regex;

import java.util.Scanner;

public class ValidateUsername {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter username: ");
		String username = input.nextLine();
		
		// Username must start with letter, contain only letters/numbers/underscore, length 5-15
		String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
		
		if (username.matches(regex)) {
			System.out.println("Valid username");
		} else {
			System.out.println("Invalid username");
		}
		
		input.close();
	}
}
