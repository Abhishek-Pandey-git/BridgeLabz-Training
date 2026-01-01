package com.objectmodelling.assistedproblems;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // package-private: only Bank should call this when opening an account
    void addAccount(Account a) {
        if (a != null) accounts.add(a);
    }

    public Account openAccount(Bank bank, double initialBalance) {
        return bank.openAccount(this, initialBalance);
    }

    public void viewBalances() {
        System.out.println("Customer: " + name);
        if (accounts.isEmpty()) {
            System.out.println("  (no accounts)");
            return;
        }
        for (Account a : accounts) {
            System.out.println(" - " + a);
        }
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }
}
