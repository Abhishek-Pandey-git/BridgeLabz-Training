package com.jsonhandling;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJsonFile {
    
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        
        try (FileReader reader = new FileReader("data.json")) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            
            System.out.println("Keys and Values from JSON:");
            System.out.println("==========================");
            
            for (Object key : jsonObject.keySet()) {
                Object value = jsonObject.get(key);
                System.out.println(key + " : " + value);
            }
            
        } catch (IOException | ParseException e) {
            System.out.println("Error reading JSON file: " + e.getMessage());
        }
    }
}
