package com.inheritence.singleinheritence;

import java.util.Scanner;

// Small demo to create a Thermostat (subclass) and show its status
public class SmartHomeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter thermostat device ID:");
        String id = scanner.nextLine();

        System.out.println("Is the device ON? (yes/no):");
        String onOff = scanner.nextLine().trim().toLowerCase();
        boolean status = onOff.startsWith("y");

        System.out.println("Enter desired temperature (°C):");
        double temp = Double.parseDouble(scanner.nextLine());

        Thermostat t = new Thermostat(id, status, temp);
        System.out.println("\n--- Thermostat Status ---");
        t.displayStatus();

        scanner.close();
    }
}
