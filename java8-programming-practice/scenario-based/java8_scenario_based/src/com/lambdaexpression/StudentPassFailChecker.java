package com.lambdaexpression;

import java.util.function.Predicate;

public class StudentPassFailChecker {
    public static void main(String[] args) {
        // Lambda to check pass or fail
        Predicate<Integer> isPass = marks -> marks >= 40;
        
        System.out.println("Marks 55: " + (isPass.test(55) ? "Pass" : "Fail"));
        System.out.println("Marks 35: " + (isPass.test(35) ? "Pass" : "Fail"));
        System.out.println("Marks 40: " + (isPass.test(40) ? "Pass" : "Fail"));
    }
}
