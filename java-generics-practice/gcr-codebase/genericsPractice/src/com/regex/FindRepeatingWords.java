package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter text: ");
		String text = input.nextLine();
		
		// Pattern to find consecutive repeated words
		String regex = "\\b(\\w+)\\s+\\1\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		System.out.println("Repeating words found:");
		while (matcher.find()) {
			System.out.println(matcher.group(1));
		}
		
		input.close();
	}
}
