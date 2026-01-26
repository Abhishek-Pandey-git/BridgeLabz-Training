package com.csvhandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVFile {
	
	public static void main(String[] args) {
		String fileName = "employees.csv";
		
		try {
			FileWriter writer = new FileWriter(fileName);
			
			writer.append("ID,Name,Department,Salary\n");
			
			// adding employee records
			writer.append("101,John Smith,IT,75000\n");
			writer.append("102,Sarah Johnson,HR,65000\n");
			writer.append("103,Mike Brown,Finance,80000\n");
			writer.append("104,Emily Davis,IT,72000\n");
			writer.append("105,Robert Wilson,Marketing,68000\n");
			
			writer.flush();
			writer.close();
			
			System.out.println("CSV file created successfully!");
			
		} catch (IOException e) {
			System.out.println("Error writing file");
			e.printStackTrace();
		}
	}
}
