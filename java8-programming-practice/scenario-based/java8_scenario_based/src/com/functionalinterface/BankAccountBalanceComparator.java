package com.functionalinterface;

import java.util.Comparator;

class BankAccount {
    String accountNumber;
    double balance;
    
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

public class BankAccountBalanceComparator {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("ACC001", 15000);
        BankAccount acc2 = new BankAccount("ACC002", 25000);
        
        // Comparator to compare by balance
        Comparator<BankAccount> balanceComparator = (a1, a2) -> Double.compare(a1.balance, a2.balance);
        
        int result = balanceComparator.compare(acc1, acc2);
        System.out.println(result < 0 ? acc1.accountNumber + " has lower balance" : acc2.accountNumber + " has lower balance");
    }
}
