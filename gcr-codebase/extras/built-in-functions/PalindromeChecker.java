import java.util.Scanner;

//check if string is palindrome
public class PalindromeChecker {
    
    //function to get input
    public static String getInput(Scanner input)
    {
        System.out.println("enter a string: ");
        String str=input.nextLine();
        return str;
    }
    
    //function to check palindrome
    public static boolean checkPalindrome(String str)
    {
        int left=0;
        int right=str.length()-1;
        
        while(left<right)
        {
            if(str.charAt(left)!=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
    
    //function to display result
    public static void displayResult(String str,boolean isPalindrome)
    {
        if(isPalindrome)
        {
            System.out.println("\""+str+"\" is a palindrome");
        }
        else
        {
        System.out.println("\""+str+"\" is not a palindrome");
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String str=getInput(input);
        
        boolean result=checkPalindrome(str);
        
        displayResult(str,result);
        
        input.close();
    }
}
