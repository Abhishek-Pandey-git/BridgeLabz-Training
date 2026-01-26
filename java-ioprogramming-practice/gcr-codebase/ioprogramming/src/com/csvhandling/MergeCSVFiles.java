package com.csvhandling;

import java.io.*;
import java.util.*;

public class MergeCSVFiles {
	
	public static void main(String[] args) {
		
		String file1 = "students1.csv";
		String file2 = "students2.csv";
		String outputFile = "students_merged.csv";
		
		Map<String, String[]> data1 = new HashMap<>();
		Map<String, String[]> data2 = new HashMap<>();
		
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(file1));
			br1.readLine();
			
			String line;
			while ((line = br1.readLine()) != null) {
				String[] parts = line.split(",");
				data1.put(parts[0], parts);
			}
			br1.close();
			
			BufferedReader br2 = new BufferedReader(new FileReader(file2));
			br2.readLine();
			
			while ((line = br2.readLine()) != null) {
				String[] parts = line.split(",");
				data2.put(parts[0], parts);
			}
			br2.close();
			
			FileWriter writer = new FileWriter(outputFile);
			writer.write("ID,Name,Age,Marks,Grade\n");
			
			// merge based on ID
			for (String id : data1.keySet()) {
				String[] d1 = data1.get(id);
				String[] d2 = data2.get(id);
				
				if (d2 != null) {
					writer.write(id + "," + d1[1] + "," + d1[2] + "," + d2[1] + "," + d2[2] + "\n");
				}
			}
			
			writer.close();
			
			System.out.println("CSV files merged successfully!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
