package com.inheritence.hierarchical;

// Fixed deposit account with tenure (months)
public class FixedDepositAccount extends BankAccount {
    private int tenureMonths;

    public FixedDepositAccount(String accountNumber, double balance, int tenureMonths) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    @Override
    public void displayAccount() {
        super.displayAccount();
        System.out.println("Tenure (months): " + tenureMonths);
    }
}
