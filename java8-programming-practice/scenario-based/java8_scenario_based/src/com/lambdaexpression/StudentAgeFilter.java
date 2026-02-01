package com.lambdaexpression;

import java.util.Arrays;
import java.util.List;

class StudentAge {
    String name;
    int age;
    
    StudentAge(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String toString() {
        return name + " - " + age + " years";
    }
}

public class StudentAgeFilter {
    public static void main(String[] args) {
        List<StudentAge> students = Arrays.asList(
            new StudentAge("John", 17),
            new StudentAge("Alice", 19),
            new StudentAge("Bob", 20),
            new StudentAge("Emma", 16)
        );
        
        System.out.println("Students above 18:");
        
        // Lambda to filter students above 18
        students.stream()
            .filter(s -> s.age > 18)
            .forEach(s -> System.out.println(s));
    }
}
