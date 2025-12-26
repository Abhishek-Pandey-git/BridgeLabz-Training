import java.util.Scanner;

//find maximum of three numbers
public class MaximumOfThree {
    
    //function to take input
    public static int getInput(Scanner input,String message)
    {
        System.out.println(message);
        int num=input.nextInt();
        return num;
    }
    
    //function to find max
    public static int findMax(int a,int b,int c)
    {
        int max=a;
        
        if(b>max)
        {
            max=b;
        }
        
        if(c>max)
        {
        max=c;
        }
        
        return max;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //get three numbers
        int num1=getInput(input,"enter first number: ");
        int num2=getInput(input,"enter second number: ");
        int num3=getInput(input,"enter third number: ");
        
        //calculate max
        int maximum=findMax(num1,num2,num3);
        
        System.out.println("maximum is: "+maximum);
        
        input.close();
    }
}
