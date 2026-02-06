package com.multithreading;

public class ThreadStateDemo {

    public static void main(String[] args) throws InterruptedException {

        TaskRunner task1 = new TaskRunner("Task-1");
        TaskRunner task2 = new TaskRunner("Task-2");

        StateMonitor monitor = new StateMonitor(task1, task2);

        // Threads are NEW here
        System.out.println("[Main] Threads created but not started");

        monitor.start();  // start monitoring first
        task1.start();
        task2.start();

        task1.join();
        task2.join();
        monitor.join();

        System.out.println("Monitoring completed");
    }
}
