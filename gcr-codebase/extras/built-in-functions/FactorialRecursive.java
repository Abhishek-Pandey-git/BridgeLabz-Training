import java.util.Scanner;

//calculate factorial using recursion
public class FactorialRecursive {
    
    //recursive function to calculate factorial
    public static long calculateFactorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        
        return n*calculateFactorial(n-1);
    }
    
    //function to get input
    public static int getInput(Scanner input)
    {
        System.out.println("enter a number: ");
        int num=input.nextInt();
        return num;
    }
    
    //function to display output
    public static void displayOutput(int num,long factorial)
    {
        System.out.println("factorial of "+num+" is: "+factorial);
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int number=getInput(input);
        
        long result=calculateFactorial(number);
        
        displayOutput(number,result);
        
        input.close();
    }
}
