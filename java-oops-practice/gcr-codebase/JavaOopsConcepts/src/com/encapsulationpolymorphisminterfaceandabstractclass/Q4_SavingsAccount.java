package com.encapsulationpolymorphisminterfaceandabstractclass;

//savings account class
public class Q4_SavingsAccount extends Q4_BankAccount implements Q4_Loanable {
    
    private double interestRate;
    
    public Q4_SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }
    
    @Override
    public double calculateInterest() {
        //simple interest calculation
        return getBalance() * interestRate / 100;
    }
    
    @Override
    public void applyForLoan(double amount) {
        if(calculateLoanEligibility()) {
            System.out.println("Loan approved for Rs." + amount);
        } else {
            System.out.println("Loan not approved due to low balance");
        }
    }
    
    @Override
    public boolean calculateLoanEligibility() {
        //eligible if balance is more than 10000
        return getBalance() > 10000;
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
