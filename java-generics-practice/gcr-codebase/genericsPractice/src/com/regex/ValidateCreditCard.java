package com.regex;

import java.util.Scanner;

public class ValidateCreditCard {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter credit card number: ");
		String card = input.nextLine();
		
		// Visa starts with 4, MasterCard starts with 5, both 16 digits
		String visaRegex = "^4[0-9]{15}$";
		String masterRegex = "^5[0-9]{15}$";
		
		if (card.matches(visaRegex)) {
			System.out.println("Valid Visa card");
		} else if (card.matches(masterRegex)) {
			System.out.println("Valid MasterCard");
		} else {
			System.out.println("Invalid card number");
		}
		
		input.close();
	}
}
