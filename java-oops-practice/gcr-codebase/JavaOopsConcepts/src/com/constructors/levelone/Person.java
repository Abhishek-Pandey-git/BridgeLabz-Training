package com.constructors.levelone;

import java.util.Scanner;

public class Person {
	// instance variables
	String name;
	int age;
	String address;
	
	// parameterized constructor
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	// copy constructor - clones another person's attributes
	public Person(Person other) {
		this.name = other.name;
		this.age = other.age;
		this.address = other.address;
	}
	
	// method to display person details
	public void displayPersonDetails() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// creating first person
		System.out.println("Enter Person 1 details:");
		System.out.print("Enter name: ");
		String name1 = input.nextLine();
		System.out.print("Enter age: ");
		int age1 = input.nextInt();
		input.nextLine(); // consume newline
		System.out.print("Enter address: ");
		String address1 = input.nextLine();
		
		Person person1 = new Person(name1, age1, address1);
		
		System.out.println("\nPerson 1 Details:");
		person1.displayPersonDetails();
		
		// creating second person using copy constructor
		System.out.println("\nCreating Person 2 by copying Person 1 details...");
		Person person2 = new Person(person1);
		
		System.out.println("\nPerson 2 Details (copied from Person 1):");
		person2.displayPersonDetails();
		
		input.close();
	}
}
