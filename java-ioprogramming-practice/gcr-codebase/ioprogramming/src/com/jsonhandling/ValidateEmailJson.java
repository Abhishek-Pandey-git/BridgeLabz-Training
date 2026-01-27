package com.jsonhandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ValidateEmailJson {
    
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);
    
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        
        try (FileReader reader = new FileReader("users.json")) {
            JSONArray users = (JSONArray) parser.parse(reader);
            
            System.out.println("Email Validation Results:");
            System.out.println("=========================");
            
            for (Object obj : users) {
                JSONObject user = (JSONObject) obj;
                String email = (String) user.get("email");
                boolean isValid = EMAIL_PATTERN.matcher(email).matches();
                
                System.out.println("Name: " + user.get("name"));
                System.out.println("Email: " + email);
                System.out.println("Valid: " + (isValid ? "✓" : "✗"));
                System.out.println();
            }
            
        } catch (IOException | ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
