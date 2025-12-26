import java.util.Scanner;

//calculate GCD and LCM
public class GcdLcmCalculator {
    
    //function to calculate GCD
    public static int calculateGCD(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    
    //function to calculate LCM
    public static int calculateLCM(int a,int b,int gcd)
    {
        int lcm=(a*b)/gcd;
        return lcm;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter first number: ");
        int num1=input.nextInt();
        
        System.out.println("enter second number: ");
        int num2=input.nextInt();
        
        //calculate GCD
        int gcd=calculateGCD(num1,num2);
        System.out.println("GCD: "+gcd);
        
        //calculate LCM
        int lcm=calculateLCM(num1,num2,gcd);
        System.out.println("LCM: "+lcm);
        
        input.close();
    }
}
