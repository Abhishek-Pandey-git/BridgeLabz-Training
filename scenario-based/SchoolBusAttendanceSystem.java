/*
9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.
*/

import java.util.Scanner;

public class SchoolBusAttendanceSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Student list (fixed size: 10 students)
        String[] students = {
            "Amit", "Riya", "Karan", "Sneha", "Rahul",
            "Neha", "Arjun", "Pooja", "Vikas", "Anjali"
        };

        int presentCount = 0;
        int absentCount = 0;

        // Welcome Screen
        System.out.println("==============================================");
        System.out.println("         SCHOOL BUS ATTENDANCE SYSTEM          ");
        System.out.println("==============================================");

        System.out.println("\nPlease mark attendance (Present / Absent)");
        System.out.println("----------------------------------------------");

        // Attendance marking using for-each loop
        for (String name : students) {
            System.out.print("Is " + name + " Present or Absent? : ");
            String status = input.next();

            if (status.equalsIgnoreCase("Present")) {
                presentCount++;
            } else {
                absentCount++;
            }
        }

        // Attendance Summary
        System.out.println("\n================ ATTENDANCE SUMMARY ===========");
        System.out.printf("%-25s : %d%n", "Total Students", students.length);
        System.out.printf("%-25s : %d%n", "Present Students", presentCount);
        System.out.printf("%-25s : %d%n", "Absent Students", absentCount);
        System.out.println("==============================================");

        // Exit Message
        System.out.println("\nAttendance recording completed successfully.");

        input.close();
    }
}
