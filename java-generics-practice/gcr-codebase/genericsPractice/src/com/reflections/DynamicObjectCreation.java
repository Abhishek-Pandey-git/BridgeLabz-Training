package com.reflections;

import java.lang.reflect.Constructor;

class Student {
    private String name;
    private int rollNo;
    
    public Student() {
        this.name = "Unknown";
        this.rollNo = 0;
    }
    
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class DynamicObjectCreation {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("com.reflections.Student");
            
            Constructor<?> constructor = cls.getConstructor(String.class, int.class);
            
            Object obj = constructor.newInstance("John", 101);
            
            Student student = (Student) obj;
            student.display();
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
