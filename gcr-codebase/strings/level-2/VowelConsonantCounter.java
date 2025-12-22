import java.util.Scanner;

public class VowelConsonantCounter {
    
    // method to check if character is vowel or consonant
    public static String checkCharacter(char ch) {
        
        // converting to lowercase if uppercase
        if(ch>='A' && ch<='Z'){
            ch = (char)(ch + 32);
        }
        
        // checking if vowel
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return "Vowel";
        }
        
        // checking if consonant
        if(ch>='a' && ch<='z') {
            return "Consonant";
        }
        
        return "Not a Letter";
    }
    
    
    // method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String str) {
        int[] result = new int[2];
        int vowelCount=0;
        int consonantCount = 0;
        
        // looping through string
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            
            String type = checkCharacter(ch);
            
            if(type.equals("Vowel")) {
                vowelCount++;
            }
            else if(type.equals("Consonant")){
                consonantCount++;
            }
        }
        
        result[0] = vowelCount;
        result[1]=consonantCount;
        
        return result;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = input.nextLine();
        
        
        // calling method to count vowels and consonants
        int[] counts = countVowelsAndConsonants(text);
        
        
        // displaying results
        System.out.println("\nVowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
        
        input.close();
    }
    
}
