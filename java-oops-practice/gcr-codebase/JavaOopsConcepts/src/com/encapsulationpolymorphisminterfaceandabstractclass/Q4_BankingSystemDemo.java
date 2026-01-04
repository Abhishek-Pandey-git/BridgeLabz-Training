package com.encapsulationpolymorphisminterfaceandabstractclass;

import java.util.ArrayList;

//banking system demo
public class Q4_BankingSystemDemo {
    
    public static void main(String[] args) {
        
        //creating list of accounts
        ArrayList<Q4_BankAccount> accounts = new ArrayList<>();
        
        //creating savings accounts
        Q4_SavingsAccount savAcc1 = new Q4_SavingsAccount("SAV001", "Ravi Kumar", 25000, 4.5);
        Q4_SavingsAccount savAcc2 = new Q4_SavingsAccount("SAV002", "Priya Sharma", 8000, 4.5);
        
        //creating current accounts
        Q4_CurrentAccount currAcc1 = new Q4_CurrentAccount("CUR001", "Amit Patel", 75000, 500);
        Q4_CurrentAccount currAcc2 = new Q4_CurrentAccount("CUR002", "Sneha Gupta", 30000, 500);
        
        accounts.add(savAcc1);
        accounts.add(savAcc2);
        accounts.add(currAcc1);
        accounts.add(currAcc2);
        
        System.out.println("Banking System");
        System.out.println("==============");
        
        //using polymorphism
        for(int i=0; i<accounts.size(); i++) {
            Q4_BankAccount acc = accounts.get(i);
            System.out.println("Account Number: " + acc.getAccountNumber());
            System.out.println("Holder Name: " + acc.getHolderName());
            System.out.println("Balance: Rs." + acc.getBalance());
            System.out.println("Interest: Rs." + acc.calculateInterest());
            
            //testing deposit
            acc.deposit(5000);
            System.out.println("New Balance: Rs." + acc.getBalance());
            
            //checking loan eligibility
            if(acc instanceof Q4_Loanable) {
                Q4_Loanable loan = (Q4_Loanable)acc;
                System.out.println("Loan Eligible: " + loan.calculateLoanEligibility());
                loan.applyForLoan(50000);
            }
            
            System.out.println("-------------------");
        }
    }
}
