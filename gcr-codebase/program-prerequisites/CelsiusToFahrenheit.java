import java.util.Scanner;

// Program to convert Celsius to Fahrenheit
public class CelsiusToFahrenheit {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Formula: Fahrenheit = (Celsius * 9/5) + 32
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        
        scanner.close();
    }
}
