package com.scenariobasedquestion.mybank;

/**
 * Simple interface for basic account operations.
 */
public interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}