import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // User input
        System.out.print("Enter weight in kg: ");
        double weightKg = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        double heightMeter = heightCm / 100;
        double bmi = weightKg / (heightMeter * heightMeter);
        String status;

        // BMI status
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        System.out.println("\nBMI: " + bmi);
        System.out.println("Weight Status: " + status);

        input.close();
    }
}

