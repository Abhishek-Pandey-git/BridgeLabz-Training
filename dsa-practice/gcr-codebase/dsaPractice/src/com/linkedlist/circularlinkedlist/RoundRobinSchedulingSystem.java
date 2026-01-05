package com.linkedlist.circularlinkedlist;

import java.util.Scanner;

/**
 * Round Robin CPU Scheduling System.
 */
public class RoundRobinSchedulingSystem {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int quantum = readInt("Enter time quantum: ");
        RoundRobinScheduler scheduler = new RoundRobinScheduler(quantum);
        boolean running = true;

        while (running) {
            printMenu();
            int choice = readInt("Choose: ");
            
            switch (choice) {
                case 1 -> {
                    int id = readInt("Process ID: ");
                    int burst = readInt("Burst time: ");
                    int priority = readInt("Priority: ");
                    scheduler.addProcess(new Process(id, burst, priority));
                    System.out.println("Process added.");
                }
                case 2 -> {
                    int id = readInt("Process ID to remove: ");
                    System.out.println(scheduler.removeProcess(id) ? "Removed." : "Not found.");
                }
                case 3 -> {
                    scheduler.simulate();
                }
                case 4 -> {
                    scheduler.displayProcesses();
                }
                case 5 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--- Round Robin Scheduling ---");
        System.out.println("1. Add process  2. Remove process  3. Simulate");
        System.out.println("4. Display processes  5. Exit");
    }

    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException ex) {
                System.out.println("Enter a valid number.");
            }
        }
    }
}
