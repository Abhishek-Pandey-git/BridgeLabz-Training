package com.studentapp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentBonusChallenges {
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

		System.out.println("1. Top 3 youngest students:");
		students.stream().sorted(Comparator.comparingInt(Student::getAge)).limit(3).forEach(System.out::println);

		System.out.println("\n2. Top 3 oldest students:");
		students.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).limit(3)
				.forEach(System.out::println);

		System.out.println("\n3. Partition students by age > 25:");
		Map<Boolean, List<Student>> agePartition = students.stream()
				.collect(Collectors.partitioningBy(s -> s.getAge() > 25));
		System.out.println("Age > 25: " + agePartition.get(true).size());
		System.out.println("Age <= 25: " + agePartition.get(false).size());

		System.out.println("\n4. Partition students by rank < 100:");
		Map<Boolean, List<Student>> rankPartition = students.stream()
				.collect(Collectors.partitioningBy(s -> s.getRank() < 100));
		System.out.println("Rank < 100: " + rankPartition.get(true).size());
		System.out.println("Rank >= 100: " + rankPartition.get(false).size());

		System.out.println("\n5. City with maximum students:");
		Map.Entry<String, Long> maxCity = students.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).orElse(null);
		if (maxCity != null) {
			System.out.println(maxCity.getKey() + ": " + maxCity.getValue());
		}

		System.out.println("\n6. Department with minimum students:");
		Map.Entry<String, Long> minDept = students.stream()
				.collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting())).entrySet().stream()
				.min(Map.Entry.comparingByValue()).orElse(null);
		if (minDept != null) {
			System.out.println(minDept.getKey() + ": " + minDept.getValue());
		}
	}
}
