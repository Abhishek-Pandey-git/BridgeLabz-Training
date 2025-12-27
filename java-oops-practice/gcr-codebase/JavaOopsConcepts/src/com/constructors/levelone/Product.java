package com.constructors.levelone;

import java.util.Scanner;

public class Product {
	// instance variables
	String productName;
	double price;
	
	// class variable - shared among all products
	static int totalProducts = 0;
	
	// constructor
	public Product(String productName, double price) {
		this.productName = productName;
		this.price = price;
		totalProducts++; // increment total products when a new product is created
	}
	
	// instance method to display product details
	public void displayProductDetails() {
		System.out.println("Product Name: " + productName);
		System.out.println("Price: " + price);
	}
	
	// class method to display total products
	public static void displayTotalProducts() {
		System.out.println("Total Products: " + totalProducts);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// creating first product
		System.out.println("Enter details for Product 1:");
		System.out.print("Enter product name: ");
		String name1 = input.nextLine();
		System.out.print("Enter price: ");
		double price1 = input.nextDouble();
		input.nextLine(); // consume newline
		
		Product product1 = new Product(name1, price1);
		
		// creating second product
		System.out.println("Enter details for Product 2:");
		System.out.print("Enter product name: ");
		String name2 = input.nextLine();
		System.out.print("Enter price: ");
		double price2 = input.nextDouble();
		input.nextLine(); // consume newline
		
		Product product2 = new Product(name2, price2);
		
		// creating third product
		System.out.println("Enter details for Product 3:");
		System.out.print("Enter product name: ");
		String name3 = input.nextLine();
		System.out.print("Enter price: ");
		double price3 = input.nextDouble();
		
		Product product3 = new Product(name3, price3);
		
		// displaying product details
		System.out.println("\nProduct 1 Details:");
		product1.displayProductDetails();
		
		System.out.println("\nProduct 2 Details:");
		product2.displayProductDetails();
		
		System.out.println("\nProduct 3 Details:");
		product3.displayProductDetails();
		
		// displaying total products
		System.out.println();
		Product.displayTotalProducts();
		
		input.close();
	}
}
