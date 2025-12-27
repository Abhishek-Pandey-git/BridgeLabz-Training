package com.constructors.levelone;

import java.util.Scanner;

public class CarRental {
	// instance variables
	String customerName;
	String carModel;
	int rentalDays;
	double ratePerDay;
	
	// default constructor
	public CarRental() {
		this.customerName = "Customer";
		this.carModel = "Standard Car";
		this.rentalDays = 1;
		this.ratePerDay = 500.0;
	}
	
	// parameterized constructor
	public CarRental(String customerName, String carModel, int rentalDays, double ratePerDay) {
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
		this.ratePerDay = ratePerDay;
	}
	
	// method to calculate total cost
	public double calculateTotalCost() {
		return rentalDays * ratePerDay;
	}
	
	// method to display rental details
	public void displayRentalDetails() {
		System.out.println("Customer Name: " + customerName);
		System.out.println("Car Model: " + carModel);
		System.out.println("Rental Days: " + rentalDays);
		System.out.println("Rate Per Day: " + ratePerDay);
		System.out.println("Total Cost: " + calculateTotalCost());
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// using default constructor
		System.out.println("Rental 1 - Using default constructor:");
		CarRental rental1 = new CarRental();
		rental1.displayRentalDetails();
		
		// using parameterized constructor
		System.out.println("\nEnter details for Rental 2:");
		System.out.print("Enter customer name: ");
		String name = input.nextLine();
		System.out.print("Enter car model: ");
		String model = input.nextLine();
		System.out.print("Enter number of rental days: ");
		int days = input.nextInt();
		System.out.print("Enter rate per day: ");
		double rate = input.nextDouble();
		
		CarRental rental2 = new CarRental(name, model, days, rate);
		
		System.out.println("\nRental 2 Details:");
		rental2.displayRentalDetails();
		
		input.close();
	}
}
