import java.util.Scanner;

public class BmiCalculatorTeam {
    
    // Method to calculate BMI and return status along with BMI value
    public static String[] calculateBmiAndStatus(double weight, double heightCm) {
        String[] result = new String[2];
        
        // convert height from cm to meters
        double heightM = heightCm / 100.0;
        
        // BMI formula
        double bmi = weight / (heightM * heightM);
        
        result[0] = String.format("%.2f", bmi);
        
        // determine status based on BMI value
        if(bmi < 18.5) {
            result[1] = "Underweight";
        }
        else if(bmi >= 18.5 && bmi < 25) {
            result[1] = "Normal";
        }
        else if(bmi >= 25 && bmi < 30) {
            result[1] = "Overweight";
        }
        else {
            result[1] = "Obese";
        }
        
        return result;
    }
    
    // Method to process all team members data
    public static String[][] processBmiData(double[][] teamData) {
        int numPeople = teamData.length;
        String[][] bmiResults = new String[numPeople][4];
        
        for(int i=0; i<numPeople; i++) {
            double weight = teamData[i][0];
            double height = teamData[i][1];
            
            bmiResults[i][0] = String.valueOf(height); // height
            bmiResults[i][1] = String.valueOf(weight);  // weight
            
            // get BMI and status
            String[] bmiInfo = calculateBmiAndStatus(weight, height);
            bmiResults[i][2] = bmiInfo[0]; // BMI value
            bmiResults[i][3] = bmiInfo[1]; // status
        }
        
        return bmiResults;
    }
    
    // display results in tabular format
    public static void displayResults(String[][] results) {
        System.out.println("\nBMI Report:");
        
        for(int i = 0; i < results.length; i++) {
            System.out.println("Person " + (i+1) + ":");
            System.out.println("Height: " + results[i][0] + " cm");
            System.out.println("Weight: " + results[i][1] + " kg");
            System.out.println("BMI: " + results[i][2]);
            System.out.println("Status: " + results[i][3]);
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("BMI Calculator for Team of 10 Members");
        System.out.println("--------------------------------------");
        
        // 2D array to store weight and height
        double[][] teamData = new double[10][2];
        
        // take input for all team members
        for(int i=0; i<10; i++) {
            System.out.println("\nEnter details for Person " + (i+1) + ":");
            System.out.print("Weight (kg): ");
            teamData[i][0] = input.nextDouble();
            
            System.out.print("Height (cm): ");
            teamData[i][1] = input.nextDouble();
        }
        
        // process data and get results
        String[][] bmiResults = processBmiData(teamData);
        
        // display the results
        displayResults(bmiResults);
        
        input.close();
    }
}
