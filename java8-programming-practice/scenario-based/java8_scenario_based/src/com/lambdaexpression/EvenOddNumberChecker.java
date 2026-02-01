package com.lambdaexpression;

import java.util.function.Predicate;

public class EvenOddNumberChecker {
    public static void main(String[] args) {
        // Lambda to check even or odd
        Predicate<Integer> isEven = num -> num % 2 == 0;
        
        System.out.println("10 is " + (isEven.test(10) ? "Even" : "Odd"));
        System.out.println("15 is " + (isEven.test(15) ? "Even" : "Odd"));
        System.out.println("22 is " + (isEven.test(22) ? "Even" : "Odd"));
    }
}
