package com.jsonhandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class MergeJsonFiles {
    
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        
        try (FileReader reader1 = new FileReader("file1.json");
             FileReader reader2 = new FileReader("file2.json")) {
            
            JSONObject json1 = (JSONObject) parser.parse(reader1);
            JSONObject json2 = (JSONObject) parser.parse(reader2);
            
            JSONObject merged = new JSONObject();
            merged.putAll(json1);
            merged.putAll(json2);
            
            try (FileWriter writer = new FileWriter("merged.json")) {
                writer.write(merged.toJSONString());
                System.out.println("Files merged successfully!");
                System.out.println("Output: merged.json");
                System.out.println("\nMerged Content:");
                System.out.println(merged.toJSONString());
            }
            
        } catch (IOException | ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
