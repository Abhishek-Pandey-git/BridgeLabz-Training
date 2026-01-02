package com.inheritence.multilevelinheritence;

import java.util.Scanner;

// Simple demo to show multilevel order statuses
public class OrderDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose order state (1=placed,2=shipped,3=delivered):");
        String choice = scanner.nextLine().trim();

        System.out.println("Enter order id:");
        String id = scanner.nextLine();

        System.out.println("Enter order date:");
        String date = scanner.nextLine();

        if (choice.equals("2")) {
            System.out.println("Enter tracking number:");
            String tn = scanner.nextLine();
            ShippedOrder so = new ShippedOrder(id, date, tn);
            so.display();
        } else if (choice.equals("3")) {
            System.out.println("Enter tracking number:");
            String tn = scanner.nextLine();
            System.out.println("Enter delivery date:");
            String dd = scanner.nextLine();
            DeliveredOrder d = new DeliveredOrder(id, date, tn, dd);
            d.display();
        } else {
            Order o = new Order(id, date);
            o.display();
        }

        scanner.close();
    }
}
