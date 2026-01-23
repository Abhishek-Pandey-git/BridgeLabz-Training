package com.regex;

import java.util.Scanner;

public class ValidateSSN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter SSN: ");
		String ssn = input.nextLine();
		
		// Pattern for XXX-XX-XXXX format
		String regex = "^\\d{3}-\\d{2}-\\d{4}$";
		
		if (ssn.matches(regex)) {
			System.out.println("Valid SSN");
		} else {
			System.out.println("Invalid SSN");
		}
		
		input.close();
	}
}
