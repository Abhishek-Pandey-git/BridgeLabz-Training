package com.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Employee
class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}


//task execution
public class DepartmentAverageSalary {
	public static void main(String[] args) {
		//required data
		List<Employee> employees = List.of(
			    new Employee("John", "IT", 70000),
			    new Employee("Jane", "HR", 60000),
			    new Employee("Mike", "IT", 80000),
			    new Employee("Sara", "Finance", 75000),
			    new Employee("Paul", "HR", 65000)
			);
		
		//stream to get the class
		Map<String, Double> avgSalaryByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(avgSalaryByDept.toString());
		
	}
}
