package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Try-with-resources automatically closes BufferedReader after use
public class TryWithResources {
	public static void main(String[] args) {
		
		try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))) {
			String firstLine = reader.readLine();
			System.out.println("First line: " + firstLine);
			
		} catch (IOException e) {
			System.err.println("Error reading file");
		}
	}
}
