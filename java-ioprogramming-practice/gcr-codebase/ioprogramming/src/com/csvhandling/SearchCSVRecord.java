package com.csvhandling;

import java.io.*;
import java.util.Scanner;

public class SearchCSVRecord {
	public static void main(String[] args) {
		String fileName = "employees.csv";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter employee name to search: ");
		String searchName = sc.nextLine();
		
		boolean found = false;
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
			reader.readLine();
			
			String line;
			while ((line = reader.readLine()) != null) {
				String[] empData = line.split(",");
				
				// check if name matches
				if (empData[1].equalsIgnoreCase(searchName)) {
					System.out.println("\nEmployee Found!");
					System.out.println("Name: " + empData[1]);
					System.out.println("Department: " + empData[2]);
					System.out.println("Salary: " + empData[3]);
					found = true;
					break;
				}
			}
			
			if (!found) {
				System.out.println("Employee not found!");
			}
			
			reader.close();
			sc.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
