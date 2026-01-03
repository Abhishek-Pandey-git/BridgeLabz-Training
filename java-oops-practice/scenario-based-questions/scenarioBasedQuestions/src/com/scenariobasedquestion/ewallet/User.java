package com.scenariobasedquestion.ewallet;

public class User {
    private String id;
    private String name;
    private Wallet wallet;

    public User(String id, String name, Wallet wallet) {
        this.id = id;
        this.name = name;
        this.wallet = wallet;
        this.wallet.setOwner(this);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void display() {
        System.out.println("User ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Wallet Balance: " + wallet.getBalance());
    }
}

