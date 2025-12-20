import java.util.Scanner;

// Q7. Program to find factors and perform various operations
public class FactorOperations {
	
	public static int[] findFactors(int number){
		int count=0;
		
		for(int i=1;i<=number;i++){
			if(number%i==0){
				count++;
			}
		}
		
		int[] factors=new int[count];
		int index=0;
		
		for(int i=1;i<=number;i++){
			if(number%i==0){
				factors[index]=i;
				index++;
			}
		}
		
		return factors;
	}
	
	public static int findGreatestFactor(int[] factors){
		int greatest=factors[0];
		
		for(int i=1;i<factors.length;i++){
			if(factors[i]>greatest){
				greatest=factors[i];
			}
		}
		
		return greatest;
	}
	
	public static int findSumOfFactors(int[] factors){
		int sum=0;
		
		for(int i=0;i<factors.length;i++){
			sum+=factors[i];
		}
		
		return sum;
	}
	
	public static long findProductOfFactors(int[] factors){
		long product=1;
		
		for(int i=0;i<factors.length;i++){
			product*=factors[i];
		}
		
		return product;
	}
	
	public static double findProductOfCubeOfFactors(int[] factors){
		double product=1;
		
		for(int i=0;i<factors.length;i++){
			double cube=Math.pow(factors[i],3);
			product*=cube;
		}
		
		return product;
	}
	
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number=input.nextInt();
		
		int[] factors=findFactors(number);
		
		System.out.print("\nFactors of "+number+" are: ");
		for(int i=0;i<factors.length;i++){
			System.out.print(factors[i]+" ");
		}
		System.out.println();
		
		int greatest=findGreatestFactor(factors);
		System.out.println("\nGreatest factor: "+greatest);
		
		int sum=findSumOfFactors(factors);
		System.out.println("Sum of factors: "+sum);
		
		long product=findProductOfFactors(factors);
		System.out.println("Product of factors: "+product);
		
		double cubeProduct=findProductOfCubeOfFactors(factors);
		System.out.println("Product of cube of factors: "+cubeProduct);
		
		input.close();
	}
}
