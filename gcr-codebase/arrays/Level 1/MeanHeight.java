import java.util.Scanner;
//Q6
public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] heights = new double[11];
        
        // taking input for heights
        System.out.println("Enter the heights of 11 players:");
        for(int i = 0; i < heights.length; i++){
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
        }
        
        // calculating sum of all heights
        double sum = 0.0;
        for(int i = 0; i < heights.length; i++){
            sum += heights[i];
        }
        
        // calculating and displaying mean height
        double mean = sum / 11;
        
        System.out.println("\nMean height of the football team: " + mean);
        
        input.close();
    }
}
