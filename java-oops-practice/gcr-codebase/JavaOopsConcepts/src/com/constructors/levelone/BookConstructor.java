package com.constructors.levelone;

// class to store basic book info
public class BookConstructor {
	//properties
	private String title, author;
	private double price;
	
	// default constructor- invoked when object is created without any arguments
	public BookConstructor() {
		
	}
	
	// parameterised constructor for initializing the attributes
		public BookConstructor (String title,String author,double price) {
			this.title=title;
			this.author=author;
			this.price=price;
		}
	
	// setter for title
	public void setTitle(String title) {
		this.title=title;
	}
	
	//setter for author
	public void setAuthor(String author) {
		this.author=author;
	}
	
	//setter for price
	public void setPrice(double price) {
		this.price=price;
	}
	
	
	
	//method to print all details
	void getDetails() {
		System.out.println("Book Title: "+this.title);
		System.out.println("Book Author: "+this.author);
		System.out.println("Book Title: "+this.price);
		
	}
	

	public static void main(String[] args) {
		// using default constructor
		BookConstructor  book1=new BookConstructor();
		
		//initializing the attributes using setters
		book1.setTitle("Book for nothing");
		book1.setAuthor("Abhishek Pandey");
		book1.setPrice(1234);
		
		book1.getDetails();
		
		//using the parameterized constructor
		BookConstructor  book2=new BookConstructor("The Book for nothing", "Abhishek Pandey", 1234);
		book2.getDetails();
		
		
	

	}

}
