package com.reflections;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class Employee {
    private String name;
    private int age;
    private double salary;
    
    public Employee() {
    }
    
    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class CustomObjectMapper {
    
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) {
        try {
            T obj = clazz.getDeclaredConstructor().newInstance();
            
            for (Map.Entry<String, Object> entry : properties.entrySet()) {
                String fieldName = entry.getKey();
                Object value = entry.getValue();
                
                try {
                    Field field = clazz.getDeclaredField(fieldName);
                    field.setAccessible(true);
                    field.set(obj, value);
                } catch (NoSuchFieldException e) {
                    System.out.println("Field not found: " + fieldName);
                }
            }
            
            return obj;
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
    
    public static void main(String[] args) {
        Map<String, Object> data = new HashMap<>();
        data.put("name", "Alice");
        data.put("age", 30);
        data.put("salary", 50000.0);
        
        Employee emp = toObject(Employee.class, data);
        
        System.out.println(emp);
    }
}
