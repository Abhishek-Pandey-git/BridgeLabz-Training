import java.util.Scanner;

public class TrimString {
    
    // method to find trim points
    public static int[] getTrimPoints(String str) {
        int[] result = new int[2];
        int startIndex=0;
        int endIndex = str.length()-1;
        
        // finding start point
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                startIndex=i;
                break;
            }
        }
        
        // finding end point
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                endIndex = i+1;
                break;
            }
        }
        
        result[0]=startIndex;
        result[1] = endIndex;
        
        return result;
    }
    
    
    // creating substring using charAt
    public static String createSubstring(String text, int start, int end) {
        String result="";
        
        for(int i=start;i<end;i++){
            result = result + text.charAt(i);
        }
        
        return result;
    }
    
    
    // comparing two strings
    public static boolean compareStrings(String s1,String s2) {
        
        if(s1.length()!=s2.length()){
            return false;
        }
        
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            }
        }
        
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string with spaces:");
        String text = input.nextLine();
        
        
        // getting trim points
        int[] points = getTrimPoints(text);
        int start = points[0];
        int end = points[1];
        
        
        // creating substring using custom method
        String trimmed1 = createSubstring(text, start, end);
        System.out.println("Trimmed using custom method: '" + trimmed1 + "'");
        
        
        // using built in trim method
        String trimmed2 = text.trim();
        System.out.println("Trimmed using trim(): '" + trimmed2 + "'");
        
        
        // comparing both strings
        boolean result = compareStrings(trimmed1,trimmed2);
        
        if(result){
            System.out.println("\nBoth strings are equal");
        }
        else{
            System.out.println("\nBoth strings are not equal");
        }
        
        input.close();
    }
    
}
