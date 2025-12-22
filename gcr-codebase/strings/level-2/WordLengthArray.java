import java.util.Scanner;

public class WordLengthArray {
    
    // method to split text into words without using split()
    public static String[] splitTextIntoWords(String text) {
        // first count how many words are there
        int wordCount=0;
        boolean inWord = false;
        
        for(int i=0; i<getStringLength(text); i++) {
            char ch = text.charAt(i);
            
            if(ch != ' ' && !inWord) {
                wordCount++;
                inWord=true;
            }
            else if(ch == ' ') {
                inWord = false;
            }
        }
        
        
        // create array to store words
        String[] words = new String[wordCount];
        int wordIndex=0;
        String currentWord = "";
        
        for(int i=0; i<getStringLength(text); i++) {
            char ch = text.charAt(i);
            
            if(ch != ' ') {
                currentWord = currentWord + ch;
            }
            else {
                if(getStringLength(currentWord)>0) {
                    words[wordIndex] = currentWord;
                    wordIndex++;
                    currentWord="";
                }
            }
        }
        
        // adding last word if exists
        if(getStringLength(currentWord)>0) {
            words[wordIndex] = currentWord;
        }
        
        return words;
    }
    
    
    // method to find string length without using length()
    public static int getStringLength(String str) {
        int count = 0;
        
        while(true) {
            try {
                char c = str.charAt(count);
                count++;
            }
            catch(Exception e) {
                break;
            }
        }
        
        return count;
    }
    
    
    // method to create 2D array with word and length
    public static String[][] createWordLengthArray(String[] wordArray) {
        String[][] result = new String[wordArray.length][2];
        
        for(int i=0; i<wordArray.length; i++) {
            result[i][0] = wordArray[i];
            
            // finding length of each word
            int len = getStringLength(wordArray[i]);
            
            // converting integer to string using String.valueOf()
            result[i][1] = String.valueOf(len);
        }
        
        return result;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // taking complete text input from user
        System.out.println("Enter the text:");
        String text = input.nextLine();
        
        
        // splitting text into words using custom method
        String[] words = splitTextIntoWords(text);
        
        
        // creating 2D array with words and their lengths
        String[][] wordLengthArray = createWordLengthArray(words);
        
        
        // displaying result in tabular format
        System.out.println("\nWord\t\tLength");
        System.out.println("------------------------");
        for(int i=0; i<wordLengthArray.length; i++) {
            String word = wordLengthArray[i][0];
            int lengthValue = Integer.parseInt(wordLengthArray[i][1]);
            System.out.println(word + "\t\t" + lengthValue);
        }
        
        input.close();
    }
    
}
