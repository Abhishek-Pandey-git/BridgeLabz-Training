import java.util.Scanner;

// Program to calculate area of a circle
public class AreaOfCircle {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Area = π * radius^2
        double area = Math.PI * radius * radius;
        
        System.out.printf("Area of circle with radius %.2f is: %.2f square units%n", radius, area);
        
        scanner.close();
    }
}
