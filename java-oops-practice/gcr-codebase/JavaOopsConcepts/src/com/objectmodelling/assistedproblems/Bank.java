package com.objectmodelling.assistedproblems;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Account openAccount(Customer customer, double initialBalance) {
        if (customer == null) throw new IllegalArgumentException("Customer required");
        Account a = new Account(this, customer, initialBalance);
        accounts.add(a);
        customer.addAccount(a);
        return a;
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }

    public void showAllAccounts() {
        System.out.println("Bank: " + name);
        if (accounts.isEmpty()) {
            System.out.println("  (no accounts)");
            return;
        }
        for (Account a : accounts) {
            System.out.println(" - " + a + " (owner: " + a.getOwner().getName() + ")");
        }
    }
}
