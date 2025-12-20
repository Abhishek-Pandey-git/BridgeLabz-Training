import java.util.Scanner;

// Wind Chill Calculator
public class WindChillCalculator {
    
    public static double calculateWindChill(double temperature, double windSpeed) {
        // Calculate wind chill using the given formula
        double windChill = 35.74 + (0.6215 * temperature) + 
                          ((0.4275 * temperature) - 35.75) * Math.pow(windSpeed, 0.16);
        
        return windChill;
    }
    
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // Get temperature from user
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = input.nextDouble();
        
        // Get wind speed from user
        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = input.nextDouble();
        
        // Calculate wind chill using method
        double windChill = calculateWindChill(temperature, windSpeed);
        
        // Display the result
        System.out.println("The wind chill temperature is: " + windChill + " Fahrenheit");
        
      
        input.close();
    }
}
