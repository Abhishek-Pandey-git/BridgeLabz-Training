package com.studentapp;

import java.util.List;

public class Student {
	private String name;
	private int id;
	private String firstName;
	private int age;
	private String gender;
	private String city;
	private int rank;
	private String department;
	private List<String> contacts;

	public Student(String name, int id, String firstName, int age, String gender, String city, int rank,
			String department, List<String> contacts) {
		this.name = name;
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.gender = gender;
		this.city = city;
		this.rank = rank;
		this.department = department;
		this.contacts = contacts;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getCity() {
		return city;
	}

	public int getRank() {
		return rank;
	}

	public String getDepartment() {
		return department;
	}

	public List<String> getContacts() {
		return contacts;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", firstName=" + firstName + ", age=" + age + ", gender="
				+ gender + ", city=" + city + ", rank=" + rank + ", department=" + department + ", contacts=" + contacts
				+ "]";
	}
}
