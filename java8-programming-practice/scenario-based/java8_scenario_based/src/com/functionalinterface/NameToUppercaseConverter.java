package com.functionalinterface;

import java.util.function.Function;

public class NameToUppercaseConverter {
    public static void main(String[] args) {
        // Function to convert name to uppercase
        Function<String, String> toUpperCase = name -> name.toUpperCase();
        
        System.out.println("john doe -> " + toUpperCase.apply("john doe"));
        System.out.println("alice smith -> " + toUpperCase.apply("alice smith"));
        System.out.println("bob wilson -> " + toUpperCase.apply("bob wilson"));
    }
}
