package com.functionalinterface;

@FunctionalInterface
interface LoanEligibilityChecker {
    boolean checkEligibility(double income, int creditScore);
}

public class CustomLoanEligibility {
    public static void main(String[] args) {
        // Custom functional interface for loan eligibility
        LoanEligibilityChecker checker = (income, score) -> income >= 30000 && score >= 700;
        
        System.out.println("Income 35000, Score 750: " + checker.checkEligibility(35000, 750));
        System.out.println("Income 25000, Score 650: " + checker.checkEligibility(25000, 650));
    }
}
