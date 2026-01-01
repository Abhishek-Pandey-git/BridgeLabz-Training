package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<DepartmentUniversity> departments; // composition: departments belong to university

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public DepartmentUniversity createDepartment(String name) {
        DepartmentUniversity d = new DepartmentUniversity(name, this);
        departments.add(d);
        return d;
    }

    public void removeDepartment(DepartmentUniversity d) {
        departments.remove(d);
    }

    public void closeUniversity() {
        departments.clear();
    }

    public void showStructure() {
        System.out.println("University: " + name);
        if (departments.isEmpty()) {
            System.out.println("  (no departments)");
            return;
        }
        for (DepartmentUniversity d : departments) {
            System.out.println(" - " + d.getName());
        }
    }
}
