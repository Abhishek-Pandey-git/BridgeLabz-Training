package com.objectmodelling.selfproblems;

import java.util.ArrayList;
import java.util.List;

public class DepartmentUniversity {
    private String name;
    private University university;
    private List<Faculty> facultyMembers; // aggregation: faculty can exist independently

    DepartmentUniversity(String name, University university) {
        this.name = name;
        this.university = university;
        this.facultyMembers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty f) {
        if (f != null && !facultyMembers.contains(f)) facultyMembers.add(f);
    }

    public void removeFaculty(Faculty f) {
        facultyMembers.remove(f);
    }

    public List<Faculty> getFaculty() {
        return new ArrayList<>(facultyMembers);
    }
}
