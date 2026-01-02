package com.inheritence.hybrid;

import java.util.Scanner;

// Demo showing Chef and Waiter implementing Worker
public class RestaurantDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose role (1=chef,2=waiter):");
        String choice = scanner.nextLine().trim();

        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter id:");
        String id = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.println("Enter speciality:");
            String spec = scanner.nextLine();
            Chef chef = new Chef(name, id, spec);
            chef.displayRole();
            chef.performDuties();
        } else {
            System.out.println("Enter number of tables assigned:");
            int t = Integer.parseInt(scanner.nextLine());
            Waiter w = new Waiter(name, id, t);
            w.displayRole();
            w.performDuties();
        }

        scanner.close();
    }
}
