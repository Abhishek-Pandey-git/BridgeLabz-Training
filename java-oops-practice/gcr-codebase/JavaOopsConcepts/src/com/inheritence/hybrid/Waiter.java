package com.inheritence.hybrid;

// Waiter inherits Person and implements Worker
public class Waiter extends Person implements Worker {
    private int tablesAssigned;

    public Waiter(String name, String id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving " + tablesAssigned + " tables.");
    }

    public void displayRole() {
        System.out.println("Role: Waiter");
        display();
        System.out.println("Tables assigned: " + tablesAssigned);
    }
}
