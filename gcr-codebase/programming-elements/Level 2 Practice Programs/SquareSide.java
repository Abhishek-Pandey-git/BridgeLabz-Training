import java.util.Scanner;

// Program to find side of square from its perimeter
public class SquareSide {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter perimeter of the square: ");
        double perimeter = scanner.nextDouble();
        
        // Calculate side: Perimeter = 4 * side, so side = Perimeter / 4
        double side = perimeter / 4;
        
        // Display result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
        scanner.close();
    }
}
