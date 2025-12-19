import java.util.Scanner;

class StudentGradeCalculator2D {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // 2D array to store marks
        // Row -> Student, Column -> Subjects (0-Physics, 1-Chemistry, 2-Maths)
        int[][] marks = new int[numberOfStudents][3];

        // Arrays to store percentage and grade
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks for each student
        for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {

            System.out.println("\nEnter marks for Student " + (studentIndex + 1));

            System.out.print("Physics: ");
            marks[studentIndex][0] = input.nextInt();

            System.out.print("Chemistry: ");
            marks[studentIndex][1] = input.nextInt();

            System.out.print("Maths: ");
            marks[studentIndex][2] = input.nextInt();

            // Check for negative marks
            if (marks[studentIndex][0] < 0 || 
                marks[studentIndex][1] < 0 || 
                marks[studentIndex][2] < 0) {

                System.out.println("Marks cannot be negative. Please re-enter all marks.");
                studentIndex--;   // Decrement index to re-enter data for same student
                continue;
            }

            // Calculate percentage using 2D array
            percentages[studentIndex] =
                    (marks[studentIndex][0] +
                     marks[studentIndex][1] +
                     marks[studentIndex][2]) / 3.0;

            // Determine grade based on percentage
            if (percentages[studentIndex] >= 80) {
                grades[studentIndex] = 'A';
            } else if (percentages[studentIndex] >= 70) {
                grades[studentIndex] = 'B';
            } else if (percentages[studentIndex] >= 60) {
                grades[studentIndex] = 'C';
            } else if (percentages[studentIndex] >= 50) {
                grades[studentIndex] = 'D';
            } else if (percentages[studentIndex] >= 40) {
                grades[studentIndex] = 'E';
            } else {
                grades[studentIndex] = 'R';
            }
        }

        // Display student results
        System.out.println("\n----- Student Results -----");

        for (int studentIndex = 0; studentIndex < numberOfStudents; studentIndex++) {

            System.out.println("\nStudent " + (studentIndex + 1));
            System.out.println("Physics Marks   : " + marks[studentIndex][0]);
            System.out.println("Chemistry Marks : " + marks[studentIndex][1]);
            System.out.println("Maths Marks     : " + marks[studentIndex][2]);
            System.out.println("Percentage      : " + percentages[studentIndex] + "%");
            System.out.println("Grade           : " + grades[studentIndex]);
        }

        input.close();
    }
}
