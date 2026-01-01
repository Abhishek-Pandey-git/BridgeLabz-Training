package com.scenariobasedquestion.bankscenario;

// BankDemo class to show bank operations
public class BankDemo {
    public static void main(String[] args) {
        // create user
        BankUser user = new BankUser("John Doe", 123);
        // start saving
        user.startSaving(1000, 5); // 5% interest
        // start checking
        user.startChecking(500);

        // deposit to saving
        user.savingAcc.depositMoney(200);
        // withdraw from checking
        user.checkingAcc.withdrawMoney(100);

        // calculate interest
        user.savingAcc.calculateInterest();

        // show accounts
        user.showAccounts();
    }
}