package com.csvhandling;

import java.io.*;
import java.util.*;

public class DetectDuplicatesInCSV {
	
	public static void main(String[] args) {
		String file = "students.csv";
		
		Map<String, Integer> idCount = new HashMap<>();
		List<String> allLines = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			String header = br.readLine();
			
			String line;
			while ((line = br.readLine()) != null) {
				allLines.add(line);
				
				String[] data = line.split(",");
				String id = data[0];
				
				if (idCount.containsKey(id)) {
					idCount.put(id, idCount.get(id) + 1);
				} else {
					idCount.put(id, 1);
				}
			}
			
			br.close();
			
			System.out.println("Duplicate Records:");
			System.out.println("==================");
			
			// check for duplicates
			for (String record : allLines) {
				String[] data = record.split(",");
				String id = data[0];
				
				if (idCount.get(id) > 1) {
					System.out.println(record);
				}
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
