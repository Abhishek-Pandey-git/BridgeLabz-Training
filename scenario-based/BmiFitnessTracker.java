import java.util.Scanner;

public class BmiFitnessTracker {
    public static void main(String[] args) {
        // Create scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Declare variables
        double height;
        double weight;
        double bmi;
        
        // Display welcome message
        System.out.println("Maya's BMI Fitness Tracker");
        System.out.println();
        
        // Take height input in meters
        System.out.print("Enter height (in meters): ");
        height = scanner.nextDouble();
        
        // Take weight input in kg
        System.out.print("Enter weight (in kg): ");
        weight = scanner.nextDouble();
        
        // Calculate BMI using formula
        bmi = weight / (height * height);
        
        // Display BMI value
        System.out.println();
        System.out.println("Your BMI is: " + bmi);
        
        // Check BMI category using if-else
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }
        
        // Close scanner
        scanner.close();
    }
}
