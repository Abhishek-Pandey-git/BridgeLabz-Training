import java.util.Scanner;

//basic calculator
public class BasicCalculator {
    
    //addition function
    public static double add(double a,double b)
    {
        return a+b;
    }
    
    //subtraction function
    public static double subtract(double a,double b)
    {
        return a-b;
    }
    
    //multiplication function
    public static double multiply(double a,double b)
    {
        return a*b;
    }
    
    //division function
    public static double divide(double a,double b)
    {
        if(b==0)
        {
            System.out.println("error: cannot divide by zero");
            return 0;
        }
        return a/b;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter first number: ");
        double num1=input.nextDouble();
        
        System.out.println("enter second number: ");
        double num2=input.nextDouble();
        
        System.out.println("choose operation:");
        System.out.println("1. addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. division");
        int choice=input.nextInt();
        
        double result=0;
        
        if(choice==1)
        {
            result=add(num1,num2);
            System.out.println("result: "+result);
        }
        else if(choice==2)
        {
        result=subtract(num1,num2);
        System.out.println("result: "+result);
        }
        else if(choice==3)
        {
            result=multiply(num1,num2);
            System.out.println("result: "+result);
        }
        else if(choice==4)
        {
            result=divide(num1,num2);
            if(num2!=0)
            {
                System.out.println("result: "+result);
            }
        }
        else
        {
            System.out.println("invalid choice");
        }
        
        input.close();
    }
}
