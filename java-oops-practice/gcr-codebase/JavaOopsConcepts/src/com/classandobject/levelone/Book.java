package com.classandobject.levelone;

public class Book {
	
	//instance variables
	String title;
	String author;
	double price;
	
	//Constructor to initialize book details
	Book(String title, String author, double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//method to display book details
	public void displayBookDetails() {
		System.out.println("Book Title: " + title);
		System.out.println("Book Author: " + author);
		System.out.println("Book Price: Rs." + price);
	}
	
	public static void main(String[] args) {
		//creating object of Book class
		Book book1 = new Book("Java Programming", "James Gosling", 450.50);
		book1.displayBookDetails(); //calling display method
		
		System.out.println();
		
		//creating another book object
		Book book2 = new Book("Data Structures", "Robert Lafore", 550.00);
		book2.displayBookDetails();
	}
}
