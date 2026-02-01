package com.functionalinterface;

import java.util.function.Consumer;

class Student {
    String name;
    int rollNo;
    
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class StudentDetailsPrinter {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 101);
        Student s2 = new Student("Bob", 102);
        
        // Consumer to print student details
        Consumer<Student> printDetails = student -> 
            System.out.println("Roll No: " + student.rollNo + ", Name: " + student.name);
        
        printDetails.accept(s1);
        printDetails.accept(s2);
    }
}
