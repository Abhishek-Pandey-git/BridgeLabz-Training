package com.regex;

import java.util.Scanner;

public class ValidateIPAddress {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter IP address: ");
		String ip = input.nextLine();
		
		// Pattern for IPv4 address
		String regex = "^([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
		               "([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
		               "([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\." +
		               "([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
		
		if (ip.matches(regex)) {
			System.out.println("Valid IP address");
		} else {
			System.out.println("Invalid IP address");
		}
		
		input.close();
	}
}
