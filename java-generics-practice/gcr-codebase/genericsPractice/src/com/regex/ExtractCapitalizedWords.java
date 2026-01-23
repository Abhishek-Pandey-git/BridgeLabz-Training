package com.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalizedWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter sentence: ");
		String text = input.nextLine();
		
		// Pattern to match words starting with capital letter
		String regex = "\\b[A-Z][a-z]*\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		System.out.println("Capitalized words:");
		while (matcher.find()) {
			System.out.print(matcher.group() + " ");
		}
		
		input.close();
	}
}
