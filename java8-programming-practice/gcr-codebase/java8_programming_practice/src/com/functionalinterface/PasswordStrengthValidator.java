package com.functionalinterface;

interface SecurityUtils {
    // Static method for password strength validation
    static String checkPasswordStrength(String password) {
        if (password == null || password.length() < 6) {
            return "Weak";
        }
        
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasLower = password.matches(".*[a-z].*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*].*");
        
        int strength = 0;
        if (hasDigit) strength++;
        if (hasUpper) strength++;
        if (hasLower) strength++;
        if (hasSpecial) strength++;
        
        if (strength >= 3 && password.length() >= 8) {
            return "Strong";
        } else if (strength >= 2) {
            return "Medium";
        }
        return "Weak";
    }
}

public class PasswordStrengthValidator {
    public static void main(String[] args) {
        String[] passwords = {"pass", "Password1", "P@ssw0rd", "Test@123"};
        
        for (String pwd : passwords) {
            System.out.println("Password: " + pwd + " - Strength: " + 
                             SecurityUtils.checkPasswordStrength(pwd));
        }
    }
}
