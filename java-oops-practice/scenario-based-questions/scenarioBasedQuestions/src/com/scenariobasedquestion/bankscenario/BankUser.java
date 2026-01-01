package com.scenariobasedquestion.bankscenario;

// BankUser class to represent a bank user
public class BankUser {
    // user name
    String userName;
    // user id
    int userId;
    // saving account
    SavingAccount savingAcc;
    // checking account
    CheckingAccount checkingAcc;

    // constructor for bank user
    public BankUser(String userName, int userId) {
        this.userName = userName;
        this.userId = userId;
    }

    // method to start saving account
    public void startSaving(double initialBalance, double interestRate) {
        savingAcc = new SavingAccount(initialBalance, interestRate);
    }

    // method to start checking account
    public void startChecking(double initialBalance) {
        checkingAcc = new CheckingAccount(initialBalance);
    }

    // method to show accounts
    public void showAccounts() {
        System.out.println("User: " + userName + " (ID: " + userId + ")");
        if (savingAcc != null) {
            System.out.println("Saving: " + savingAcc.accountBalance);
        }
        if (checkingAcc != null) {
            System.out.println("Checking: " + checkingAcc.accountBalance);
        }
    }
}