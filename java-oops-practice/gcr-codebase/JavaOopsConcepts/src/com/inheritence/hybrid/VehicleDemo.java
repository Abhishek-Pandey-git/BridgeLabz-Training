package com.inheritence.hybrid;

import java.util.Scanner;

// Demo for vehicle hierarchy and refuel/charge behaviors
public class VehicleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose vehicle (1=electric,2=petrol):");
        String choice = scanner.nextLine().trim();

        System.out.println("Enter model:");
        String model = scanner.nextLine();
        System.out.println("Enter max speed:");
        int speed = Integer.parseInt(scanner.nextLine());

        if (choice.equals("1")) {
            System.out.println("Enter battery level (%):");
            double bat = Double.parseDouble(scanner.nextLine());
            ElectricVehicle ev = new ElectricVehicle(model, speed, bat);
            ev.display();
            System.out.println("Enter charge percent to add:");
            double add = Double.parseDouble(scanner.nextLine());
            ev.charge(add);
        } else {
            System.out.println("Enter current fuel (liters):");
            double fuel = Double.parseDouble(scanner.nextLine());
            PetrolVehicle pv = new PetrolVehicle(model, speed, fuel);
            pv.display();
            System.out.println("Enter liters to refuel:");
            double liters = Double.parseDouble(scanner.nextLine());
            pv.refuel(liters);
        }

        scanner.close();
    }
}
