package com.constructors.levelone;

import java.util.Scanner;

public class Employee {
	// public variable - can be accessed from anywhere
	public String employeeID;
	
	// protected variable - can be accessed in same package and subclasses
	protected String department;
	
	// private variable - can only be accessed within this class
	private double salary;
	
	// constructor
	public Employee(String employeeID, String department, double salary) {
		this.employeeID = employeeID;
		this.department = department;
		this.salary = salary;
	}
	
	// method to get salary
	public double getSalary() {
		return salary;
	}
	
	// method to set salary
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// method to modify salary
	public void modifySalary(double newSalary) {
		this.salary = newSalary;
		System.out.println("Salary updated successfully");
	}
	
	// method to display employee details
	public void displayEmployeeDetails() {
		System.out.println("Employee ID: " + employeeID);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + salary);
	}
}

// subclass Manager to demonstrate access modifiers
class Manager extends Employee {
	String teamSize;
	
	// constructor
	public Manager(String employeeID, String department, double salary, String teamSize) {
		super(employeeID, department, salary);
		this.teamSize = teamSize;
	}
	
	// method to display manager details
	public void displayManagerDetails() {
		// can access employeeID (public)
		System.out.println("Employee ID: " + employeeID);
		
		// can access department (protected)
		System.out.println("Department: " + department);
		
		// cannot access salary directly (private), so use getter method
		System.out.println("Salary: " + getSalary());
		
		System.out.println("Team Size: " + teamSize);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// creating regular employee
		System.out.println("Enter Employee details:");
		System.out.print("Enter employee ID: ");
		String empId1 = input.nextLine();
		System.out.print("Enter department: ");
		String dept1 = input.nextLine();
		System.out.print("Enter salary: ");
		double salary1 = input.nextDouble();
		input.nextLine(); // consume newline
		
		Employee employee = new Employee(empId1, dept1, salary1);
		
		System.out.println("\nEmployee Details:");
		employee.displayEmployeeDetails();
		
		// modifying salary
		System.out.print("\nEnter new salary for employee: ");
		double newSalary = input.nextDouble();
		input.nextLine(); // consume newline
		employee.modifySalary(newSalary);
		
		System.out.println("\nUpdated Employee Details:");
		employee.displayEmployeeDetails();
		
		// creating manager
		System.out.println("\nEnter Manager details:");
		System.out.print("Enter employee ID: ");
		String empId2 = input.nextLine();
		System.out.print("Enter department: ");
		String dept2 = input.nextLine();
		System.out.print("Enter salary: ");
		double salary2 = input.nextDouble();
		input.nextLine(); // consume newline
		System.out.print("Enter team size: ");
		String team = input.nextLine();
		
		Manager manager = new Manager(empId2, dept2, salary2, team);
		
		System.out.println("\nManager Details:");
		manager.displayManagerDetails();
		
		input.close();
	}
}
