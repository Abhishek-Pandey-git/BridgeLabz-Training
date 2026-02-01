package com.lambdaexpression;

@FunctionalInterface
interface InterestCalculator {
    double calculate(double principal, double rate, double time);
}

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Lambda to calculate simple interest
        InterestCalculator calculateSI = (p, r, t) -> (p * r * t) / 100;
        
        System.out.println("P=10000, R=5%, T=2 years: SI = Rs." + calculateSI.calculate(10000, 5, 2));
        System.out.println("P=25000, R=7%, T=3 years: SI = Rs." + calculateSI.calculate(25000, 7, 3));
        System.out.println("P=50000, R=6%, T=1 year: SI = Rs." + calculateSI.calculate(50000, 6, 1));
    }
}
