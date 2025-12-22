import java.util.Scanner;

public class UppercaseConverter {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the text:");
        String text = input.nextLine();
        
        
        // converting using custom method
        String upper1 = convertToUpperCase(text);
        System.out.println("Uppercase using custom method: "+upper1);
        
        
        // using built in method
        String upper2 = text.toUpperCase();
        System.out.println("Uppercase using toUpperCase(): "+upper2);
        
        
        // compare both strings
        boolean result = compareStrings(upper1,upper2);
        
        if(result==true){
            System.out.println("\nBoth strings are equal");
        }
        else{
            System.out.println("\nBoth strings are not equal");
        }
        
        input.close();
    }
    
    
    // method to convert string to uppercase using ASCII
    public static String convertToUpperCase(String str) {
        String result="";
        
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            // check if character is lowercase
            if(ch>='a' && ch<='z'){
                // converting to uppercase by subtracting 32
                char upperChar = (char)(ch-32);
                result = result + upperChar;
            }
            else{
                result = result + ch;
            }
        }
        
        return result;
    }
    
    
    // comparing two strings character by character
    public static boolean compareStrings(String s1, String s2) {
        
        if(s1.length()!=s2.length()){
            return false;
        }
        
        // loop through both strings
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        
        return true;
    }
    
}
