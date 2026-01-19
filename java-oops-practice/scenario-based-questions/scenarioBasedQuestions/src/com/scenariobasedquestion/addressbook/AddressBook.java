package com.scenariobasedquestion.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add contact with duplicate validation
    public void addContact(Contact newContact) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(newContact.getFirstName())
                    && c.getLastName().equalsIgnoreCase(newContact.getLastName())) {
                System.out.println("Duplicate contact found. Not adding.");
                return;
            }
        }
        contacts.add(newContact);
        System.out.println("Contact added successfully.");
    }

    // Edit existing contact by name
    public void editContact(String firstName, String lastName) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName)
                    && c.getLastName().equalsIgnoreCase(lastName)) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter new phone: ");
                c.setPhone(sc.nextLine());
                System.out.print("Enter new email: ");
                c.setEmail(sc.nextLine());
                System.out.print("Enter new city: ");
                c.setCity(sc.nextLine());
                System.out.print("Enter new state: ");
                c.setState(sc.nextLine());
                System.out.print("Enter new zip: ");
                c.setZip(sc.nextLine());
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    // Delete contact by name
    public void deleteContact(String firstName, String lastName) {
        boolean removed = contacts.removeIf(c ->
                c.getFirstName().equalsIgnoreCase(firstName)
                        && c.getLastName().equalsIgnoreCase(lastName));
        if (removed) {
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Search contacts by city
    public void searchByCity(String city) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getCity().equalsIgnoreCase(city)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found in " + city);
        }
    }

    // Search contacts by state
    public void searchByState(String state) {
        boolean found = false;
        for (Contact c : contacts) {
            if (c.getState().equalsIgnoreCase(state)) {
                System.out.println(c);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No contacts found in " + state);
        }
    }

    // Display all contacts sorted alphabetically
    public void displayAll() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts in address book.");
            return;
        }
        contacts.sort((a, b) ->
                a.getFirstName().compareToIgnoreCase(b.getFirstName()));
        System.out.println("\n=== All Contacts ===");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== DigiContact Address Book ===");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City");
            System.out.println("5. Search by State");
            System.out.println("6. Display All Contacts");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("First Name: ");
                    String fn = sc.nextLine();
                    System.out.print("Last Name: ");
                    String ln = sc.nextLine();
                    System.out.print("Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("City: ");
                    String city = sc.nextLine();
                    System.out.print("State: ");
                    String state = sc.nextLine();
                    System.out.print("Zip: ");
                    String zip = sc.nextLine();
                    addressBook.addContact(new Contact(fn, ln, phone, email, city, state, zip));
                    break;

                case 2:
                    System.out.print("First Name to edit: ");
                    String editFn = sc.nextLine();
                    System.out.print("Last Name to edit: ");
                    String editLn = sc.nextLine();
                    addressBook.editContact(editFn, editLn);
                    break;

                case 3:
                    System.out.print("First Name to delete: ");
                    String delFn = sc.nextLine();
                    System.out.print("Last Name to delete: ");
                    String delLn = sc.nextLine();
                    addressBook.deleteContact(delFn, delLn);
                    break;

                case 4:
                    System.out.print("Enter city: ");
                    String searchCity = sc.nextLine();
                    addressBook.searchByCity(searchCity);
                    break;

                case 5:
                    System.out.print("Enter state: ");
                    String searchState = sc.nextLine();
                    addressBook.searchByState(searchState);
                    break;

                case 6:
                    addressBook.displayAll();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
