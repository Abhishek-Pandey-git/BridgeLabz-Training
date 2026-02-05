package com.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//studetn class 
class Student {
    private String name;
    private int gradeLevel;

    public Student(String name, int gradeLevel) {
        this.name = name;
        this.gradeLevel = gradeLevel;
    }

    public String getName() {
        return name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }
}

//execution part
public class StudentApp {
	public static void main(String[] args) {
		List<Student> students = List.of(
			    new Student("Alice", 10),
			    new Student("Bob", 10),
			    new Student("Charlie", 11),
			    new Student("Diana", 12),
			    new Student("Eve", 11)
			);
		
		Map<Integer, List<String>> namesByGrade=students.stream().collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.mapping(Student::getName,Collectors.toList())));
		System.out.println(namesByGrade.toString());
		
		
	}
}
