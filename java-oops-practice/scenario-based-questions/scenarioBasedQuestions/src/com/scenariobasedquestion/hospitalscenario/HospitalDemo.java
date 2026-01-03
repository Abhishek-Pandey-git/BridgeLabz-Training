package com.scenariobasedquestion.hospitalscenario;

import java.util.Scanner;

// Simple interactive demo for hospital module
public class HospitalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Register patient type (1=InPatient,2=OutPatient):");
        String type = scanner.nextLine().trim();

        System.out.println("Enter patient id:");
        String pid = scanner.nextLine();
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());

        Patient patient = null;
        double serviceCharges = 0;

        if (type.equals("1")) {
            System.out.println("Emergency? (yes/no):");
            String em = scanner.nextLine().trim().toLowerCase();
            String medHistory = "";
            if (em.startsWith("y")) {
                System.out.println("Enter brief medical history:");
                medHistory = scanner.nextLine();
            }
            System.out.println("Enter room number:");
            String room = scanner.nextLine();
            System.out.println("Enter days admitted:");
            int days = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter per day charge:");
            double perDay = Double.parseDouble(scanner.nextLine());
            patient = new InPatient(pid, name, age, medHistory, room, days, perDay);
            serviceCharges = ((InPatient) patient).getServiceCharges();
        } else {
            System.out.println("Enter appointment date:");
            String appt = scanner.nextLine();
            System.out.println("Enter consultation fee:");
            double fee = Double.parseDouble(scanner.nextLine());
            patient = new OutPatient(pid, name, age, appt, fee);
            serviceCharges = ((OutPatient) patient).getServiceCharges();
        }

        System.out.println("\nAssign a doctor:");
        System.out.println("Enter doctor id:");
        String did = scanner.nextLine();
        System.out.println("Enter doctor name:");
        String dname = scanner.nextLine();
        System.out.println("Enter specialization:");
        String spec = scanner.nextLine();
        Doctor doc = new Doctor(did, dname, spec);

        System.out.println("\nPatient Info:");
        patient.displayInfo();

        System.out.println("\nDoctor Assigned:");
        doc.displayInfo();

        System.out.println("\nBilling details:");
        System.out.println("Enter medicine charges:");
        double medCharges = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter discount percent (e.g., 10 for 10%):");
        double discount = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter tax percent (e.g., 5 for 5%):");
        double tax = Double.parseDouble(scanner.nextLine());

        Bill bill = new Bill(serviceCharges, medCharges, discount, tax);
        bill.displayBreakdown();

        scanner.close();
    }
}
