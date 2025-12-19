import java.util.Scanner;
//Q7
public class OddEvenArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
	   int number;
       
		// taking input
		System.out.print("Enter a number: ");
		number=input.nextInt();
		System.out.println();
		
		//Checking if the number is a natural number
		if(number<=0){
			System.err.println("Not a Natural Number ");
			
			//Exiting the excution with code 0
			System.exit(0);
		}
		
		// Calculating size for the both the arrays
		int size=(number/2)+1;
		
		int evenIndex=0, oddIndex=0;
		
		// Declaring the arrays
		int[] evenArray=new int[size], oddArray=new int[size];
		
		for(int i=1;i<=number;i++){
			//Checking if the current number is even or odd
			
			if(i%2==0){
				evenArray[evenIndex]=i;
				evenIndex++;
			}
			else{
				oddArray[oddIndex]=i;
				oddIndex++;
			}
		}
		
		oddIndex=0;
		evenIndex=0;
		
		//Printing even numbers
		System.out.print("Even Elements: ");
		while(evenIndex<evenArray.length){
			if(evenArray[evenIndex]==0){
				evenIndex++;
				continue;
			}
			System.out.print(evenArray[evenIndex]+ ", ");
			evenIndex++;
		}
		
		System.out.println();
		
		//Printing odd numbers
		System.out.print("Odd Elements ");
		
		while(oddIndex<oddArray.length){
			if(oddArray[oddIndex]==0){
				oddIndex++;
				continue;
			}
			System.out.print(oddArray[oddIndex]+ ", ");
			oddIndex++;
		}
		
	
        input.close();
    }
}
