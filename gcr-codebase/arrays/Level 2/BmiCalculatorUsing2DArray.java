import java.util.Scanner;
//Q7
public class BmiCalculatorUsing2DArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter number of persons: ");
        int numberOfPersons = scanner.nextInt();

        /*
         * personData[i][0] -> Height (meters)
         * personData[i][1] -> Weight (kg)
         * personData[i][2] -> BMI
         */
        double[][] personData = new double[numberOfPersons][3];

        // Array to store weight status of each person
        String[] weightStatus = new String[numberOfPersons];

        // Take input for height and weight with validation
        for (int i = 0; i < numberOfPersons; i++) {

            System.out.println("\nEnter details for person " + (i + 1));

            // Input height (must be positive)
            while (true) {
                System.out.print("Height (in meters): ");
                personData[i][0] = scanner.nextDouble();

                if (personData[i][0] > 0) {
                    break;
                } else {
                    System.out.println("Height must be a positive value. Please re-enter.");
                }
            }

            // Input weight (must be positive)
            while (true) {
                System.out.print("Weight (in kg): ");
                personData[i][1] = scanner.nextDouble();

                if (personData[i][1] > 0) {
                    break;
                } else {
                    System.out.println("Weight must be a positive value. Please re-enter.");
                }
            }
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < numberOfPersons; i++) {

            // BMI calculation
            personData[i][2] =
                    personData[i][1] /
                    (personData[i][0] * personData[i][0]);

            // Determine weight status based on BMI table
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the details of each person
        System.out.println("\n----- BMI REPORT -----");

        for (int i = 0; i < numberOfPersons; i++) {

            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height (m): " + personData[i][0]);
            System.out.println("Weight (kg): " + personData[i][1]);
            System.out.printf("BMI: %.2f%n", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
        }

        scanner.close();
    }
}
