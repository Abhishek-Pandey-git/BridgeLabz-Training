import java.util.Scanner;

// Q11. Program to find the roots of a quadratic equation ax^2 + bx + c
public class QuadraticEquation {
    
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if (delta > 0) {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2};
        }
        else if (delta == 0) {
            double root = -b / (2 * a);
            return new double[]{root};
        }
        else {
            return new double[0];
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the coefficients of the quadratic equation ax^2 + bx + c = 0");
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();
        
        System.out.print("Enter value of b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter value of c: ");
        double c = input.nextDouble();
        
        if (a == 0) {
            System.out.println("\nError: 'a' cannot be zero in a quadratic equation!");
            input.close();
            return;
        }
        
        System.out.println("\nQuadratic Equation: " + a + "x^2 + " + b + "x + " + c + " = 0");
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta (Discriminant) = b^2 - 4ac = " + delta);
        
        double[] roots = findRoots(a, b, c);
        
        System.out.println("\n--- Results ---");
        if (roots.length == 2) {
            System.out.println("The equation has TWO real roots:");
            System.out.println("Root 1 (x1) = " + roots[0]);
            System.out.println("Root 2 (x2) = " + roots[1]);
        } else if (roots.length == 1) {
            System.out.println("The equation has ONE real root:");
            System.out.println("Root (x) = " + roots[0]);
        } else {
            System.out.println("The equation has NO real roots (roots are imaginary/complex).");
        }
        
        input.close();
    }
}
