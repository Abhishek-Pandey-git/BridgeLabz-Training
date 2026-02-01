package com.lambdaexpression;

import java.util.function.Consumer;

class Account {
    String accountNumber;
    String holder;
    double balance;
    
    Account(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }
}

public class AccountDetailsPrinter {
    public static void main(String[] args) {
        Account acc1 = new Account("ACC001", "John", 15000);
        Account acc2 = new Account("ACC002", "Alice", 25000);
        
        // Lambda to print account details
        Consumer<Account> printAccount = acc -> 
            System.out.println("Account: " + acc.accountNumber + ", Holder: " + acc.holder + ", Balance: Rs." + acc.balance);
        
        printAccount.accept(acc1);
        printAccount.accept(acc2);
    }
}
