package com.inheritence.multilevelinheritence;

import java.util.Scanner;

// Demo for course hierarchy
public class CourseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose course type (1=basic,2=online,3=paid online):");
        String choice = scanner.nextLine().trim();

        System.out.println("Enter course name:");
        String name = scanner.nextLine();

        System.out.println("Enter duration in hours:");
        int dur = Integer.parseInt(scanner.nextLine());

        if (choice.equals("2")) {
            System.out.println("Enter platform name:");
            String platform = scanner.nextLine();
            System.out.println("Is it recorded? (yes/no):");
            boolean rec = scanner.nextLine().trim().toLowerCase().startsWith("y");
            OnlineCourse oc = new OnlineCourse(name, dur, platform, rec);
            oc.displayInfo();
        } else if (choice.equals("3")) {
            System.out.println("Enter platform name:");
            String platform = scanner.nextLine();
            System.out.println("Is it recorded? (yes/no):");
            boolean rec = scanner.nextLine().trim().toLowerCase().startsWith("y");
            System.out.println("Enter fee:");
            double fee = Double.parseDouble(scanner.nextLine());
            System.out.println("Enter discount percentage:");
            double disc = Double.parseDouble(scanner.nextLine());
            PaidOnlineCourse pc = new PaidOnlineCourse(name, dur, platform, rec, fee, disc);
            pc.displayInfo();
        } else {
            Course c = new Course(name, dur);
            c.displayInfo();
        }

        scanner.close();
    }
}
