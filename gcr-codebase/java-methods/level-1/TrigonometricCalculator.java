import java.util.Scanner;

// Trigonometric Calculator
public class TrigonometricCalculator {
    
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        // Return array with trigonometric values
        return new double[]{sine, cosine, tangent};
    }
    
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Get angle from user
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();
        
        // Calculate trigonometric functions using method
        double[] result = calculateTrigonometricFunctions(angle);
        
        // Display the results
        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);
        
        
        input.close();
    }
}
