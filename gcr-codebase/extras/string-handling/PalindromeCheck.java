import java.util.Scanner;

// program to check palindrome
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter string: ");
        String str=input.nextLine();
        
        //reverse the string first
        String reversed = "";
        for(int i=str.length()-1;i>=0;i--)
        {
            reversed=reversed+str.charAt(i);
        }
        
        //compare original and reversed
        if(str.equals(reversed))
        {
            System.out.println("palindrome");
        }
        else
        {
        System.out.println("not palindrome");
        }
        
        input.close();
    }
}
