import java.util.Scanner;

// Program to calculate perimeter of a rectangle
public class PerimeterOfRectangle {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        
        // Perimeter = 2 * (length + width)
        double perimeter = 2 * (length + width);
        
        System.out.printf("Perimeter of rectangle with length %.2f and width %.2f is: %.2f units%n", 
                         length, width, perimeter);
        
        scanner.close();
    }
}
