import java.util.Scanner;

public class FrequencyNestedLoop {
    
    // find frequency using nested loops
    public static String[] findFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] freq = new int[characters.length];
        
        // calculate frequency
        for(int i=0; i<characters.length; i++) {
            freq[i] = 1;
            
            for(int j = i+1; j<characters.length; j++) {
                if(characters[i] == characters[j]) {
                    freq[i]++;
                    characters[j] = '0'; // mark as counted
                }
            }
        }
        
        // count unique characters
        int uniqueCount = 0;
        for(int i=0; i<characters.length; i++) {
            if(characters[i] != '0') {
                uniqueCount++;
            }
        }
        
        // store result
        String[] result = new String[uniqueCount];
        int index = 0;
        
        for(int i = 0; i<characters.length; i++) {
            if(characters[i] != '0') {
                result[index] = characters[i] + " - " + freq[i];
                index++;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Character Frequency using Nested Loops");
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
        String[] frequencies = findFrequency(text);
        
        System.out.println("Character Frequencies:");
        for(int i=0; i<frequencies.length; i++) {
            System.out.println(frequencies[i]);
        }
        
        input.close();
    }
}
