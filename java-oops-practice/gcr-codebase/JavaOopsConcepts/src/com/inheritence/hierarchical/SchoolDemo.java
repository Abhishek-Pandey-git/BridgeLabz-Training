package com.inheritence.hierarchical;

import java.util.Scanner;

// Demo for school roles
public class SchoolDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose role (1=teacher,2=student,3=staff):");
        String choice = scanner.nextLine().trim();

        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());

        if (choice.equals("1")) {
            System.out.println("Enter subject:");
            String subject = scanner.nextLine();
            Teacher t = new Teacher(name, age, subject);
            t.displayRole();
        } else if (choice.equals("2")) {
            System.out.println("Enter grade:");
            String grade = scanner.nextLine();
            Student s = new Student(name, age, grade);
            s.displayRole();
        } else if (choice.equals("3")) {
            System.out.println("Enter department:");
            String dept = scanner.nextLine();
            Staff sf = new Staff(name, age, dept);
            sf.displayRole();
        } else {
            Person p = new Person(name, age);
            p.displayInfo();
        }

        scanner.close();
    }
}
