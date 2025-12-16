import java.util.Scanner;

// Program to convert kilometers to miles
public class KilometersToMiles {
    
    private static final double CONVERSION_FACTOR = 0.621371;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        
        // Convert using conversion factor
        double miles = kilometers * CONVERSION_FACTOR;
        
        System.out.printf("%.2f kilometers is equal to %.2f miles%n", kilometers, miles);
        
        scanner.close();
    }
}
