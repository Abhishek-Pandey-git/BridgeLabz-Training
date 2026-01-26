package com.csvhandling;

import java.io.*;

public class ReadCSVFile {
	public static void main(String[] args) {
		String file = "students.csv";
		String line = "";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			line = br.readLine();
			
			System.out.println("Student Records:");
			System.out.println("================");
			
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				// printing student data
				System.out.println("ID: " + data[0]);
				System.out.println("Name: " + data[1]);
				System.out.println("Age: " + data[2]);
				System.out.println("Marks: " + data[3]);
				System.out.println("----------------");
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
