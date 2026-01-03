package com.scenariobasedquestion.ewallet;

// Simple transfer interface
public interface Transferrable {
    boolean transferTo(User receiver, double amount);
}
