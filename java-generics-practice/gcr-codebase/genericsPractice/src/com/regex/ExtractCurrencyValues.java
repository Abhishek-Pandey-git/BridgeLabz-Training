package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter text: ");
		String text = input.nextLine();
		
		// Pattern to match currency values
		String regex = "\\$?\\d+\\.\\d{2}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		System.out.println("Currency values found:");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
		input.close();
	}
}
