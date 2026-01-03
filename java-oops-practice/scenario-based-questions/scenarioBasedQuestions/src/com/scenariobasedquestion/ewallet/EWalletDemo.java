package com.scenariobasedquestion.ewallet;

import java.util.Scanner;

// Simple demo for e-wallet
public class EWalletDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter user1 id:");
        String id1 = scanner.nextLine();
        System.out.println("Enter user1 name:");
        String name1 = scanner.nextLine();
        System.out.println("Enter initial balance:");
        double bal1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter referral bonus:");
        double bonus1 = Double.parseDouble(scanner.nextLine());
        Wallet w1 = new PersonalWallet(bal1, bonus1);
        User u1 = new User(id1, name1, w1);

        System.out.println("Enter user2 id:");
        String id2 = scanner.nextLine();
        System.out.println("Enter user2 name:");
        String name2 = scanner.nextLine();
        System.out.println("Enter initial balance:");
        double bal2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter referral bonus:");
        double bonus2 = Double.parseDouble(scanner.nextLine());
        Wallet w2 = new BusinessWallet(bal2, bonus2);
        User u2 = new User(id2, name2, w2);

        System.out.println("\nUser1 details:");
        u1.display();
        System.out.println("\nUser2 details:");
        u2.display();

        System.out.println("\nEnter amount to transfer from user1 to user2:");
        double amount = Double.parseDouble(scanner.nextLine());
        boolean result = u1.getWallet().transferTo(u2, amount);
        if (result == true) {
            System.out.println("Transfer successful");
        } else {
            System.out.println("Transfer failed");
        }

        System.out.println("\nUser1 final details:");
        u1.display();
        System.out.println("\nUser2 final details:");
        u2.display();

        System.out.println("\nUser1 transaction history:");
        u1.getWallet().printHistory();

        scanner.close();
    }
}
