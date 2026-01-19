package com.flashdealz;


//class representing the product
public class Product {
	String name;
	double price;
	double discountPercentage;
	
	//constructor for the same
	public Product(String name,double price, double discountPercentage) {
		this.name=name;
		this.discountPercentage=discountPercentage;
		this.price=price;
	}
}
