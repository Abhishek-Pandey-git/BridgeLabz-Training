package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter text: ");
		String text = input.nextLine();
		
		// Pattern for dd/mm/yyyy format
		String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		System.out.println("Dates found:");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
		input.close();
	}
}
