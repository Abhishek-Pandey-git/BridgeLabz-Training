package com.lambdaexpression;

import java.util.function.Function;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        // Lambda to calculate bonus
        Function<Double, Double> calculateBonus = salary -> 
            salary > 30000 ? salary * 0.1 : 0;
        
        System.out.println("Salary 35000: Bonus Rs." + calculateBonus.apply(35000.0));
        System.out.println("Salary 28000: Bonus Rs." + calculateBonus.apply(28000.0));
        System.out.println("Salary 45000: Bonus Rs." + calculateBonus.apply(45000.0));
    }
}
