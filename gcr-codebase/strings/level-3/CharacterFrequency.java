import java.util.Scanner;

public class CharacterFrequency {
    
    // find frequency of characters
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];
        
        // calculate frequency
        for(int i=0; i<text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }
        
        // count how many unique characters
        int uniqueCount = 0;
        for(int i=0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if(frequency[ch] > 0) {
                uniqueCount++;
                frequency[ch] = -frequency[ch]; // mark as counted
            }
        }
        
        // reset frequency array
        for(int i=0; i<256; i++) {
            if(frequency[i] < 0) {
                frequency[i] = -frequency[i];
            }
        }
        
        // store characters and frequencies
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        
        for(int i=0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if(frequency[ch] > 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(frequency[ch]);
                frequency[ch] = 0; // mark as stored
                index++;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Character Frequency Counter");
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
        String[][] frequencies = findFrequency(text);
        
        System.out.println("Character frequencies:");
        for(int i = 0; i<frequencies.length; i++) {
            System.out.println(frequencies[i][0] + " : " + frequencies[i][1]);
        }
        
        input.close();
    }
}
