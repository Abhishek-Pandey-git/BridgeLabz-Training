import java.util.Scanner;

//check if number is prime
public class PrimeChecker {
    
    //function to check prime
    public static boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
        
        if(num==2)
        {
        return true;
        }
        
        //check divisibility
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                return false; //not prime
            }
        }
        
        return true; //is prime
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter a number: ");
        int number=input.nextInt();
        
        //check if prime
        boolean result=isPrime(number);
        
        if(result)
        {
            System.out.println(number+" is prime");
        }
        else
        {
        System.out.println(number+" is not prime");
        }
        
        input.close();
    }
}
