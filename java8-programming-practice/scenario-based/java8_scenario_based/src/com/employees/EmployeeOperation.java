package com.employees;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;



public class EmployeeOperation {
	public static void main(String[] args) {
		//getting the employee data using streams
		ArrayList<Employee> empData=EmployeeData.getEmployees().stream().collect(Collectors.toCollection(ArrayList::new));
		
		//Q1. getting number of male and femal employees
		Map<String, Long>genderCount=empData.stream().collect(Collectors.groupingBy((e)->e.getGender(),Collectors.counting()));
		System.out.println("Number of male employee "+genderCount.get("Male")+" Female: "+genderCount.get("Female"));
		System.out.println("==============================");
		System.out.println();
		
		//Q2. printing name of all department
		System.out.println("The given department are: ");
		empData.stream().map((e)->e.getDepartment()).distinct().forEach(System.out::println);
		System.out.println("==============================");
		System.out.println();
		
		//Q3. 
		Map<String, Double> averageAge=empData.stream().collect(Collectors.groupingBy((e)->e.getGender(),Collectors.averagingInt((e)->e.getAge())));
		System.out.println("The average age\n Male:\t"+averageAge.get("Male")+ "\tFemale:\t"+averageAge.get("Female"));
		System.out.println("==============================");
		System.out.println();
		
		
		//Q4. Highest Paid employee
		Employee emp=empData.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
		if(emp!=null) {
			System.out.println("Employee with max salary is: "+emp.getName()+"\nwith salary: "+emp.getSalary());
		}
		System.out.println("==============================");
		System.out.println();
		//Q5 Find employee whi joined after 2015
		
		System.out.println("Employee name whoi joined after 2015: ");
		empData.stream().filter((e)->e.getYearOfJoining()>2015).forEach((e)->System.out.println(e.getName()));

		System.out.println("==============================");
		System.out.println();
		
//		6. Count the number of employees in each department ?
		Map<String, Long>employeeCountInEachDepartment=empData.stream().collect(Collectors.groupingBy((e)->e.getDepartment(),Collectors.counting()));
		
		System.out.println("Employee count by department");
		//looping to print
		for(Map.Entry<String, Long>entry:employeeCountInEachDepartment.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		System.out.println("==============================");
		System.out.println();
		
//		7. What is the average salary of each department ?
		Map<String,Double>averageSalaryInEachDepartment=empData.stream().collect(Collectors.groupingBy((e)->e.getDepartment(),Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println("Average Salary by department");
		//looping to print
		for(Map.Entry<String, Double>entry:averageSalaryInEachDepartment.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		
		System.out.println("==============================");
		System.out.println();
		
		
		
//		8. Get the details of youngest male employee in the product development department ?
		empData.stream().min(Comparator.comparingInt(Employee::getAge)).ifPresent(e->System.out.println(e));
		
		System.out.println("==============================");
		System.out.println();
		
		
//		9. Who has the most working experience in the organization?
		
		empData.stream().min(Comparator.comparingInt(Employee::getYearOfJoining)).ifPresent(e->System.out.println("Most Experienced Employee: "+e));
		System.out.println("==============================");
		System.out.println();
		
		
//		10. How many male and female employees are there in the Sales team?
		Map<String,Long>genderCountInSales=empData.stream().filter(e->e.getDepartment().equalsIgnoreCase("sales")).collect(Collectors.groupingBy(e->e.getGender(),Collectors.counting()));
		System.out.println("Male in Sales: "+genderCountInSales.get("Male")+"\nFemale in Sales: "+genderCountInSales.get("Female"));
		System.out.println("==============================");
		System.out.println();
		
//		11. What is the average salary of male and female employees ?
		Map<String,Double>averageSalaryByGender=empData.stream().collect(Collectors.groupingBy((e)->e.getGender(),Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println("Average Salary by Gender");
		//looping to print
		for(Map.Entry<String, Double>entry:averageSalaryByGender.entrySet()) {
			System.out.printf("%-6s %-10.3f",entry.getKey(),entry.getValue());
			System.out.println();
		}
		
		System.out.println("==============================");
		System.out.println();
		
		
//		12. List down the names of all employees in each department ?
		Map<String,List<String>> namesPerDept=empData.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.mapping(e->e.getName(), Collectors.toList())));
		System.out.println("Employee list by department");
		//looping to print
		for(Map.Entry<String, List<String>>entry:namesPerDept.entrySet()) {
			System.out.printf("%-20s %s",entry.getKey(),entry.getValue().toString());
			System.out.println();
		}
		System.out.println("==============================");
		System.out.println();
		
		
//		13. What is the average salary and total salary of the whole organization?
		
		DoubleSummaryStatistics orgStats=empData.stream().collect(Collectors.summarizingDouble(e->e.getSalary()));
		System.out.println("Average Salary of organization: "+orgStats.getAverage()+"\n Total salary of organization: "+orgStats.getSum());
		System.out.println("==============================");
		System.out.println();
		
		
//		14. Get the employee whose salary are more than 25k.
		System.out.println("Employees with salary>25k");
		empData.stream().filter((e)->e.getSalary()>25000).forEach((e)->System.out.println(e.getName()));
		System.out.println("==============================");
		System.out.println();
		
		
//		15.Who is the highest paid employee in the organization?
		System.out.printf("Employees with highest salary: ");
		emp=empData.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
		if(emp!=null){System.out.println(emp);}
		else {System.out.println("No such emloyee or list empty");}
		System.out.println("==============================");
		System.out.println();
		
		
//		16.Who is the second highest paid employee in the organization?
		List<String> sortBySalary=empData.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.mapping(e->e.getName(), Collectors.toList()));
		System.out.println("The second highest paid employee: "+sortBySalary.get(1));
		System.out.println(sortBySalary.toString());
		System.out.println("==============================");
		System.out.println();
		
		
//		17.Who is the third highest paid employee in the organization?
		System.out.println("The third highest paid employee: "+sortBySalary.get(2));
		System.out.println("==============================");
		System.out.println();
		
//		18.Who is the lowest paid employee in the organization?
		System.out.println("The lowest paid employee: "+sortBySalary.get(sortBySalary.size()-1));
		System.out.println("==============================");
		System.out.println();
		
		
//		19.Who is the second lowest paid employee in the organization?
		//using skip and findFirst
		emp=empData.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1).findFirst().orElse(null);
		if(emp!=null) {
			System.out.println("Employee with second lowest salary is: "+emp);
		}
		else {
			System.out.println("Eihter list is empty or no sucg employee exist");
		}
		
		System.out.println("==============================");
		System.out.println();
		
//		20.Get the first five lowest paid employee in the organization?
		System.out.println("First five lowest paid employee: ");
		empData.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).limit(5).forEach(e->System.out.printf(e.getName()+", "));
		System.out.println();
		System.out.println("==============================");
		System.out.println();
		
//		21.Get the first five highest paid employee in the organization?\
		System.out.println("First five highest paid employee: ");
		empData.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(5).forEach(e->System.out.printf(e.getName()+", "));
		System.out.println();
		System.out.println("==============================");
		System.out.println();
		
		
	}
}
