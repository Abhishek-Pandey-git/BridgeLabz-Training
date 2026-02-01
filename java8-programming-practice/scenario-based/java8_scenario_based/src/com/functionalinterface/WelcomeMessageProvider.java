package com.functionalinterface;

import java.util.function.Supplier;

public class WelcomeMessageProvider {
    public static void main(String[] args) {
        // Supplier to provide welcome message
        Supplier<String> getWelcomeMessage = () -> "Welcome to our Hospital Management System!";
        
        System.out.println(getWelcomeMessage.get());
        System.out.println(getWelcomeMessage.get());
    }
}
