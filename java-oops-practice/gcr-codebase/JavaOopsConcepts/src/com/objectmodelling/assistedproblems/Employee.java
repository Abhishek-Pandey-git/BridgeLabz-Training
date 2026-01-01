package com.objectmodelling.assistedproblems;

public class Employee {
    private String name;
    private Department department;

    Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}
