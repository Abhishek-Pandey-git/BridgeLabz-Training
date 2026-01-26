package com.csvhandling;

import java.io.*;

public class CountCSVRows {
	public static void main(String[] args) {
		
		String fileName = "students.csv";
		int count = 0;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
			String line = reader.readLine();
			
			while ((line = reader.readLine()) != null) {
				count++;
			}
			
			reader.close();
			
			// displaying total count
			System.out.println("Total number of records: " + count);
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
