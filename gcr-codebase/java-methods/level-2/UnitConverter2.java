import java.util.Scanner;

// Q5. UnitConverter - Yards/Feet, Meters/Inches, Inches/Centimeters conversions
public class UnitConverter2 {

    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        double feet = yards * yards2feet;
        return feet;
    }

    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        double yards = feet * feet2yards;
        return yards;
    }

    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        double inches = meters * meters2inches;
        return inches;
    }

    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        double meters = inches * inches2meters;
        return meters;
    }

    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        double cm = inches * inches2cm;
        return cm;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Unit Converter - Yards/Feet/Inches/Meters/Centimeters ===\n");

        System.out.print("Enter distance in yards: ");
        double yards = input.nextDouble();
        double feet = convertYardsToFeet(yards);
        System.out.println(yards + " yards = " + feet + " feet\n");

        System.out.print("Enter distance in feet: ");
        double feetInput = input.nextDouble();
        double yardsResult = convertFeetToYards(feetInput);
        System.out.println(feetInput + " feet = " + yardsResult + " yards\n");

        System.out.print("Enter distance in meters: ");
        double meters = input.nextDouble();
        double inches = convertMetersToInches(meters);
        System.out.println(meters + " meters = " + inches + " inches\n");

        System.out.print("Enter distance in inches: ");
        double inchesInput = input.nextDouble();
        double metersResult = convertInchesToMeters(inchesInput);
        System.out.println(inchesInput + " inches = " + metersResult + " meters\n");

        System.out.print("Enter distance in inches: ");
        double inchesInput2 = input.nextDouble();
        double cm = convertInchesToCm(inchesInput2);
        System.out.println(inchesInput2 + " inches = " + cm + " centimeters\n");

        input.close();
    }
}
