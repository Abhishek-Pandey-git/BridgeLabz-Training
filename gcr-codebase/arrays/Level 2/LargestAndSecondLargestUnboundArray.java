import java.util.Scanner;
//Q4
public class LargestAndSecondLargestUnboundArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//dECLARING THE NUMBER VARIABLE
		
		long number;
		
		//Taking input for the number variable
		number=input.nextLong();
		
       // declaring max length for array
	   int maxDigit=10;
	   
	   //Declaring the array
	   long[] digits=new long[maxDigit];
	   
	   
	   //declaring index variable
	   int index=0;
	   
	   //loop to extract each digit one by one
	   
	   while(number!=0){
		    if(index==maxDigit){
			   maxDigit+=10;
			   long[] tempArray=digits;
			   digits=new long[maxDigit];
			   // using array copy method
			   System.arraycopy(tempArray,0,digits,0,tempArray.length);
		   }
		   long tempDigit=number%10;
		   digits[index]=tempDigit;
		   index++;
		  
		   number/=10;
	   }
	   
	   //declaring variables to store largest and second largest digit
	   long largest=0,secondLargest=0;
	   
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
