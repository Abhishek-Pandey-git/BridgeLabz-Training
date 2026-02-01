package com.lambdaexpression;

import java.util.function.Consumer;

public class StudentWelcomeMessage {
    public static void main(String[] args) {
        // Lambda to print welcome message
        Consumer<String> welcomeStudent = name -> 
            System.out.println("Welcome " + name + " to our school!");
        
        welcomeStudent.accept("John");
        welcomeStudent.accept("Alice");
        welcomeStudent.accept("Bob");
    }
}
