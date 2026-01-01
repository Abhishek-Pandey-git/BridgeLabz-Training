package com.objectmodelling.assistedproblems;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Company company; // owner
    private List<Employee> employees;

    Department(String name, Company company) {
        this.name = name;
        this.company = company;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Only Department creates employees to model composition
    public Employee addEmployee(String employeeName) {
        Employee e = new Employee(employeeName, this);
        employees.add(e);
        return e;
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }

    void removeAllEmployees() {
        employees.clear();
    }
}
