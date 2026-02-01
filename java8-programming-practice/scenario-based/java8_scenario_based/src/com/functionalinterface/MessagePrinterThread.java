package com.functionalinterface;

public class MessagePrinterThread {
    public static void main(String[] args) {
        // Runnable to print message
        Runnable printMessage = () -> {
            System.out.println("Hello from separate thread!");
            System.out.println("Thread name: " + Thread.currentThread().getName());
        };
        
        new Thread(printMessage).start();
        new Thread(printMessage).start();
    }
}
