package com.jsonhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class ConvertCsvToJson {
    
    public static void main(String[] args) {
        JSONArray jsonArray = new JSONArray();
        
        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            String headerLine = br.readLine();
            if (headerLine == null) {
                System.out.println("Empty CSV file");
                return;
            }
            
            String[] headers = headerLine.split(",");
            String line;
            
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                JSONObject jsonObject = new JSONObject();
                
                for (int i = 0; i < headers.length && i < values.length; i++) {
                    jsonObject.put(headers[i].trim(), values[i].trim());
                }
                
                jsonArray.add(jsonObject);
            }
            
            try (FileWriter writer = new FileWriter("output.json")) {
                writer.write(jsonArray.toJSONString());
                System.out.println("CSV converted to JSON successfully!");
                System.out.println("\nJSON Content:");
                System.out.println(jsonArray.toJSONString());
            }
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
