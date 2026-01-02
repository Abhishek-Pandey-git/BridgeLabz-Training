package com.inheritence.hierarchical;

import java.util.Scanner;

// Demo for banking hierarchy
public class BankDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose account type (1=savings,2=checking,3=fixed):");
        String choice = scanner.nextLine().trim();

        System.out.println("Enter account number:");
        String acc = scanner.nextLine();

        System.out.println("Enter initial balance:");
        double bal = Double.parseDouble(scanner.nextLine());

        if (choice.equals("1")) {
            System.out.println("Enter interest rate (%):");
            double rate = Double.parseDouble(scanner.nextLine());
            SavingsAccount s = new SavingsAccount(acc, bal, rate);
            s.displayAccountType();
            s.displayAccount();
        } else if (choice.equals("2")) {
            System.out.println("Enter withdrawal limit:");
            double limit = Double.parseDouble(scanner.nextLine());
            CheckingAccount c = new CheckingAccount(acc, bal, limit);
            c.displayAccountType();
            c.displayAccount();
        } else if (choice.equals("3")) {
            System.out.println("Enter tenure in months:");
            int t = Integer.parseInt(scanner.nextLine());
            FixedDepositAccount f = new FixedDepositAccount(acc, bal, t);
            f.displayAccountType();
            f.displayAccount();
        } else {
            BankAccount b = new BankAccount(acc, bal);
            b.displayAccount();
        }

        scanner.close();
    }
}
