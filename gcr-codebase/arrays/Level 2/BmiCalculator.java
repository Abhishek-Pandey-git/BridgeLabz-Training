import java.util.Scanner;
//Q6
public class BmiCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // a. Take input for number of persons
        System.out.print("Enter number of persons: ");
        int numberOfPersons = scanner.nextInt();

        // b. Create arrays to store height, weight, BMI, and weight status
        double[] heightsInMeters = new double[numberOfPersons];
        double[] weightsInKg = new double[numberOfPersons];
        double[] bmiValues = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // c. Take input for height and weight of each person
        for (int i = 0; i < numberOfPersons; i++) {

            System.out.println("\nEnter details for person " + (i + 1));

            System.out.print("Height (in meters): ");
            heightsInMeters[i] = scanner.nextDouble();

            System.out.print("Weight (in kg): ");
            weightsInKg[i] = scanner.nextDouble();
        }

        // d. Calculate BMI and determine weight status
        for (int i = 0; i < numberOfPersons; i++) {

            // BMI calculation
            bmiValues[i] = weightsInKg[i] /
                    (heightsInMeters[i] * heightsInMeters[i]);

            // Determine weight status based on BMI table
            if (bmiValues[i] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmiValues[i] >= 18.5 && bmiValues[i] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmiValues[i] >= 25.0 && bmiValues[i] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // e. Display the results
        System.out.println("\n----- BMI REPORT -----");

        for (int i = 0; i < numberOfPersons; i++) {

            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height (m): " + heightsInMeters[i]);
            System.out.println("Weight (kg): " + weightsInKg[i]);
            System.out.printf("BMI: %.2f%n", bmiValues[i]);
            System.out.println("Status: " + weightStatus[i]);
        }

        scanner.close();
    }
}
