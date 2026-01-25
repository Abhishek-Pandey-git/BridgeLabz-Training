package com.reflections;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "default_key";
    
    public static void displayKey() {
        System.out.println("API Key: " + API_KEY);
    }
}

public class AccessStaticField {
    public static void main(String[] args) {
        try {
            Class<?> cls = Configuration.class;
            Field field = cls.getDeclaredField("API_KEY");
            
            field.setAccessible(true);
            
            System.out.println("Original value:");
            Configuration.displayKey();
            
            field.set(null, "new_secret_key_123");
            
            System.out.println("\nModified value:");
            Configuration.displayKey();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
