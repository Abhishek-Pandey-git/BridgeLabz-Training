import java.util.Scanner;

// Q6. UnitConverter - Temperature, Weight, Volume conversions
public class UnitConverter3 {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        double kilograms = pounds * pounds2kilograms;
        return kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        double pounds = kilograms * kilograms2pounds;
        return pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        double liters = gallons * gallons2liters;
        return liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        double gallons = liters * liters2gallons;
        return gallons;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Unit Converter - Temperature/Weight/Volume ===\n");

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsius = convertFahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " °F = " + celsius + " °C\n");

        System.out.print("Enter temperature in Celsius: ");
        double celsiusInput = input.nextDouble();
        double fahrenheitResult = convertCelsiusToFahrenheit(celsiusInput);
        System.out.println(celsiusInput + " °C = " + fahrenheitResult + " °F\n");

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        double kilograms = convertPoundsToKilograms(pounds);
        System.out.println(pounds + " pounds = " + kilograms + " kg\n");

        System.out.print("Enter weight in kilograms: ");
        double kilogramsInput = input.nextDouble();
        double poundsResult = convertKilogramsToPounds(kilogramsInput);
        System.out.println(kilogramsInput + " kg = " + poundsResult + " pounds\n");

        System.out.print("Enter volume in gallons: ");
        double gallons = input.nextDouble();
        double liters = convertGallonsToLiters(gallons);
        System.out.println(gallons + " gallons = " + liters + " liters\n");

        System.out.print("Enter volume in liters: ");
        double litersInput = input.nextDouble();
        double gallonsResult = convertLitersToGallons(litersInput);
        System.out.println(litersInput + " liters = " + gallonsResult + " gallons\n");

        input.close();
    }
}
