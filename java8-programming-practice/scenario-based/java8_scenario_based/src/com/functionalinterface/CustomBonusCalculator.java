package com.functionalinterface;

@FunctionalInterface
interface BonusCalculator {
    double calculateBonus(double salary);
}

public class CustomBonusCalculator {
    public static void main(String[] args) {
        // Custom functional interface for bonus calculation
        BonusCalculator bonusCalc = salary -> salary * 0.1;
        
        System.out.println("Salary Rs.30000: Bonus Rs." + bonusCalc.calculateBonus(30000));
        System.out.println("Salary Rs.50000: Bonus Rs." + bonusCalc.calculateBonus(50000));
    }
}
