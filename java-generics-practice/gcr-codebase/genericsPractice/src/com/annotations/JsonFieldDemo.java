package com.annotations;

import java.lang.reflect.Field;

class Person {
    
    @JsonField(name = "user_name")
    private String name;
    
    @JsonField(name = "user_age")
    private int age;
    
    @JsonField(name = "user_email")
    private String email;
    
    private String password;
    
    public Person(String name, int age, String email, String password) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
    }
}

public class JsonFieldDemo {
    
    public static String toJson(Object obj) {
        try {
            StringBuilder json = new StringBuilder();
            json.append("{");
            
            Field[] fields = obj.getClass().getDeclaredFields();
            boolean first = true;
            
            for (Field field : fields) {
                if (field.isAnnotationPresent(JsonField.class)) {
                    field.setAccessible(true);
                    
                    JsonField annotation = field.getAnnotation(JsonField.class);
                    String jsonKey = annotation.name();
                    Object value = field.get(obj);
                    
                    if (!first) {
                        json.append(",");
                    }
                    first = false;
                    
                    json.append("\"").append(jsonKey).append("\":");
                    
                    if (value instanceof String) {
                        json.append("\"").append(value).append("\"");
                    } else {
                        json.append(value);
                    }
                }
            }
            
            json.append("}");
            return json.toString();
            
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }
    
    public static void main(String[] args) {
        Person person = new Person("John Doe", 30, "john@example.com", "secret123");
        
        String json = toJson(person);
        System.out.println("JSON Output:");
        System.out.println(json);
    }
}
