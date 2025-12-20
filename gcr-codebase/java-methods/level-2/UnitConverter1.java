import java.util.Scanner;

// Q4. UnitConverter - Distance conversions (km/miles and meters/feet)
public class UnitConverter1 {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        double miles = km * km2miles;
        return miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        double km = miles * miles2km;
        return km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        double feet = meters * meters2feet;
        return feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        double meters = feet * feet2meters;
        return meters;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Unit Converter - Distance Conversions ===\n");

        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();
        double miles = convertKmToMiles(km);
        System.out.println(km + " km = " + miles + " miles\n");

        System.out.print("Enter distance in miles: ");
        double milesInput = input.nextDouble();
        double kmResult = convertMilesToKm(milesInput);
        System.out.println(milesInput + " miles = " + kmResult + " km\n");

        System.out.print("Enter distance in meters: ");
        double meters = input.nextDouble();
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters = " + feet + " feet\n");

        System.out.print("Enter distance in feet: ");
        double feetInput = input.nextDouble();
        double metersResult = convertFeetToMeters(feetInput);
        System.out.println(feetInput + " feet = " + metersResult + " meters\n");

        input.close();
    }
}
