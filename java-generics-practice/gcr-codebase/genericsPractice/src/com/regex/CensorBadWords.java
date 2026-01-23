package com.regex;

import java.util.Scanner;

public class CensorBadWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter text: ");
		String text = input.nextLine();
		
		// Replace bad words with ****
		String result = text.replaceAll("\\bdamn\\b", "****");
		result = result.replaceAll("\\bstupid\\b", "****");
		result = result.replaceAll("\\bbad\\b", "****");
		
		System.out.println("Censored text: " + result);
		
		input.close();
	}
}
