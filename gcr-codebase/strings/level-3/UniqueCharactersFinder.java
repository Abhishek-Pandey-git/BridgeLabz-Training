import java.util.Scanner;

public class UniqueCharactersFinder {
    
    // find length without using length() method
    public static int findLength(String text) {
        int count = 0;
        for(char c : text.toCharArray()) {
            count++;
        }
        return count;
    }
    
    // find unique characters in string
    public static char[] findUniqueChars(String text) {
        int len = findLength(text);
        char[] uniqueChars = new char[len];
        int uniqueCount = 0;
        
        for(int i=0; i<len; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            
            // check if character already exists
            for(int j=0; j<i; j++) {
                if(text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            if(isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        
        // create new array with actual unique characters
        char[] result = new char[uniqueCount];
        for(int i=0; i<uniqueCount; i++){
            result[i] = uniqueChars[i];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Find Unique Characters in a String");
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
        char[] uniqueChars = findUniqueChars(text);
        
        System.out.println("Unique characters:");
        for(int i=0; i<uniqueChars.length; i++) {
            System.out.print(uniqueChars[i] + " ");
        }
        System.out.println();
        
        input.close();
    }
}
