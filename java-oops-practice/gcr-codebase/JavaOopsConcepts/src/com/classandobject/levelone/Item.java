package com.classandobject.levelone;

public class Item {
	
	//instance variables
	int itemCode;
	String itemName;
	double price;
	
	//Constructor to initialize item details
	Item(int itemCode, String itemName, double price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	
	//method to display item details
	public void displayItemDetails() {
		System.out.println("Item Code: " + itemCode);
		System.out.println("Item Name: " + itemName);
		System.out.println("Item Price: Rs." + price);
	}
	
	//method to calculate total cost for given quantity
	public void calculateTotalCost(int quantity) {
		double totalCost = price * quantity;
		System.out.println("Quantity: " + quantity);
		System.out.println("Total Cost: Rs." + totalCost);
	}
	
	public static void main(String[] args) {
		//creating object of Item class
		Item item1 = new Item(101, "Laptop", 45000.00);
		item1.displayItemDetails(); //calling display method
		item1.calculateTotalCost(3); //calculating total cost for 3 items
		
		System.out.println();
		
		//creating another item object
		Item item2 = new Item(102, "Mouse", 350.00);
		item2.displayItemDetails();
		item2.calculateTotalCost(10);
	}
}
