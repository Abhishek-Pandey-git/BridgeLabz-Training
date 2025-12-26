package com.classandobject.levelone;

public class MobilePhone {
	
	//instance variables
	String brand;
	String model;
	double price;
	
	//Constructor to initialize mobile phone details
	MobilePhone(String brand, String model, double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	
	//method to display mobile phone details
	public void displayPhoneDetails() {
		System.out.println("Mobile Brand: " + brand);
		System.out.println("Mobile Model: " + model);
		System.out.println("Mobile Price: Rs." + price);
	}
	
	public static void main(String[] args) {
		//creating object of MobilePhone class
		MobilePhone phone1 = new MobilePhone("Samsung", "Galaxy S21", 55000.00);
		phone1.displayPhoneDetails(); //calling display method
		
		System.out.println();
		
		//creating another mobile phone object
		MobilePhone phone2 = new MobilePhone("Apple", "iPhone 13", 79000.00);
		phone2.displayPhoneDetails();
	}
}
