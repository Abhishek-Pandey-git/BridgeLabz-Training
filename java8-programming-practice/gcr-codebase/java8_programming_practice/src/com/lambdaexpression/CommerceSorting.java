package com.lambdaexpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//product class
class Product{
	String name;
	double price;
	double rating;
	int discount; // percentage

	Product(String name, double price, double rating, int discount) {
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.discount = discount;
	}

	@Override
	public String toString() {
		return String.format("%-10s | Price: %.2f | Rating: %.1f | Discount: %d%%", name, price, rating, discount);
	}
}

	
	
public class CommerceSorting {
	
	public static void main(String[] args) {
		 List<Product> products = new ArrayList<>();
		 
		 
		 //creating products
		    products.add(new Product("Laptop", 80000, 4.5, 10));
		    products.add(new Product("Phone", 45000, 4.3, 15));
		    products.add(new Product("Tablet", 30000, 4.0, 5));
		    products.add(new Product("Camera", 60000, 4.6, 20));
		    products.add(new Product("Headphones", 5000, 4.1, 30));
		    products.add(new Product("SmartWatch", 12000, 4.2, 25));
		    products.add(new Product("Speaker", 8000, 4.4, 18));
		    products.add(new Product("Monitor", 20000, 4.3, 12));
		    
		 Comparator<Product> byPrice=(a,b)->Double.compare(a.price, b.price);
		 
		 //by rating high->low
		 Comparator<Product>byRating=(a,b)->Double.compare(b.rating,a.rating);
		 
		 //by discount high->low
		 Comparator<Product>byDiscount=(a,b)->Integer.compare(b.discount,a.discount);
		 
		 
		 products.sort(byPrice);
		 System.out.println("sorted by price");
		 System.out.println(products.toString());
		 
		 //sorting by rating
		 
		 products.sort(byRating);
		 System.out.println("Sorted by rating");
		 System.out.println(products.toString());
		 
		 
		 
	}
	
    
   

	
}
