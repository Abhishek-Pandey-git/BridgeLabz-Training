package com.library;

public class LibraryApp {
	public static void main(String[] args) {
		System.out.println("=== Smart University Library Management System ===\n");

		// Singleton - Get library catalog instance
		LibraryCatalog catalog = LibraryCatalog.getInstance();
		System.out.println("Library Catalog initialized (Singleton Pattern)\n");

		// Factory - Create different types of users
		System.out.println("Creating users using Factory Pattern:");
		User student = UserFactory.createUser("student", "Alice");
		User faculty = UserFactory.createUser("faculty", "Dr. Bob");
		User librarian = UserFactory.createUser("librarian", "John");

		student.showRole();
		faculty.showRole();
		librarian.showRole();
		System.out.println();

		// Observer - Register users for notifications
		System.out.println("Registering users for notifications (Observer Pattern):\n");
		catalog.addObserver(student);
		catalog.addObserver(faculty);

		// Builder - Create books with optional attributes
		System.out.println("Adding books to catalog (Builder Pattern):\n");

		Book book1 = new Book.BookBuilder("Design Patterns")
				.author("GoF")
				.edition("2nd")
				.genre("Software Engineering")
				.build();

		Book book2 = new Book.BookBuilder("Clean Code")
				.author("Robert C. Martin")
				.genre("Software Engineering")
				.build();

		Book book3 = new Book.BookBuilder("Introduction to Algorithms")
				.author("Cormen, Leiserson, Rivest, Stein")
				.edition("3rd")
				.genre("Computer Science")
				.build();

		// Adding books triggers notifications to subscribed users
		catalog.addBook(book1);
		System.out.println();

		catalog.addBook(book2);
		System.out.println();

		catalog.addBook(book3);
		System.out.println();

		System.out.println("=== Library System Demo Complete ===");
	}
}
