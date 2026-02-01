package com.lambdaexpression;

import java.util.function.BiFunction;

public class GreaterNumberFinder {
    public static void main(String[] args) {
        // Lambda to find greater number
        BiFunction<Integer, Integer, Integer> findGreater = (a, b) -> a > b ? a : b;
        
        System.out.println("Greater of 10 and 20: " + findGreater.apply(10, 20));
        System.out.println("Greater of 45 and 30: " + findGreater.apply(45, 30));
        System.out.println("Greater of 100 and 100: " + findGreater.apply(100, 100));
    }
}
