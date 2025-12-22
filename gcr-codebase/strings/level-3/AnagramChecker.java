import java.util.Scanner;

public class AnagramChecker {
    
    // check if two strings are anagrams
    public static boolean checkAnagram(String text1, String text2) {
        // check if lengths are equal
        if(text1.length() != text2.length()) {
            return false;
        }
        
        // frequency arrays for both strings
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        
        // calculate frequency for text1
        for(int i=0; i<text1.length(); i++) {
            char ch = text1.charAt(i);
            freq1[ch]++;
        }
        
        // calculate frequency for text2
        for(int i = 0; i<text2.length(); i++) {
            char ch = text2.charAt(i);
            freq2[ch]++;
        }
        
        // compare frequencies
        for(int i=0; i<256; i++) {
            if(freq1[i] != freq2[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Anagram Checker");
        System.out.print("Enter first string: ");
        String text1 = input.nextLine();
        
        System.out.print("Enter second string: ");
        String text2 = input.nextLine();
        
        boolean isAnagram = checkAnagram(text1, text2);
        
        if(isAnagram) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }
        
        input.close();
    }
}
