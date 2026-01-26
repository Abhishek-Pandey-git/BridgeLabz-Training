package com.csvhandling;

import java.io.*;
import java.util.*;

public class ConvertCSVToObjects {
	
	public static void main(String[] args) {
		String fileName = "students.csv";
		List<Student> studentList = new ArrayList<>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
			reader.readLine();
			
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				
				Student student = new Student();
				student.id = data[0];
				student.name = data[1];
				student.age = Integer.parseInt(data[2]);
				student.marks = Integer.parseInt(data[3]);
				
				studentList.add(student);
			}
			
			reader.close();
			
			System.out.println("Student Objects Created:");
			System.out.println("========================");
			
			// printing all student objects
			for (Student s : studentList) {
				System.out.println(s);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class Student {
	String id;
	String name;
	int age;
	int marks;
	
	public String toString() {
		return "Student[ID=" + id + ", Name=" + name + ", Age=" + age + ", Marks=" + marks + "]";
	}
}
