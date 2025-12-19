import java.util.Scanner;
//Q5
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int temp = number;
        int count = 0;
        
        // counting digits in the number
        if(temp == 0){
            count = 1;
        }
        else{
            temp = Math.abs(temp);
            while(temp > 0){
                count++;
                temp = temp / 10;
            }
        }
        
        int[] digits = new int[count];
        temp = Math.abs(number);
        
        // storing digits in array
        for(int i = count - 1; i >= 0; i--){
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        
        int[] reversedDigits = new int[count];
        
        // reversing the array
        for(int i = 0; i < count; i++){
            reversedDigits[i] = digits[count - 1 - i];
        }
        
        // displaying reversed number
        System.out.print("Reversed number: ");
        if(number < 0){
            System.out.print("-");
        }
        for(int i = 0; i < count; i++){
            System.out.print(reversedDigits[i]);
        }
        System.out.println();
        
        input.close();
    }
}
