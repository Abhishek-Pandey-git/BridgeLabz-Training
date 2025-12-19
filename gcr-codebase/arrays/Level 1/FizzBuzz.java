import java.util.Scanner;
//Q2
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		int number;
		//Taking input from the user
		System.out.println("Enter a number: ");
		number=input.nextInt();
		
		//Declaring an String array to store words and arrays
		String[] array=new String[number+1];
		
		for(int i=0;i<=number;i++){
			if(i%3==0 && i%5==0){
				array[i]="FizzBuzz";
				
			}
			else if(i%3==0){
				array[i]="Fizz";
			}
			else if(i%5==0){
				array[i]="Buzz";
			}
			else{
				array[i]=String.valueOf(i);
			}
			
		}
		
		for(int i=0;i<=number;i++){
			System.out.println("position "+(i+1)+" = "+ array[i]);
		}
		
		
		
	 
        input.close();
    }
}
