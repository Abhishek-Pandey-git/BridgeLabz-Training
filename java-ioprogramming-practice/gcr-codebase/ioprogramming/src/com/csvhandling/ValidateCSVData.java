package com.csvhandling;

import java.io.*;
import java.util.regex.*;

public class ValidateCSVData {
	
	public static void main(String[] args) {
		
		String file = "contacts.csv";
		
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		String phoneRegex = "^\\d{10}$";
		
		Pattern emailPattern = Pattern.compile(emailRegex);
		Pattern phonePattern = Pattern.compile(phoneRegex);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			br.readLine();
			
			String line;
			int lineNumber = 1;
			
			while ((line = br.readLine()) != null) {
				lineNumber++;
				String[] data = line.split(",");
				
				boolean isValid = true;
				String errors = "";
				
				// validate email format
				Matcher emailMatcher = emailPattern.matcher(data[2]);
				if (!emailMatcher.matches()) {
					isValid = false;
					errors += "Invalid email; ";
				}
				
				Matcher phoneMatcher = phonePattern.matcher(data[3]);
				if (!phoneMatcher.matches()) {
					isValid = false;
					errors += "Invalid phone number; ";
				}
				
				if (!isValid) {
					System.out.println("Error in row " + lineNumber + ": " + errors);
					System.out.println("Data: " + line);
					System.out.println();
				}
			}
			
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
