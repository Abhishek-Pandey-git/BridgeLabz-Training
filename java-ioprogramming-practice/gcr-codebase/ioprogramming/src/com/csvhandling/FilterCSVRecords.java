package com.csvhandling;

import java.io.*;

public class FilterCSVRecords {
	
	public static void main(String[] args) {
		
		String file = "students.csv";
		String line;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			br.readLine();
			
			System.out.println("Students with marks > 80:");
			System.out.println("==========================");
			
			while ((line = br.readLine()) != null) {
				String[] studentData = line.split(",");
				
				int marks = Integer.parseInt(studentData[3]);
				
				if (marks > 80) {
					// print qualifying students
					System.out.println("ID: " + studentData[0] + ", Name: " + studentData[1] + 
							", Age: " + studentData[2] + ", Marks: " + studentData[3]);
				}
			}
			
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
