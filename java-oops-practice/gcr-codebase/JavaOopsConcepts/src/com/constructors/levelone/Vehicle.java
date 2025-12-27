package com.constructors.levelone;

import java.util.Scanner;

public class Vehicle {
	// instance variables
	String ownerName;
	String vehicleType;
	
	// class variable - fixed for all vehicles
	static double registrationFee = 1000.0;
	
	// constructor
	public Vehicle(String ownerName, String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	
	// instance method to display vehicle details
	public void displayVehicleDetails() {
		System.out.println("Owner Name: " + ownerName);
		System.out.println("Vehicle Type: " + vehicleType);
		System.out.println("Registration Fee: " + registrationFee);
	}
	
	// class method to update registration fee
	public static void updateRegistrationFee(double newFee) {
		registrationFee = newFee;
		System.out.println("Registration fee updated to: " + registrationFee);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// displaying current registration fee
		System.out.println("Current registration fee: " + registrationFee);
		System.out.print("Do you want to update registration fee? (yes/no): ");
		String choice = input.nextLine();
		
		if (choice.equalsIgnoreCase("yes")) {
			System.out.print("Enter new registration fee: ");
			double newFee = input.nextDouble();
			input.nextLine(); // consume newline
			Vehicle.updateRegistrationFee(newFee);
		}
		
		// creating first vehicle
		System.out.println("\nEnter details for Vehicle 1:");
		System.out.print("Enter owner name: ");
		String owner1 = input.nextLine();
		System.out.print("Enter vehicle type: ");
		String type1 = input.nextLine();
		
		Vehicle vehicle1 = new Vehicle(owner1, type1);
		
		// creating second vehicle
		System.out.println("\nEnter details for Vehicle 2:");
		System.out.print("Enter owner name: ");
		String owner2 = input.nextLine();
		System.out.print("Enter vehicle type: ");
		String type2 = input.nextLine();
		
		Vehicle vehicle2 = new Vehicle(owner2, type2);
		
		// displaying vehicle details
		System.out.println("\nVehicle 1 Details:");
		vehicle1.displayVehicleDetails();
		
		System.out.println("\nVehicle 2 Details:");
		vehicle2.displayVehicleDetails();
		
		input.close();
	}
}
