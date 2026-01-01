package com.objectmodelling.assistedproblems;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Only Company creates departments to model composition
    public Department createDepartment(String deptName) {
        Department d = new Department(deptName, this);
        departments.add(d);
        return d;
    }

    public List<Department> getDepartments() {
        return new ArrayList<>(departments);
    }

    // Remove all departments and their employees to demonstrate composition
    public void closeCompany() {
        for (Department d : departments) {
            d.removeAllEmployees();
        }
        departments.clear();
    }

    public void showStructure() {
        System.out.println("Company: " + name);
        if (departments.isEmpty()) {
            System.out.println("  (no departments)");
            return;
        }
        for (Department d : departments) {
            System.out.println(" Department: " + d.getName());
            if (d.getEmployees().isEmpty()) {
                System.out.println("   (no employees)");
            } else {
                for (Employee e : d.getEmployees()) {
                    System.out.println("   - " + e.getName());
                }
            }
        }
    }
}
