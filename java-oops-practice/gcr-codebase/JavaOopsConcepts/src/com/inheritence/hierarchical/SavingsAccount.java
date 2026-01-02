package com.inheritence.hierarchical;

// Savings account with interest rate
public class SavingsAccount extends BankAccount {
    private double interestRate; // percent

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return balance * interestRate / 100.0;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    @Override
    public void displayAccount() {
        super.displayAccount();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
