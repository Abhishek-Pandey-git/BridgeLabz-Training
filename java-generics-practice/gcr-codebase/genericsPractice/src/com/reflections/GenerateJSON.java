package com.reflections;

import java.lang.reflect.Field;

class Product {
    private String name;
    private double price;
    private int quantity;
    
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}

public class GenerateJSON {
    
    public static String toJSON(Object obj) {
        try {
            StringBuilder json = new StringBuilder();
            json.append("{");
            
            Class<?> cls = obj.getClass();
            Field[] fields = cls.getDeclaredFields();
            
            for (int i = 0; i < fields.length; i++) {
                Field field = fields[i];
                field.setAccessible(true);
                
                String fieldName = field.getName();
                Object value = field.get(obj);
                
                json.append("\"").append(fieldName).append("\":");
                
                if (value instanceof String) {
                    json.append("\"").append(value).append("\"");
                } else {
                    json.append(value);
                }
                
                if (i < fields.length - 1) {
                    json.append(",");
                }
            }
            
            json.append("}");
            return json.toString();
            
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
    
    public static void main(String[] args) {
        Product product = new Product("Laptop", 45000.0, 5);
        
        String json = toJSON(product);
        System.out.println(json);
    }
}
