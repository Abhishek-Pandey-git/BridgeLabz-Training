import java.util.Scanner;

class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Arrays to store marks, percentage, and grade
        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks for each student
        for (int index = 0; index < numberOfStudents; index++) {

            System.out.println("\nEnter marks for Student " + (index + 1));

            System.out.print("Physics: ");
            physicsMarks[index] = input.nextInt();

            System.out.print("Chemistry: ");
            chemistryMarks[index] = input.nextInt();

            System.out.print("Maths: ");
            mathsMarks[index] = input.nextInt();

            // Check for negative marks
            if (physicsMarks[index] < 0 || chemistryMarks[index] < 0 || mathsMarks[index] < 0) {
                System.out.println("Marks cannot be negative. Please re-enter all marks.");
                index--;   // Decrement index to re-enter data for same student
                continue;
            }

            // Calculate percentage
            percentages[index] = (physicsMarks[index] + chemistryMarks[index] + mathsMarks[index]) / 3.0;

            // Determine grade based on percentage
            if (percentages[index] >= 80) {
                grades[index] = 'A';
            } else if (percentages[index] >= 70) {
                grades[index] = 'B';
            } else if (percentages[index] >= 60) {
                grades[index] = 'C';
            } else if (percentages[index] >= 50) {
                grades[index] = 'D';
            } else if (percentages[index] >= 40) {
                grades[index] = 'E';
            } else {
                grades[index] = 'R';
            }
        }

        // Display results
        System.out.println("\n----- Student Results -----");
        for (int index = 0; index < numberOfStudents; index++) {

            System.out.println("\nStudent " + (index + 1));
            System.out.println("Physics Marks   : " + physicsMarks[index]);
            System.out.println("Chemistry Marks : " + chemistryMarks[index]);
            System.out.println("Maths Marks     : " + mathsMarks[index]);
            System.out.println("Percentage      : " + percentages[index] + "%");
            System.out.println("Grade           : " + grades[index]);
        }

        input.close();
    }
}
