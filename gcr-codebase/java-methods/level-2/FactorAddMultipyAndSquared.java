import java.util.Scanner;


// Q1. Factor manipulation problem
public class FactorAddMultipyAndSquared {
	
	public static double findSquaredSum(int[] factors){
		double squaredSum=0;
		
		for(int i=0;i<factors.length;i++){
			double tempValue=Math.pow(factors[i],2);
			squaredSum+=tempValue;
		}
		
		return squaredSum;
	}
	
	public static int findProduct(int[] factors){
		int product=1;
		
		for(int i=0;i<factors.length;i++){
			product*=factors[i];
		}
		return product;
		
	}
	
	public static int findTotal(int[] factors){
		int sum=0;
		
		for(int i=0;i<factors.length;i++){
			sum+=factors[i];
		}
		
		return sum;
	}
	
	public static int[] findFactors(int number){
		int count=0;
		
		for(int i=1;i<number;i++){
			if(number%i==0){
				count++;
			}
		}
		
		int[] factors=new int[count];
		
		//loop for finding the factors and store them into array
		int index=0;
		for(int i=1;i<number;i++){
			if(number%i==0){
				factors[index]=i;
				index++;
			}
		}
		
		return factors;
	}
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
	
		System.out.println("Enter a number: ");
		int number=input.nextInt();
	
		int[] factors=findFactors(number);
	
		int[] factors=findFactors(number);
		
		int total=findTotal(factors);
		
		int product=findProduct(factors);
		
		double squaredSum=findSquaredSum(factors);
		
		
		System.out.print("Factors of "+ number+ " are: ");
		for(int i=0;i<factors.length;i++){
			System.out.print(factors[i]+ " ");
			
		}
		System.out.println();
		
		System.out.println("Sum of squared value of factors is: "+squaredSum);
		
		input.close();
		
	}
	
    
    
    
}
