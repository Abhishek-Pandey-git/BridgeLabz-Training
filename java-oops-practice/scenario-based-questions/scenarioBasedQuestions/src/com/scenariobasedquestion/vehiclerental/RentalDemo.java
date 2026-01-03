package com.scenariobasedquestion.vehiclerental;

import java.util.Scanner;

// Interactive demo for vehicle rental
public class RentalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter customer id:");
        String cid = scanner.nextLine();
        System.out.println("Enter customer name:");
        String cname = scanner.nextLine();
        System.out.println("Enter contact:");
        String contact = scanner.nextLine();

        Customer customer = new Customer(cid, cname, contact);

        System.out.println("Choose vehicle type to rent (1=Bike,2=Car,3=Truck):");
        String choice = scanner.nextLine().trim();

        System.out.println("Enter model:");
        String model = scanner.nextLine();
        System.out.println("Enter year:");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter base rate per day:");
        double base = Double.parseDouble(scanner.nextLine());

        Vehicle vehicle = null;
        if (choice.equals("1")) {
            System.out.println("Include helmet? (yes/no):");
            boolean helmet = scanner.nextLine().trim().toLowerCase().startsWith("y");
            vehicle = new Bike(model, year, base, helmet);
        } else if (choice.equals("2")) {
            System.out.println("Automatic? (yes/no):");
            boolean auto = scanner.nextLine().trim().toLowerCase().startsWith("y");
            System.out.println("Insurance per day:");
            double ins = Double.parseDouble(scanner.nextLine());
            vehicle = new Car(model, year, base, auto, ins);
        } else {
            System.out.println("Enter load capacity (tons):");
            double cap = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter loading surcharge:");
            double loadS = Double.parseDouble(scanner.nextLine());
            vehicle = new Truck(model, year, base, cap, loadS);
        }

        System.out.println("Enter number of days to rent:");
        int days = Integer.parseInt(scanner.nextLine());

        System.out.println("\n--- Rental Summary ---");
        customer.display();
        vehicle.displayInfo();

        double payable = vehicle.calculateRent(days);
        System.out.println("Days: " + days);
        System.out.println("Total Rent: " + payable);

        scanner.close();
    }
}
