package com.lambdaexpression;

public class ThreadTaskRunner {
    public static void main(String[] args) {
        // Lambda to run task in separate thread
        Runnable task = () -> {
            System.out.println("Task running in thread: " + Thread.currentThread().getName());
            for (int i = 1; i <= 5; i++) {
                System.out.println("Step " + i);
            }
        };
        
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        
        t1.start();
        t2.start();
    }
}
