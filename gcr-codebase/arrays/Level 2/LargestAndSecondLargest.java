import java.util.Scanner;
//Q2
public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//dECLARING THE NUMBER VARIABLE
		
		int number;
		
		//Taking input for the number variable
		number=input.nextInt();
		
       // declaring max length for array
	   int maxDigit=10;
	   
	   //Declaring the array
	   int[] digits=new int[maxDigit];
	   
	   
	   //declaring index variable
	   int index=0;
	   
	   //loop to extract each digit one by one
	   
	   while(number!=0){
		    if(index==maxDigit){
			   break;
		   }
		   int tempDigit=number%10;
		   digits[index]=tempDigit;
		   index++;
		  
		   number/=10;
	   }
	   
	   //declaring variables to store largest and second largest digit
	   int largest=0,secondLargest=0;
	   
	   //traversing array to find largest and second largest digit
	   
	   for(int i=0;i<digits.length;i++){
		   if(digits[i]>largest){
			   secondLargest=largest;
			   largest=digits[i];
			   
		   }
		   else if(digits[i]>secondLargest){
			   secondLargest=digits[i];
		   }
		   
	   }
	   
	   System.out.println("Largest - "+largest+ "\nSecond Largest - "+secondLargest);
	   
	   
	   
        
        input.close();
    }
}
