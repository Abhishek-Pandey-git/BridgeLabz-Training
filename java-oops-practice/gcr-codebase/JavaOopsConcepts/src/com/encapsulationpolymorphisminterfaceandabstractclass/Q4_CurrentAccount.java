package com.encapsulationpolymorphisminterfaceandabstractclass;

//current account class
public class Q4_CurrentAccount extends Q4_BankAccount implements Q4_Loanable {
    
    private double maintenanceCharge;
    
    public Q4_CurrentAccount(String accountNumber, String holderName, double balance, double maintenanceCharge) {
        super(accountNumber, holderName, balance);
        this.maintenanceCharge = maintenanceCharge;
    }
    
    @Override
    public double calculateInterest() {
        //current account has minimal interest
        return getBalance() * 0.5 / 100;
    }
    
    @Override
    public void applyForLoan(double amount) {
        if(calculateLoanEligibility()) {
            System.out.println("Business loan approved for Rs." + amount);
        } else {
            System.out.println("Loan rejected - insufficient balance");
        }
    }
    
    @Override
    public boolean calculateLoanEligibility() {
        //eligible if balance is more than 50000
        return getBalance() > 50000;
    }
    
    public double getMaintenanceCharge() {
        return maintenanceCharge;
    }
    
    public void setMaintenanceCharge(double maintenanceCharge) {
        this.maintenanceCharge = maintenanceCharge;
    }
}
