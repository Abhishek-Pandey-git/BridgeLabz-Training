import java.util.Scanner;

public class FrequencyUsingUnique {
    
    // find unique characters
    public static char[] uniqueCharacters(String text) {
        int len = text.length();
        char[] unique = new char[len];
        int count = 0;
        
        for(int i = 0; i<len; i++) {
            char current = text.charAt(i);
            boolean found = false;
            
            for(int j=0; j<i; j++) {
                if(text.charAt(j) == current) {
                    found = true;
                    break;
                }
            }
            
            if(!found) {
                unique[count] = current;
                count++;
            }
        }
        
        char[] result = new char[count];
        for(int i=0; i<count; i++) {
            result[i] = unique[i];
        }
        return result;
    }
    
    // find frequency using unique characters
    public static String[][] findFrequencyWithUnique(String text) {
        int[] freq = new int[256];
        
        // calculate frequency
        for(int i = 0; i<text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        
        // get unique characters
        char[] uniqueChars = uniqueCharacters(text);
        
        // store result
        String[][] result = new String[uniqueChars.length][2];
        for(int i=0; i<uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Character Frequency using Unique Characters");
        System.out.print("Enter text: ");
        String text = input.nextLine();
        
        String[][] result = findFrequencyWithUnique(text);
        
        System.out.println("Frequencies:");
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i][0] + " appears " + result[i][1] + " times");
        }
        
        input.close();
    }
}
