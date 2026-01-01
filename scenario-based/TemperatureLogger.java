import java.util.Scanner;

public class TemperatureLogger {

    static final int TOTAL_DAYS = 7;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] dailyTemperatures = new double[TOTAL_DAYS];

        readTemperatures(scanner, dailyTemperatures);

        double averageTemperature = calculateAverage(dailyTemperatures);
        double maximumTemperature = findMaximum(dailyTemperatures);

        displayReport(averageTemperature, maximumTemperature);

        scanner.close();
    }

    // Reads temperature values
    static void readTemperatures(Scanner scanner, double[] temperatures) {
        System.out.println("Temperature Logger");
        System.out.println("------------------");

        for (int day = 0; day < temperatures.length; day++) {
            System.out.print("Enter temperature for Day " + (day + 1) + ": ");
            temperatures[day] = scanner.nextDouble();
        }
    }

    // Calculates average temperature
    static double calculateAverage(double[] temperatures) {
        double sum = 0;

        for (double temperature : temperatures) {
            sum += temperature;
        }

        return sum / temperatures.length;
    }

    // Finds maximum temperature using if
    static double findMaximum(double[] temperatures) {
        double maxTemperature = temperatures[0];

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > maxTemperature) {
                maxTemperature = temperatures[i];
            }
        }

        return maxTemperature;
    }

    // Displays result
    static void displayReport(double average, double maximum) {
        System.out.println("\nTemperature Report");
        System.out.println("------------------");
        System.out.printf("Average Temperature : %.2f°C%n", average);
        System.out.printf("Maximum Temperature : %.2f°C%n", maximum);
    }
}

