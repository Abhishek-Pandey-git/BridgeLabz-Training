package com.constructors.levelone;

import java.util.Scanner;

public class HotelBooking {
	// instance variables
	String guestName;
	String roomType;
	int nights;
	
	// default constructor
	public HotelBooking() {
		this.guestName = "Guest";
		this.roomType = "Standard";
		this.nights = 1;
	}
	
	// parameterized constructor
	public HotelBooking(String guestName, String roomType, int nights) {
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	
	// copy constructor
	public HotelBooking(HotelBooking other) {
		this.guestName = other.guestName;
		this.roomType = other.roomType;
		this.nights = other.nights;
	}
	
	// method to display booking details
	public void displayBookingDetails() {
		System.out.println("Guest Name: " + guestName);
		System.out.println("Room Type: " + roomType);
		System.out.println("Number of Nights: " + nights);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// using default constructor
		System.out.println("Booking 1 - Using default constructor:");
		HotelBooking booking1 = new HotelBooking();
		booking1.displayBookingDetails();
		
		// using parameterized constructor
		System.out.println("\nEnter details for Booking 2:");
		System.out.print("Enter guest name: ");
		String name = input.nextLine();
		System.out.print("Enter room type: ");
		String room = input.nextLine();
		System.out.print("Enter number of nights: ");
		int nights = input.nextInt();
		input.nextLine(); // consume newline
		
		HotelBooking booking2 = new HotelBooking(name, room, nights);
		
		System.out.println("\nBooking 2 Details:");
		booking2.displayBookingDetails();
		
		// using copy constructor
		System.out.println("\nCreating Booking 3 by copying Booking 2...");
		HotelBooking booking3 = new HotelBooking(booking2);
		
		System.out.println("\nBooking 3 Details (copied from Booking 2):");
		booking3.displayBookingDetails();
		
		input.close();
	}
}
