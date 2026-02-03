package com.studentapp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentGroupingOperations {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
				new Student("Amit Kumar", 1, "Amit", 22, "Male", "Mumbai", 45, "Computer Engineering",
						Arrays.asList("9876543210", "9123456780")),
				new Student("Sneha Sharma", 2, "Sneha", 24, "Female", "Delhi", 30, "Mechanical Engineering",
						Arrays.asList("9876543211")),
				new Student("Rahul Verma", 3, "Rahul", 26, "Male", "Bangalore", 60, "Electronics Engineering",
						Arrays.asList("9876543212", "9123456781", "9988776655")),
				new Student("Priya Singh", 4, "Priya", 23, "Female", "Mumbai", 20, "Computer Engineering",
						Arrays.asList("9876543213")),
				new Student("Rohit Das", 5, "Rohit", 27, "Male", "Kolkata", 80, "Mechanical Engineering",
						Arrays.asList("9876543214", "9123456782")),
				new Student("Anjali Gupta", 6, "Anjali", 25, "Female", "Pune", 40, "Biotech Engineering",
						Arrays.asList("9876543215")),
				new Student("Sanjay Patel", 7, "Sanjay", 28, "Male", "Chennai", 100, "Civil Engineering",
						Arrays.asList("9876543216")),
				new Student("Neha Reddy", 8, "Neha", 21, "Female", "Hyderabad", 15, "Computer Engineering",
						Arrays.asList("9876543217", "9123456783")),
				new Student("Vikram Joshi", 9, "Vikram", 29, "Male", "Mumbai", 120, "Mechanical Engineering",
						Arrays.asList("9876543218")),
				new Student("Kavya Menon", 10, "Kavya", 24, "Female", "Bangalore", 35, "Electronics Engineering",
						Arrays.asList("9876543219", "9123456784")));

		System.out.println("1. Count students in each department:");
		Map<String, Long> deptCount = students.stream()
				.collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()));
		deptCount.forEach((dept, count) -> System.out.println(dept + ": " + count));

		System.out.println("\n2. Count students in each city:");
		Map<String, Long> cityCount = students.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.counting()));
		cityCount.forEach((city, count) -> System.out.println(city + ": " + count));

		System.out.println("\n3. Average age by department:");
		Map<String, Double> avgAgeDept = students.stream()
				.collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingInt(Student::getAge)));
		avgAgeDept.forEach((dept, avg) -> System.out.println(dept + ": " + avg));

		System.out.println("\n4. Average rank by gender:");
		Map<String, Double> avgRankGender = students.stream()
				.collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getRank)));
		avgRankGender.forEach((gender, avg) -> System.out.println(gender + ": " + avg));

		System.out.println("\n5. Total students:");
		long total = students.stream().count();
		System.out.println("Total: " + total);

		System.out.println("\n6. Department with highest average rank:");
		Map.Entry<String, Double> highestAvgRank = students.stream()
				.collect(Collectors.groupingBy(Student::getDepartment, Collectors.averagingInt(Student::getRank)))
				.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
		if (highestAvgRank != null) {
			System.out.println(highestAvgRank.getKey() + ": " + highestAvgRank.getValue());
		}
	}
}
