import java.util.Scanner;
//Q4
public class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        
        System.out.println("Enter up to 10 numbers (enter 0 or negative to stop):");
        
        // taking input until 0 or negative or array is full
        while(true){
            System.out.print("Enter a number: ");
            double number = input.nextDouble();
            
            if(number <= 0){
                break;
            }
            
            numbers[index] = number;
            index++;
            
            if(index == 10){
                break;
            }
        }
        
        // calculating total of all numbers
        for(int i = 0; i < index; i++){
            total += numbers[i];
        }
        
        // displaying all numbers
        System.out.println("\nNumbers entered:");
        for(int i = 0; i < index; i++){
            System.out.println(numbers[i]);
        }
        
        System.out.println("\nSum of all numbers: " + total);
        
        input.close();
    }
}
