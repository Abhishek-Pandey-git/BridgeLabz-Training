package com.constructors.levelone;

import java.util.Scanner;

public class Book {
	// public variable - can be accessed from anywhere
	public String ISBN;
	
	// protected variable - can be accessed in same package and subclasses
	protected String title;
	
	// private variable - can only be accessed within this class
	private String author;
	
	// constructor
	public Book(String ISBN, String title, String author) {
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}
	
	// method to set author name
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// method to get author name
	public String getAuthor() {
		return author;
	}
	
	// method to display book details
	public void displayBookDetails() {
		System.out.println("ISBN: " + ISBN);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
	}
}

// subclass EBook to demonstrate access modifiers
class EBook extends Book {
	String fileSize;
	
	// constructor
	public EBook(String ISBN, String title, String author, String fileSize) {
		super(ISBN, title, author);
		this.fileSize = fileSize;
	}
	
	// method to display ebook details
	public void displayEBookDetails() {
		// can access ISBN (public)
		System.out.println("ISBN: " + ISBN);
		
		// can access title (protected)
		System.out.println("Title: " + title);
		
		// cannot access author directly (private), so use getter method
		System.out.println("Author: " + getAuthor());
		
		System.out.println("File Size: " + fileSize);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// creating regular book
		System.out.println("Enter Book details:");
		System.out.print("Enter ISBN: ");
		String isbn1 = input.nextLine();
		System.out.print("Enter title: ");
		String title1 = input.nextLine();
		System.out.print("Enter author: ");
		String author1 = input.nextLine();
		
		Book book = new Book(isbn1, title1, author1);
		
		System.out.println("\nBook Details:");
		book.displayBookDetails();
		
		// creating ebook
		System.out.println("\nEnter EBook details:");
		System.out.print("Enter ISBN: ");
		String isbn2 = input.nextLine();
		System.out.print("Enter title: ");
		String title2 = input.nextLine();
		System.out.print("Enter author: ");
		String author2 = input.nextLine();
		System.out.print("Enter file size: ");
		String fileSize = input.nextLine();
		
		EBook ebook = new EBook(isbn2, title2, author2, fileSize);
		
		System.out.println("\nEBook Details:");
		ebook.displayEBookDetails();
		
		input.close();
	}
}
