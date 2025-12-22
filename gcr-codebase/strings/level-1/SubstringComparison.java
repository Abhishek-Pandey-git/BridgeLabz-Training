import java.util.Scanner;

public class SubstringComparison {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String str = input.next();
        
        System.out.println("Enter start index:");
        int start = input.nextInt();
        
        System.out.println("Enter end index:");
        int end = input.nextInt();
        
        // using charAt method
        String sub1 = getSubstringUsingCharAt(str, start, end);
        System.out.println("Substring using charAt: " + sub1);
        
        
        String sub2 = str.substring(start, end);
        System.out.println("Substring using substring(): " + sub2);
        
        
        boolean result = compareStrings(sub1, sub2);
        
        if(result == true) {
            System.out.println("Both substrings are equal");
        }
        else {
            System.out.println("Both substrings are not equal");
        }
        
        input.close();
    }
    
    
    public static String getSubstringUsingCharAt(String text, int startIndex, int endIndex) {
        String result = "";
        
        for(int i = startIndex; i < endIndex; i++) {
            result = result + text.charAt(i);
        }
        
        return result;
    }
    
    
    public static boolean compareStrings(String s1, String s2) {
        
        if(s1.length() != s2.length()) {
            return false;
        }
        
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
    
}
