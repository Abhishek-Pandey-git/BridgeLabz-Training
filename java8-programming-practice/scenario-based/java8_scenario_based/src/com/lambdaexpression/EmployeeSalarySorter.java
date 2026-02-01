package com.lambdaexpression;

import java.util.Arrays;
import java.util.List;

class EmployeeSalary {
    String name;
    double salary;
    
    EmployeeSalary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public String toString() {
        return name + " - Rs." + salary;
    }
}

public class EmployeeSalarySorter {
    public static void main(String[] args) {
        List<EmployeeSalary> employees = Arrays.asList(
            new EmployeeSalary("John", 45000),
            new EmployeeSalary("Alice", 35000),
            new EmployeeSalary("Bob", 50000)
        );
        
        System.out.println("Before sorting: " + employees);
        
        // Lambda to sort by salary
        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));
        
        System.out.println("After sorting: " + employees);
    }
}
