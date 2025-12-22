import java.util.Scanner;

public class FirstNonRepeatingChar {
    
    // find first non-repeating character
    public static char findFirstNonRepeating(String text) {
        int[] frequency = new int[256];
        
        // count frequency of each character
        for(int i = 0; i<text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        
        // find first character with frequency 1
        for(int i=0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if(frequency[ch] == 1) {
                return ch;
            }
        }
        
        return '\0'; // return null character if no non-repeating char found
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("First Non-Repeating Character Finder");
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
        char result = findFirstNonRepeating(text);
        
        if(result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found");
        }
        
        input.close();
    }
}
