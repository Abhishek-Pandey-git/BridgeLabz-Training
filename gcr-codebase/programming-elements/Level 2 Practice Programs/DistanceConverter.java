import java.util.Scanner;

// Program to convert distance from feet to yards and miles
public class DistanceConverter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        
        // Convert feet to yards: 1 yard = 3 feet
        double distanceInYards = distanceInFeet / 3;
        
        // Convert yards to miles: 1 mile = 1760 yards
        double distanceInMiles = distanceInYards / 1760;
        
        // Display results
        System.out.printf("The distance in yards is %.2f while the distance in miles is %.2f%n", 
                         distanceInYards, distanceInMiles);
        
        scanner.close();
    }
}
