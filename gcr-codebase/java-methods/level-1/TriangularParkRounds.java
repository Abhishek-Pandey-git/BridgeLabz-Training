import java.util.Scanner;

// Triangular Park Rounds Calculator
public class TriangularParkRounds {
    
    public static int calculateRounds(double side1, double side2, double side3, double distance) {
        // Calculate perimeter of the triangular park
        double perimeter = side1 + side2 + side3;
        
        // Calculate number of rounds
        int rounds = (int) Math.ceil(distance / perimeter);
        
        return rounds;
    }
    
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Take input for the three sides of the triangular park
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = input.nextDouble();
        
        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = input.nextDouble();
        
        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = input.nextDouble();
        
        // Distance to cover is 5 km (5000 meters)
        double distanceInMeters = 5000;
        
        // Calculate rounds using method
        int rounds = calculateRounds(side1, side2, side3, distanceInMeters);
        
        // Display the result
        System.out.println("The athlete must complete " + rounds + " rounds to finish 5 km run.");
        
      
        input.close();
    }
}
