import java.util.Scanner;

public class GameOfFiveNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       // declaring an array of size 5
	   
       int[] numbers=new int[5];
		// taking input
		
		for(int i=0;i<numbers.length;i++){
			System.out.print("Enter a number ");
			numbers[i]=input.nextInt();
		}
		
		// Determining if the number is negative, positive or zero
		
		for(int i=0;i<numbers.length;i++){
			// logic for negative
			if(numbers[i]<0){
				System.out.println("negative");
			}
			//logic for zero
			else if(numbers[i]==0){
				System.out.println("zero");
			}
			//logic for positive - even or odd
			else{
				if((numbers[i] & 1)==0){
					System.out.println("positive - even number");
				}
				else{
					System.out.println("positive - odd number");
				}
			}
		}   

		// comparing the first and last element of the array
		if(numbers[0]>numbers[numbers.length-1]){
			System.out.println("First is greater then last element");
			
		}
		else if(numbers[0]<numbers[numbers.length-1]){
			System.out.println("First element is smaller than the last ");
			
		}
		else{
			System.out.println("First element is equal to last element");
		}
        input.close();
    }
}
