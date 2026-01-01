package com.objectmodelling.assistedproblems;

public class CompanyCompositionDemo {
    public static void main(String[] args) {
        Company comp = new Company("TechCorp");

        Department dev = comp.createDepartment("Development");
        Department hr = comp.createDepartment("Human Resources");

        dev.addEmployee("Alice");
        dev.addEmployee("Bob");
        hr.addEmployee("Carol");

        // Show structure
        comp.showStructure();

        // Close company -> deletes departments & employees (composition semantics)
        System.out.println("\nClosing company...\n");
        comp.closeCompany();

        // Now show structure again
        comp.showStructure();
    }
}
