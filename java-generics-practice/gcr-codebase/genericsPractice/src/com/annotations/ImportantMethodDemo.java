package com.annotations;

import java.lang.reflect.Method;

class PaymentService {
    
    @ImportantMethod(level = "CRITICAL")
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);
    }
    
    @ImportantMethod
    public void refundTransaction(String transactionId) {
        System.out.println("Refunding transaction: " + transactionId);
    }
    
    @ImportantMethod(level = "MEDIUM")
    public void generateReceipt() {
        System.out.println("Generating receipt");
    }
    
    public void logActivity() {
        System.out.println("Logging activity");
    }
}

public class ImportantMethodDemo {
    
    public static void main(String[] args) {
        displayImportantMethods();
    }
    
    public static void displayImportantMethods() {
        Class<PaymentService> clazz = PaymentService.class;
        
        System.out.println("Important Methods in PaymentService:");
        System.out.println("=====================================\n");
        
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Importance Level: " + annotation.level());
                System.out.println();
            }
        }
    }
}
