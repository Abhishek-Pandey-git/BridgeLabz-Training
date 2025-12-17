import java.util.Scanner;

// Program to convert height from centimeters to feet and inches
public class HeightConverter {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble();
        
        // Convert cm to inches: 1 inch = 2.54 cm
        double totalInches = heightInCm / 2.54;
        
        // Convert inches to feet and remaining inches: 1 foot = 12 inches
        int feet = (int) (totalInches / 12);
        double remainingInches = totalInches % 12;
        
        System.out.println("Your Height in cm is " + heightInCm + 
                         " while in feet is " + feet + " and inches is " + remainingInches);
        
        input.close();
    }
}
