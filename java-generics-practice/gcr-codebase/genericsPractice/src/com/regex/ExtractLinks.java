package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter text: ");
		String text = input.nextLine();
		
		// Pattern to match http and https links
		String regex = "https?://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		System.out.println("Links found:");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
		input.close();
	}
}
