package com.functionalinterface;

import java.util.function.Consumer;

public class EmployeeLoginLogger {
    public static void main(String[] args) {
        // Consumer to log employee login activity
        Consumer<String> logActivity = empName -> 
            System.out.println("Employee " + empName + " logged in at " + java.time.LocalTime.now());
        
        logActivity.accept("John");
        logActivity.accept("Alice");
        logActivity.accept("Bob");
    }
}
