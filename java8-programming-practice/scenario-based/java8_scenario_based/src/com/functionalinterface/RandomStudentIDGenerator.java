package com.functionalinterface;

import java.util.Random;
import java.util.function.Supplier;

public class RandomStudentIDGenerator {
    public static void main(String[] args) {
        // Supplier to generate random student ID
        Supplier<String> generateID = () -> "STU" + (1000 + new Random().nextInt(9000));
        
        System.out.println("Student ID 1: " + generateID.get());
        System.out.println("Student ID 2: " + generateID.get());
        System.out.println("Student ID 3: " + generateID.get());
    }
}
