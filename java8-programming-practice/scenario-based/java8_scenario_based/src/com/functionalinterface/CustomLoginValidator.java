package com.functionalinterface;

@FunctionalInterface
interface LoginValidator {
    boolean validateLogin(String username, String password);
}

public class CustomLoginValidator {
    public static void main(String[] args) {
        // Custom functional interface for login validation
        LoginValidator validator = (user, pass) -> 
            user.equals("admin") && pass.equals("admin123");
        
        System.out.println("Login (admin, admin123): " + validator.validateLogin("admin", "admin123"));
        System.out.println("Login (user, pass123): " + validator.validateLogin("user", "pass123"));
    }
}
