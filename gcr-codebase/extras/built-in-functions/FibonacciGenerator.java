import java.util.Scanner;

//generate fibonacci sequence
public class FibonacciGenerator {
    
    //function to generate and print fibonacci
    public static void generateFibonacci(int n)
    {
        int first=0;
        int second=1;
        
        System.out.println("fibonacci sequence:");
        
        for(int i=1;i<=n;i++)
        {
            System.out.println(first);
            
            int next=first+second;
            first=second;
            second=next;
        }
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter number of terms: ");
        int terms=input.nextInt();
        
        generateFibonacci(terms);
        
        input.close();
    }
}
