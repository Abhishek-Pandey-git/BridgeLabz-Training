package com.regex;

import java.util.Scanner;

public class ValidateLicensePlate {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter license plate: ");
		String plate = input.nextLine();
		
		// Two uppercase letters followed by four digits
		String regex = "^[A-Z]{2}[0-9]{4}$";
		
		if (plate.matches(regex)) {
			System.out.println("Valid license plate");
		} else {
			System.out.println("Invalid license plate");
		}
		
		input.close();
	}
}
