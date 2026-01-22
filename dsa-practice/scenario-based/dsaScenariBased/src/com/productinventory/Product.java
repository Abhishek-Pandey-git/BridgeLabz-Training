package com.productinventory;


//class representing product record

public class Product {
	String sku;
	String name;
	double price;
	
	public Product(String sku, String name, double price) {
		this.sku = sku;
		this.name = name;
		this.price = price;
	}
}
