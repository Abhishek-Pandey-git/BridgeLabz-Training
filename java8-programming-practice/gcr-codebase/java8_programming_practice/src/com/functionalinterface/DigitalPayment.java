package com.functionalinterface;

// Interface for payment methods
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
        System.out.println("Paid Rs." + amount + " via UPI: " + upiId);
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
        System.out.println("Paid Rs." + amount + " via Credit Card ending with " + 
                          cardNumber.substring(cardNumber.length() - 4));
    }
}

// Wallet implementation
class Wallet implements PaymentMethod {
    private String walletName;
    
    public Wallet(String walletName) {
        this.walletName = walletName;
    }
    
    @Override
    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " via " + walletName + " Wallet");
    }
}

public class DigitalPayment {
    public static void main(String[] args) {
        PaymentMethod upi = new UPI("user@paytm");
        PaymentMethod card = new CreditCard("1234567812345678");
        PaymentMethod wallet = new Wallet("PhonePe");
        
        // Make payments
        upi.pay(500.0);
        card.pay(1200.0);
        wallet.pay(350.0);
    }
}
