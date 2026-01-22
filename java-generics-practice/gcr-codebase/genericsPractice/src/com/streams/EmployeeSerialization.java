package com.streams;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee implements Serializable {
    private int id;
    private String name;
    private String department;
    private double salary;
    
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1. Save Employees");
        System.out.println("2. Retrieve Employees");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            saveEmployees(scanner);
        } else if (choice == 2) {
            retrieveEmployees();
        }
        
        scanner.close();
    }
    
    // Save employees to file
    public static void saveEmployees(Scanner scanner) {
        List<Employee> employees = new ArrayList<>();
        
        System.out.print("How many employees to add? ");
        int count = scanner.nextInt();
        
        for (int i = 0; i < count; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Department: ");
            String dept = scanner.nextLine();
            
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            
            employees.add(new Employee(id, name, dept, salary));
        }
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(employees);
            System.out.println("Employees saved successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    // Retrieve employees from file
    public static void retrieveEmployees() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            List<Employee> employees = (List<Employee>) ois.readObject();
            
            System.out.println("\nEmployee List:");
            for (Employee emp : employees) {
                System.out.println(emp);
            }
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
