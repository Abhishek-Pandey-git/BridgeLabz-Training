package com.functionalinterface;

// Payment Interface
interface PaymentMethod {
    void pay(double amount);
}

// UPI implementation
class UPI implements PaymentMethod {
    private String upiId;
    
    public UPI(String upiId) {
        this.upiId = upiId;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI: " + upiId);
    }
}

// Credit Card implementation
class CreditCard implements PaymentMethod {
    private String cardNumber;
    
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card: " + maskCard(cardNumber));
    }
    
    private String maskCard(String card) {
        return "XXXX-XXXX-XXXX-" + card.substring(card.length() - 4);
    }
}

// Wallet implementation
class Wallet implements PaymentMethod {
    private String walletName;
    private double balance;
    
    public Wallet(String walletName, double balance) {
        this.walletName = walletName;
        this.balance = balance;
    }
    
    @Override
    public void pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Paid Rs." + amount + " using " + walletName + " Wallet");
            System.out.println("Remaining balance: Rs." + balance);
        } else {
            System.out.println("Insufficient balance in " + walletName + " Wallet");
        }
    }
}

public class DigitalPayment {
    public static void main(String[] args) {
        PaymentMethod upi = new UPI("user@paytm");
        PaymentMethod card = new CreditCard("1234567812345678");
        PaymentMethod wallet = new Wallet("Paytm", 5000);
        
        // Make payments
        upi.pay(500);
        card.pay(1500);
        wallet.pay(2000);
        
        System.out.println();
        
        // Try another wallet payment
        wallet.pay(4000);
    }
}
