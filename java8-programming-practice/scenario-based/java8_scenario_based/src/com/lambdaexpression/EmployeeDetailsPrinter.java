package com.lambdaexpression;

import java.util.function.Consumer;

class Employee {
    String name;
    int id;
    double salary;
    
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

public class EmployeeDetailsPrinter {
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 101, 45000);
        Employee e2 = new Employee("Alice", 102, 50000);
        
        // Lambda to print employee details
        Consumer<Employee> printDetails = emp -> 
            System.out.println("ID: " + emp.id + ", Name: " + emp.name + ", Salary: Rs." + emp.salary);
        
        printDetails.accept(e1);
        printDetails.accept(e2);
    }
}
