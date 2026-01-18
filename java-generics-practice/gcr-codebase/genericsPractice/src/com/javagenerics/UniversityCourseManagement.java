package com.javagenerics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniversityCourseManagement {
    
    //wildcard method
    public static void displayAllCourses(List<? extends Course<?>> courses){
        System.out.println("\n=== All University Courses ===");
        if(courses.isEmpty()){
            System.out.println("No courses available");
        }else{
            for(Course<?> course:courses){
                System.out.println(course);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Course<?>> allCourses=new ArrayList<>();
        
        while(true){
            System.out.println("\n--- Course Management System ---");
            System.out.println("1. Add Exam-Based Course");
            System.out.println("2. Add Assignment-Based Course");
            System.out.println("3. Add Research-Based Course");
            System.out.println("4. View All Courses");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            
            int choice=sc.nextInt();
            sc.nextLine();
            
            if(choice==1){
                System.out.print("Course Name: ");
                String name=sc.nextLine();
                System.out.print("Department: ");
                String dept=sc.nextLine();
                System.out.print("Credits: ");
                int credits=sc.nextInt();
                Course<ExamCourse> course=new Course<>(name,dept,credits,new ExamCourse());
                allCourses.add(course);
                System.out.println("Course added successfully");
            }
            else if(choice==2){
                System.out.print("Course Name: ");
                String name=sc.nextLine();
                System.out.print("Department: ");
                String dept=sc.nextLine();
                System.out.print("Credits: ");
                int credits=sc.nextInt();
                Course<AssignmentCourse> course=new Course<>(name,dept,credits,new AssignmentCourse());
                allCourses.add(course);
                System.out.println("Course added successfully");
            }
            else if(choice==3){
                System.out.print("Course Name: ");
                String name=sc.nextLine();
                System.out.print("Department: ");
                String dept=sc.nextLine();
                System.out.print("Credits: ");
                int credits=sc.nextInt();
                Course<ResearchCourse> course=new Course<>(name,dept,credits,new ResearchCourse());
                allCourses.add(course);
                System.out.println("Course added successfully");
            }
            else if(choice==4){
                displayAllCourses(allCourses);
            }
            else if(choice==5){
                System.out.println("Exiting system...");
                break;
            }else{
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
