package com.linkedlist.singlylinkedlist;

/**
 * Demo program to showcase StudentLinkedList operations without user input.
 * This demonstrates all the required operations programmatically.
 */
public class StudentRecordDemo {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();
        
        System.out.println("=== Student Record Management System Demo ===\n");
        
        // 1. Add students at beginning
        System.out.println("1. Adding students at beginning:");
        list.addAtBeginning(new StudentRecord(101, "Alice Smith", 20, "A"));
        list.addAtBeginning(new StudentRecord(102, "Bob Johnson", 21, "B+"));
        list.displayRecords();
        
        // 2. Add students at end
        System.out.println("\n2. Adding students at end:");
        list.addAtEnd(new StudentRecord(103, "Charlie Brown", 19, "A-"));
        list.addAtEnd(new StudentRecord(104, "Diana Prince", 22, "A+"));
        list.displayRecords();
        
        // 3. Insert student at specific position
        System.out.println("\n3. Inserting student at position 3:");
        boolean inserted = list.insertAtPosition(new StudentRecord(105, "Eve Adams", 20, "B"), 3);
        System.out.println("Insert successful: " + inserted);
        list.displayRecords();
        
        // 4. Search for a student
        System.out.println("\n4. Searching for student with roll number 103:");
        StudentRecord found = list.searchByRollNumber(103);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Student not found.");
        }
        
        // 5. Update a student's grade
        System.out.println("\n5. Updating grade for roll number 102 to 'A':");
        boolean updated = list.updateGradeByRollNumber(102, "A");
        System.out.println("Update successful: " + updated);
        list.displayRecords();
        
        // 6. Delete a student
        System.out.println("\n6. Deleting student with roll number 105:");
        boolean deleted = list.deleteByRollNumber(105);
        System.out.println("Delete successful: " + deleted);
        list.displayRecords();
        
        // 7. Try to search for deleted student
        System.out.println("\n7. Searching for deleted student (roll 105):");
        found = list.searchByRollNumber(105);
        if (found != null) {
            System.out.println("Found: " + found);
        } else {
            System.out.println("Student not found (expected).");
        }
        
        System.out.println("\n=== Demo Complete ===");
    }
}
