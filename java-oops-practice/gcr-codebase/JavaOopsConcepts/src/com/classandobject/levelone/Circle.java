package com.classandobject.levelone;

public class Circle {
	
	//instance variable
	double radius;
	
	//Constructor to initialize radius
	Circle(double radius){
		this.radius = radius;
	}
	
	//method to calculate area of circle
	public double calculateArea() {
		double area = 3.14 * radius * radius;
		return area;
	}
	
	//method to calculate circumference of circle
	public double calculateCircumference() {
		double circumference = 2 * 3.14 * radius;
		return circumference;
	}
	
	//method to display area and circumference
	public void displayDetails() {
		System.out.println("Radius of Circle: " + radius);
		System.out.println("Area of Circle: " + calculateArea());
		System.out.println("Circumference of Circle: " + calculateCircumference());
	}
	
	public static void main(String[] args) {
		//creating object of Circle class
		Circle c1 = new Circle(5.0);
		c1.displayDetails(); //calling display method
		
		System.out.println();
		
		//creating another object
		Circle c2 = new Circle(7.5);
		c2.displayDetails();
	}
}
