package com.objectmodelling.selfproblems;

public class SchoolDemo {
    public static void main(String[] args) {
        // Create students and courses independently
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course math = new Course("Mathematics");
        Course physics = new Course("Physics");

        // Enroll students (many-to-many)
        // handle both sides manually to show association
        math.addStudent(s1);
        s1.addCourse(math);

        math.addStudent(s2);
        s2.addCourse(math);

        physics.addStudent(s1);
        s1.addCourse(physics);

        // Create school and add students (aggregation)
        School school = new School("Greenwood High");
        school.addStudent(s1);
        school.addStudent(s2);

        // Show views
        school.showStudents();
        System.out.println();
        s1.viewCourses();
        System.out.println();
        math.showStudents();
    }
}
