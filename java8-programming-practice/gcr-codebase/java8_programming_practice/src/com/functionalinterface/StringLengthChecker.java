package com.functionalinterface;

import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        // Function to check message length
        Function<String, Integer> lengthChecker = String::length;
        
        String message1 = "Hello World";
        String message2 = "This is a very long message that exceeds the character limit";
        
        int limit = 50;
        
        System.out.println("Message 1: " + message1);
        System.out.println("Length: " + lengthChecker.apply(message1));
        System.out.println("Exceeds limit? " + (lengthChecker.apply(message1) > limit));
        
        System.out.println("\nMessage 2: " + message2);
        System.out.println("Length: " + lengthChecker.apply(message2));
        System.out.println("Exceeds limit? " + (lengthChecker.apply(message2) > limit));
    }
}
