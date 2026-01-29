package com.functionalinterface;

interface PaymentProcessor {
    void processPayment(double amount);
    
    // Default method added later
    default void refund(double amount) {
        System.out.println("Processing refund of Rs." + amount);
        System.out.println("Refund completed successfully");
    }
}

class PaytmGateway implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Paytm: Payment of Rs." + amount + " processed");
    }
}

class RazorpayGateway implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Razorpay: Payment of Rs." + amount + " processed");
    }
}

class StripeGateway implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe: Payment of Rs." + amount + " processed");
    }
    
    // Override default method for custom refund
    @Override
    public void refund(double amount) {
        System.out.println("Stripe: Custom refund of Rs." + amount);
    }
}

public class PaymentGatewayIntegration {
    public static void main(String[] args) {
        PaymentProcessor paytm = new PaytmGateway();
        PaymentProcessor razorpay = new RazorpayGateway();
        PaymentProcessor stripe = new StripeGateway();
        
        paytm.processPayment(1000);
        paytm.refund(200);
        
        System.out.println();
        
        razorpay.processPayment(1500);
        razorpay.refund(300);
        
        System.out.println();
        
        stripe.processPayment(2000);
        stripe.refund(500);
    }
}
