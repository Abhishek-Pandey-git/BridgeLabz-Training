package com.inheritence.hierarchical;

// Checking account with withdrawal limit
public class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Amount exceeds withdrawal limit!");
            return false;
        }
        return super.withdraw(amount);
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    @Override
    public void displayAccount() {
        super.displayAccount();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
