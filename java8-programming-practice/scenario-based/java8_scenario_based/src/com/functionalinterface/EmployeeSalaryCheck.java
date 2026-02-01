package com.functionalinterface;

import java.util.function.Predicate;

public class EmployeeSalaryCheck {
    public static void main(String[] args) {
        // Predicate to check salary threshold
        Predicate<Double> isHighSalary = salary -> salary > 30000;
        
        System.out.println("Employee 1 (Rs.35000): " + isHighSalary.test(35000.0));
        System.out.println("Employee 2 (Rs.28000): " + isHighSalary.test(28000.0));
        System.out.println("Employee 3 (Rs.40000): " + isHighSalary.test(40000.0));
    }
}
