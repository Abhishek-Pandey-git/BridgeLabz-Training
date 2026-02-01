package com.lambdaexpression;

import java.util.function.Predicate;

public class PromotionEligibilityChecker {
    public static void main(String[] args) {
        // Lambda to check promotion eligibility
        Predicate<Integer> isEligible = experience -> experience > 3;
        
        System.out.println("Experience 5 years: " + (isEligible.test(5) ? "Eligible" : "Not Eligible"));
        System.out.println("Experience 2 years: " + (isEligible.test(2) ? "Eligible" : "Not Eligible"));
        System.out.println("Experience 4 years: " + (isEligible.test(4) ? "Eligible" : "Not Eligible"));
    }
}
