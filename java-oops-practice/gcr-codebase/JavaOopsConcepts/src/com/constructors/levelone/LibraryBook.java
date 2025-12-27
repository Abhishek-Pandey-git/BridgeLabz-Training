package com.constructors.levelone;

import java.util.Scanner;

public class LibraryBook {
	// instance variables
	String title;
	String author;
	double price;
	boolean availability;
	
	// constructor
	public LibraryBook(String title, String author, double price, boolean availability) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = availability;
	}
	
	// method to borrow a book
	public void borrowBook() {
		if (availability == true) {
			availability = false;
			System.out.println("Book borrowed successfully");
		} else {
			System.out.println("Sorry, book is not available");
		}
	}
	
	// method to display book details
	public void displayBookDetails() {
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
		System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// creating first book
		System.out.println("Enter Book 1 details:");
		System.out.print("Enter title: ");
		String title1 = input.nextLine();
		System.out.print("Enter author: ");
		String author1 = input.nextLine();
		System.out.print("Enter price: ");
		double price1 = input.nextDouble();
		System.out.print("Is book available? (true/false): ");
		boolean available1 = input.nextBoolean();
		input.nextLine(); // consume newline
		
		LibraryBook book1 = new LibraryBook(title1, author1, price1, available1);
		
		System.out.println("\nBook 1 Details:");
		book1.displayBookDetails();
		
		// trying to borrow book
		System.out.println("\nAttempting to borrow Book 1:");
		book1.borrowBook();
		
		System.out.println("\nBook 1 Details after borrowing:");
		book1.displayBookDetails();
		
		input.close();
	}
}
