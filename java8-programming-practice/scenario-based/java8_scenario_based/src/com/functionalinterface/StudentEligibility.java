package com.functionalinterface;

import java.util.function.Predicate;

public class StudentEligibility {
    public static void main(String[] args) {
        // Predicate to check attendance eligibility
        Predicate<Integer> isEligible = attendance -> attendance >= 75;
        
        System.out.println("Student 1 (80% attendance): " + isEligible.test(80));
        System.out.println("Student 2 (70% attendance): " + isEligible.test(70));
        System.out.println("Student 3 (75% attendance): " + isEligible.test(75));
    }
}
