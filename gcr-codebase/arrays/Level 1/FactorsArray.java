import java.util.Scanner;
//Q8
public class FactorsArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // taking input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;
        
        // finding factors and storing in array
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                if(index == maxFactor){
                    // resizing array by doubling its size
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];
                    
                    for(int j = 0; j < factors.length; j++){
                        temp[j] = factors[j];
                    }
                    
                    factors = temp;
                }
                
                factors[index] = i;
                index++;
            }
        }
        
        // displaying the factors
        System.out.println("\nFactors of " + number + ":");
        for(int i = 0; i < index; i++){
            System.out.println(factors[i]);
        }
        
        input.close();
    }
}
