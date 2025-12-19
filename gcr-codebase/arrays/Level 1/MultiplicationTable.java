import java.util.Scanner;
//Q3
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        
        // taking input
        System.out.print("Enter a number: ");
        number = input.nextInt();
        
        int[] multiplicationTable = new int[10];
        
        // calculating multiplication table from 1 to 10
        for(int i = 1; i <= 10; i++){
            multiplicationTable[i - 1] = number * i;
        }
        
        // displaying the multiplication table
        System.out.println("\nMultiplication Table of " + number + ":");
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " * " + i + " = " + multiplicationTable[i - 1]);
        }
        
        input.close();
    }
}
