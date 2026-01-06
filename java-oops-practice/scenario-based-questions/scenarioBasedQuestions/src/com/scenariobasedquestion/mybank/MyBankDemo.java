package com.scenariobasedquestion.mybank;

/**
 * Demo class to show account operations.
 */
public class MyBankDemo {

    public static void main(String[] args) {
        SavingsAccount savAcc = new SavingsAccount("SB1001", 5000.0);
        CurrentAccount curAcc = new CurrentAccount("CA2001", 2500.0);

        savAcc.deposit(1500.0);
        savAcc.withdraw(700.0);
        System.out.println("Savings balance: Rs." + savAcc.checkBalance());
        System.out.println("Savings interest: Rs." + savAcc.calculateInterest());

        curAcc.deposit(1000.0);
        curAcc.withdraw(300.0);
        System.out.println("Current balance: Rs." + curAcc.checkBalance());
        System.out.println("Current interest: Rs." + curAcc.calculateInterest());
    }
}
