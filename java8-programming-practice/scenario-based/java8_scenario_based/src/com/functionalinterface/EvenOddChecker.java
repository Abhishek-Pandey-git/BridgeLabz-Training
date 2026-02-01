package com.functionalinterface;

import java.util.function.Predicate;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Predicate to check even number
        Predicate<Integer> isEven = num -> num % 2 == 0;
        
        System.out.println("10 is even: " + isEven.test(10));
        System.out.println("15 is even: " + isEven.test(15));
        System.out.println("22 is even: " + isEven.test(22));
    }
}
