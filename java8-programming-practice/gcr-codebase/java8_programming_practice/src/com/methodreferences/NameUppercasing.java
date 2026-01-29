package com.methodreferences;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        // Employee names for HR letter
        List<String> employees = Arrays.asList(
            "john smith",
            "alice johnson",
            "bob wilson",
            "emma davis",
            "michael brown"
        );
        
        // Convert to uppercase using method reference
        List<String> uppercaseNames = employees.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
        
        System.out.println("Original Names:");
        employees.forEach(System.out::println);
        
        System.out.println("\nUppercase Names for HR Letter:");
        uppercaseNames.forEach(System.out::println);
    }
}
