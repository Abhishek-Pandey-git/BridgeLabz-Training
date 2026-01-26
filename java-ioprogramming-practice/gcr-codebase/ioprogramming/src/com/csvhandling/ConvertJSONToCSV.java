package com.csvhandling;

import java.io.*;
import org.json.*;

public class ConvertJSONToCSV {
	
	public static void main(String[] args) {
		
		String jsonFile = "students.json";
		String csvFile = "students_from_json.csv";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(jsonFile));
			StringBuilder jsonContent = new StringBuilder();
			String line;
			
			while ((line = br.readLine()) != null) {
				jsonContent.append(line);
			}
			br.close();
			
			JSONArray jsonArray = new JSONArray(jsonContent.toString());
			
			FileWriter writer = new FileWriter(csvFile);
			writer.write("ID,Name,Age,Marks\n");
			
			// convert JSON to CSV
			for (int i = 0; i < jsonArray.length(); i++) {
				JSONObject student = jsonArray.getJSONObject(i);
				
				writer.write(student.getString("id") + ",");
				writer.write(student.getString("name") + ",");
				writer.write(student.getInt("age") + ",");
				writer.write(student.getInt("marks") + "\n");
			}
			
			writer.close();
			
			System.out.println("JSON converted to CSV successfully!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void convertCSVToJSON() {
		String csvFile = "students.csv";
		String jsonFile = "students_from_csv.json";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(csvFile));
			br.readLine();
			
			JSONArray jsonArray = new JSONArray();
			
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				
				JSONObject student = new JSONObject();
				student.put("id", data[0]);
				student.put("name", data[1]);
				student.put("age", Integer.parseInt(data[2]));
				student.put("marks", Integer.parseInt(data[3]));
				
				jsonArray.put(student);
			}
			
			br.close();
			
			FileWriter writer = new FileWriter(jsonFile);
			writer.write(jsonArray.toString(4));
			writer.close();
			
			System.out.println("CSV converted to JSON successfully!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
