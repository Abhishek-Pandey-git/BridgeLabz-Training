package com.annotations;

import java.lang.reflect.Field;

class User {
    
    @MaxLength(10)
    private String username;
    
    private String email;
    
    public User(String username, String email) {
        validateFields();
        this.username = username;
        this.email = email;
    }
    
    private void validateFields() {
        try {
            Field usernameField = this.getClass().getDeclaredField("username");
            
            if (usernameField.isAnnotationPresent(MaxLength.class)) {
                MaxLength annotation = usernameField.getAnnotation(MaxLength.class);
                int maxLength = annotation.value();
                
                if (username != null && username.length() > maxLength) {
                    throw new IllegalArgumentException(
                        "Username exceeds maximum length of " + maxLength + " characters"
                    );
                }
            }
            
        } catch (NoSuchFieldException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "User{username='" + username + "', email='" + email + "'}";
    }
}

public class MaxLengthDemo {
    public static void main(String[] args) {
        
        try {
            System.out.println("Creating user with valid username...");
            User user1 = new User("john", "john@example.com");
            System.out.println("Success: " + user1);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed: " + e.getMessage());
        }
        
        System.out.println();
        
        try {
            System.out.println("Creating user with long username...");
            User user2 = new User("johnsmith123456", "john@example.com");
            System.out.println("Success: " + user2);
        } catch (IllegalArgumentException e) {
            System.out.println("Failed: " + e.getMessage());
        }
    }
}
