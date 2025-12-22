import java.util.Scanner;

public class LowercaseConverter {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the text:");
        String text = input.nextLine();
        
        
        // converting using user defined method
        String lower1 = convertToLowerCase(text);
        System.out.println("Lowercase using custom method: " + lower1);
        
        
        // using string built in method
        String lower2 = text.toLowerCase();
        System.out.println("Lowercase using toLowerCase(): " + lower2);
        
        
        // comparing both results
        boolean result = compareStrings(lower1, lower2);
        
        if(result == true) {
            System.out.println("\nBoth strings are same");
        }
        else {
            System.out.println("\nBoth strings are different");
        }
        
        input.close();
    }
    
    
    // converting string to lowercase using ASCII values
    public static String convertToLowerCase(String str) {
        String result = "";
        
        for(int i = 0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            // checking if character is uppercase
            if(ch>='A' && ch<='Z') {
                // add 32 to convert to lowercase
                char lowerChar = (char)(ch + 32);
                result = result + lowerChar;
            }
            else {
                result = result + ch;
            }
        }
        
        return result;
    }
    
    
    // method to compare two strings
    public static boolean compareStrings(String s1, String s2) {
        
        if(s1.length() != s2.length()) {
            return false;
        }
        
        // comparing character by character
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
    
}
