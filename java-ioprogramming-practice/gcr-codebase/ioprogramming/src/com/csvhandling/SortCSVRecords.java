package com.csvhandling;

import java.io.*;
import java.util.*;

public class SortCSVRecords {
	
	public static void main(String[] args) {
		
		String file = "employees.csv";
		List<Employee> empList = new ArrayList<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			
			br.readLine();
			
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				Employee emp = new Employee(data[0], data[1], data[2], Double.parseDouble(data[3]));
				empList.add(emp);
			}
			
			br.close();
			
			// sort by salary in descending order
			Collections.sort(empList, new Comparator<Employee>() {
				public int compare(Employee e1, Employee e2) {
					return Double.compare(e2.salary, e1.salary);
				}
			});
			
			System.out.println("Top 5 Highest Paid Employees:");
			System.out.println("==============================");
			
			for (int i = 0; i < Math.min(5, empList.size()); i++) {
				Employee e = empList.get(i);
				System.out.println(e.name + " - " + e.department + " - $" + e.salary);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Employee {
	String id;
	String name;
	String department;
	double salary;
	
	Employee(String id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
}
