import java.util.Scanner;

public class ShortestAndLongestWord {
    
    // method to split text into words without split()
    public static String[] splitIntoWords(String text) {
        // counting words first
        int wordCount = 0;
        boolean isInWord=false;
        
        for(int i=0; i<getLength(text); i++) {
            char ch = text.charAt(i);
            
            if(ch!=' ' && !isInWord) {
                wordCount++;
                isInWord = true;
            }
            else if(ch==' '){
                isInWord=false;
            }
        }
        
        
        // now creating array and storing words
        String[] wordArray = new String[wordCount];
        int index=0;
        String word="";
        
        for(int i=0; i<getLength(text); i++) {
            char ch = text.charAt(i);
            
            if(ch!=' '){
                word = word + ch;
            }
            else{
                if(getLength(word) > 0) {
                    wordArray[index] = word;
                    index++;
                    word = "";
                }
            }
        }
        
        // adding last word
        if(getLength(word)>0) {
            wordArray[index]=word;
        }
        
        return wordArray;
    }
    
    
    // finding length without using length()
    public static int getLength(String str) {
        int count=0;
        
        while(true){
            try{
                char c = str.charAt(count);
                count++;
            }
            catch(Exception e){
                break;
            }
        }
        
        return count;
    }
    
    
    // creating 2D array with word and its length
    public static String[][] getWordLengthArray(String[] words) {
        String[][] result = new String[words.length][2];
        
        for(int i=0;i<words.length;i++) {
            result[i][0] = words[i];
            
            // getting length of word
            int len = getLength(words[i]);
            
            // converting to string using valueOf
            result[i][1] = String.valueOf(len);
        }
        
        return result;
    }
    
    
    // finding shortest and longest string
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int[] result = new int[2];
        
        // initializing with first word length
        int shortest = Integer.parseInt(wordLengthArray[0][1]);
        int longest = Integer.parseInt(wordLengthArray[0][1]);
        
        
        // looping through all words
        for(int i=1; i<wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);
            
            if(currentLength < shortest) {
                shortest = currentLength;
            }
            
            if(currentLength>longest) {
                longest = currentLength;
            }
        }
        
        result[0] = shortest;
        result[1]=longest;
        
        return result;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // taking input from user
        System.out.println("Enter the text:");
        String text = input.nextLine();
        
        
        // splitting text into words
        String[] words = splitIntoWords(text);
        
        
        // creating 2D array with words and lengths
        String[][] wordLengthArray = getWordLengthArray(words);
        
        
        // finding shortest and longest words
        int[] result = findShortestAndLongest(wordLengthArray);
        
        
        // displaying the results
        System.out.println("\nShortest word length: " + result[0]);
        System.out.println("Longest word length: " + result[1]);
        
        System.out.println("\nShortest word(s):");
        for(int i=0; i<wordLengthArray.length; i++){
            int len = Integer.parseInt(wordLengthArray[i][1]);
            if(len == result[0]){
                System.out.println(wordLengthArray[i][0]);
            }
        }
        
        System.out.println("\nLongest word(s):");
        for(int i=0; i<wordLengthArray.length; i++){
            int len = Integer.parseInt(wordLengthArray[i][1]);
            if(len==result[1]){
                System.out.println(wordLengthArray[i][0]);
            }
        }
        
        input.close();
    }
    
}
