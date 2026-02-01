package com.functionalinterface;

import java.util.Comparator;

class EmployeeSalary {
    String name;
    double salary;
    
    EmployeeSalary(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeSalaryComparator {
    public static void main(String[] args) {
        EmployeeSalary e1 = new EmployeeSalary("John", 45000);
        EmployeeSalary e2 = new EmployeeSalary("Alice", 50000);
        
        // Comparator to compare by salary
        Comparator<EmployeeSalary> salaryComparator = (emp1, emp2) -> Double.compare(emp1.salary, emp2.salary);
        
        int result = salaryComparator.compare(e1, e2);
        System.out.println(result < 0 ? e1.name + " has lower salary" : e2.name + " has lower salary");
    }
}
