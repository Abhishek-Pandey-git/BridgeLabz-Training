package com.csvhandling;

import java.io.*;
import java.util.*;

public class ModifyCSVFile {
	
	public static void main(String[] args) {
		String inputFile = "employees.csv";
		String outputFile = "employees_updated.csv";
		
		List<String> updatedData = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(inputFile));
			
			String header = br.readLine();
			updatedData.add(header);
			
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				
				if (data[2].equals("IT")) {
					double salary = Double.parseDouble(data[3]);
					salary = salary + (salary * 0.10);
					data[3] = String.valueOf(salary);
				}
				
				updatedData.add(String.join(",", data));
			}
			
			br.close();
			
			FileWriter writer = new FileWriter(outputFile);
			// writing updated records
			for (String record : updatedData) {
				writer.write(record + "\n");
			}
			
			writer.close();
			
			System.out.println("File updated successfully!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
