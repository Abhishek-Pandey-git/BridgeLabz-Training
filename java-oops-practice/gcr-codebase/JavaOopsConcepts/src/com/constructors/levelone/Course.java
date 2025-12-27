package com.constructors.levelone;

import java.util.Scanner;

public class Course {
	// instance variables
	String courseName;
	int duration;
	double fee;
	
	// class variable - common for all courses
	static String instituteName = "Default Institute";
	
	// constructor
	public Course(String courseName, int duration, double fee) {
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	
	// instance method to display course details
	public void displayCourseDetails() {
		System.out.println("Course Name: " + courseName);
		System.out.println("Duration: " + duration + " months");
		System.out.println("Fee: " + fee);
		System.out.println("Institute Name: " + instituteName);
	}
	
	// class method to update institute name
	public static void updateInstituteName(String newName) {
		instituteName = newName;
		System.out.println("Institute name updated to: " + instituteName);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// setting institute name
		System.out.print("Enter institute name: ");
		String institute = input.nextLine();
		Course.updateInstituteName(institute);
		
		// creating first course
		System.out.println("\nEnter details for Course 1:");
		System.out.print("Enter course name: ");
		String name1 = input.nextLine();
		System.out.print("Enter duration in months: ");
		int duration1 = input.nextInt();
		System.out.print("Enter fee: ");
		double fee1 = input.nextDouble();
		input.nextLine(); // consume newline
		
		Course course1 = new Course(name1, duration1, fee1);
		
		// creating second course
		System.out.println("\nEnter details for Course 2:");
		System.out.print("Enter course name: ");
		String name2 = input.nextLine();
		System.out.print("Enter duration in months: ");
		int duration2 = input.nextInt();
		System.out.print("Enter fee: ");
		double fee2 = input.nextDouble();
		
		Course course2 = new Course(name2, duration2, fee2);
		
		// displaying course details
		System.out.println("\nCourse 1 Details:");
		course1.displayCourseDetails();
		
		System.out.println("\nCourse 2 Details:");
		course2.displayCourseDetails();
		
		input.close();
	}
}
