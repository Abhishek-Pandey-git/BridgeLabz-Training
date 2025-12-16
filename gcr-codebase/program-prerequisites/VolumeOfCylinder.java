import java.util.Scanner;

// Program to calculate volume of a cylinder
public class VolumeOfCylinder {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter radius of the cylinder: ");
        double radius = scanner.nextDouble();
        
        System.out.print("Enter height of the cylinder: ");
        double height = scanner.nextDouble();
        
        // Volume = π * radius^2 * height
        double volume = Math.PI * radius * radius * height;
        
        System.out.printf("Volume of cylinder with radius %.2f and height %.2f is: %.2f cubic units%n", 
                         radius, height, volume);
        
        scanner.close();
    }
}
