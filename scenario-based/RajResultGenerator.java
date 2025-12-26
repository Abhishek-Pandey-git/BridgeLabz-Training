import java.util.Scanner;

public class RajResultGenerator {
    public static void main(String[] args) {
        // Create scanner object for input
        Scanner input = new Scanner(System.in);
        
        // Array to store marks of 5 subjects
        int[] marks = new int[5];
        
        // Input marks for 5 subjects using for loop
        System.out.println("Enter marks for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }
        
        // Calculate total marks
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total = total + marks[i];
        }
        
        // Calculate average
        double average = total / 5.0;
        
        // Display marks
        System.out.println("\nMarks obtained:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        
        // Display total and average
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
        
        // Convert average to int for switch case
        int avg = (int) average;
        
        // Assign grade using switch
        char grade;
        switch (avg / 10) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
                break;
        }
        
        // Display grade
        System.out.println("Grade: " + grade);
        
        // Close scanner
        input.close();
    }
}
