package com.objectmodelling.assistedproblems;

public class BankAssociationDemo {
    public static void main(String[] args) {
        Bank bank = new Bank("First National Bank");

        Customer alice = new Customer("Alice");
        Customer bob = new Customer("Bob");

        // Customers open accounts via the Bank (association)
        alice.openAccount(bank, 500.0);
        bob.openAccount(bank, 1200.0);
        // Alice opens a second account
        alice.openAccount(bank, 150.0);

        // Show bank accounts
        bank.showAllAccounts();
        System.out.println();

        // Customers view their balances
        alice.viewBalances();
        System.out.println();
        bob.viewBalances();
    }
}
