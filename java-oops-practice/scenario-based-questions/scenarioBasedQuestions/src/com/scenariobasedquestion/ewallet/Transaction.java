package com.scenariobasedquestion.ewallet;

public class Transaction {
    private String from;
    private String to;
    private double amount;
    private String type;

    public Transaction(String from, String to, double amount, String type) {
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.type = type;
    }

    public void print() {
        System.out.println("Type: " + type + " | From: " + from + " | To: " + to + " | Amount: " + amount);
    }
}

