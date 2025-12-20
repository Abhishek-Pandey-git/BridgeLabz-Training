import java.util.Scanner;

// Maximum Handshakes Calculator
public class MaximumHandshakes {
    
    public static int calculateMaximumHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
    
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Get number of students from user
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        
        // Calculate maximum handshakes using method
        int maxHandshakes = calculateMaximumHandshakes(numberOfStudents);
        
        // Display the result
        System.out.println("The maximum number of possible handshakes is: " + maxHandshakes);
        
      
        input.close();
    }
}
