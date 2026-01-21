package com.collections.policymanager;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== POLICY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Policy");
            System.out.println("2. Search Policy by Number");
            System.out.println("3. List Policies Expiring in Next 30 Days");
            System.out.println("4. Search Policies by Holder Name");
            System.out.println("5. Remove Policies by Holder Name");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    System.out.print("Enter Policy Number: ");
                    int number = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Expiry Date (dd-MM-yyyy): ");
                    String date = sc.nextLine();

                    PolicyManager.addPolicy(number, name, date);
                    break;

                case 2:
                    System.out.print("Enter Policy Number to Search: ");
                    int searchNum = sc.nextInt();
                    sc.nextLine();

                    PolicyManager.searchPolicy(searchNum);
                    break;

                case 3:
                    PolicyManager.getPoliciesExpiringInNext30Days();
                    break;

                case 4:
                    System.out.print("Enter Holder Name: ");
                    String holder = sc.nextLine();

                    PolicyManager.searchPolicyByHolder(holder);
                    break;

                case 5:
                    System.out.print("Enter Holder Name to Remove Policies: ");
                    String removeHolder = sc.nextLine();

                    PolicyManager.removePoliciesByHolderName(removeHolder);
                    System.out.println("Policies removed (if any).");
                    break;

                case 6:
                    System.out.println("Exiting system. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
