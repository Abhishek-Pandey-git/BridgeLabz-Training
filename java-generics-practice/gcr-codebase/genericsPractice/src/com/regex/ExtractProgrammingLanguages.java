package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguages {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter text: ");
		String text = input.nextLine();
		
		// Pattern to match common programming languages
		String regex = "\\b(Java|Python|JavaScript|Go|C|C\\+\\+|Ruby|PHP|Swift|Kotlin)\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		System.out.println("Programming languages found:");
		while (matcher.find()) {
			System.out.print(matcher.group() + " ");
		}
		
		input.close();
	}
}
