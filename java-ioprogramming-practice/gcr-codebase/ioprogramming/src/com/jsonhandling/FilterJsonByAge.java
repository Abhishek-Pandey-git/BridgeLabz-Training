package com.jsonhandling;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FilterJsonByAge {
    
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        
        try (FileReader reader = new FileReader("users.json")) {
            JSONArray users = (JSONArray) parser.parse(reader);
            
            System.out.println("Users older than 25 years:");
            System.out.println("==========================");
            
            for (Object obj : users) {
                JSONObject user = (JSONObject) obj;
                long age = (long) user.get("age");
                
                if (age > 25) {
                    System.out.println("Name: " + user.get("name"));
                    System.out.println("Age: " + age);
                    System.out.println("Email: " + user.get("email"));
                    System.out.println();
                }
            }
            
        } catch (IOException | ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
