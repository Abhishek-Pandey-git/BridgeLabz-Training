import java.util.Scanner;

// Program to calculate area of triangle in square inches and square centimeters
public class TriangleArea {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter base of triangle (in cm): ");
        double base = scanner.nextDouble();
        
        System.out.print("Enter height of triangle (in cm): ");
        double height = scanner.nextDouble();
        
        // Calculate area in square centimeters: Area = 1/2 * base * height
        double areaInCm = 0.5 * base * height;
        
        // Convert to square inches: 1 inch = 2.54 cm, so 1 sq inch = 2.54 * 2.54 sq cm
        double areaInInches = areaInCm / (2.54 * 2.54);
        
        // Display results
        System.out.println("The Area of the triangle in sq in is " + areaInInches + 
                         " and sq cm is " + areaInCm);
        
        scanner.close();
    }
}
