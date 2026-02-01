package com.lambdaexpression;

import java.util.Comparator;

public class EmployeeSalaryComparison {
    public static void main(String[] args) {
        // Lambda to compare salaries
        Comparator<Double> compareSalary = (s1, s2) -> Double.compare(s1, s2);
        
        double salary1 = 45000;
        double salary2 = 35000;
        
        int result = compareSalary.compare(salary1, salary2);
        
        if (result > 0) {
            System.out.println("Salary 1 (Rs." + salary1 + ") is higher");
        } else if (result < 0) {
            System.out.println("Salary 2 (Rs." + salary2 + ") is higher");
        } else {
            System.out.println("Both salaries are equal");
        }
    }
}
