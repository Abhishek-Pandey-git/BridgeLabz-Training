package com.objectmodelling.selfproblems;

public class UniversityDemo {
    public static void main(String[] args) {
        University uni = new University("State University");

        // Faculty exist independently (aggregation)
        Faculty profA = new Faculty("Dr. Adams");
        Faculty profB = new Faculty("Dr. Brown");

        // Departments are created by University (composition)
        DepartmentUniversity cs = uni.createDepartment("Computer Science");
        DepartmentUniversity maths = uni.createDepartment("Mathematics");

        // Add faculty to departments (aggregation)
        cs.addFaculty(profA);
        maths.addFaculty(profB);

        uni.showStructure();
        System.out.println();

        // Close university -> departments removed (composition)
        System.out.println("Closing university...\n");
        uni.closeUniversity();

        uni.showStructure();

        // Faculty still exist independently
        System.out.println("\nFaculty still available: " + profA.getName() + ", " + profB.getName());
    }
}
