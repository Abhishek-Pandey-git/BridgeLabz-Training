package com.inheritence.hybrid;

// Chef inherits Person and implements Worker
public class Chef extends Person implements Worker {
    private String speciality;

    public Chef(String name, String id, String speciality) {
        super(name, id);
        this.speciality = speciality;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking. Speciality: " + speciality);
    }

    public void displayRole() {
        System.out.println("Role: Chef");
        display();
        System.out.println("Speciality: " + speciality);
    }
}
