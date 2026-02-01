package com.functionalinterface;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class CurrentDateTimeProvider {
    public static void main(String[] args) {
        // Supplier to provide current date and time
        Supplier<LocalDateTime> getCurrentDateTime = () -> LocalDateTime.now();
        
        System.out.println("Current DateTime 1: " + getCurrentDateTime.get());
        System.out.println("Current DateTime 2: " + getCurrentDateTime.get());
        System.out.println("Current DateTime 3: " + getCurrentDateTime.get());
    }
}
