import java.util.Scanner;
//Q5
public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        
        // taking input
        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        int[] multiplicationResult = new int[4];
        
        // calculating multiplication table from 6 to 9
        for(int i = 6; i <= 9; i++){
            multiplicationResult[i - 6] = number * i;
        }
        
        // displaying the multiplication table from 6 to 9
        System.out.println("\nMultiplication Table of " + number + " (from 6 to 9):");
        for(int i = 6; i <= 9; i++){
            System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
        }
        
        input.close();
    }
}
