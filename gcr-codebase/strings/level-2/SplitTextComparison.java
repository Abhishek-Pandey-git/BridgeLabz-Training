import java.util.Scanner;

public class SplitTextComparison {
    
    // finding length without length()
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
    
    
    // splitting text without split()
    public static String[] splitText(String text) {
        // counting words
        int wordCount=0;
        boolean inWord = false;
        
        for(int i=0;i<getLength(text);i++){
            char ch = text.charAt(i);
            
            if(ch!=' ' && !inWord){
                wordCount++;
                inWord=true;
            }
            else if(ch==' '){
                inWord = false;
            }
        }
        
        
        // storing space indexes
        int[] spaceIndexes = new int[wordCount+1];
        spaceIndexes[0]=-1;
        int spaceCount=1;
        
        for(int i=0;i<getLength(text);i++){
            if(text.charAt(i)==' '){
                boolean alreadyAdded = false;
                if(i>0 && text.charAt(i-1)==' '){
                    alreadyAdded=true;
                }
                
                if(!alreadyAdded && spaceCount<wordCount){
                    spaceIndexes[spaceCount]=i;
                    spaceCount++;
                }
            }
        }
        spaceIndexes[wordCount] = getLength(text);
        
        
        // extracting words using indexes
        String[] words = new String[wordCount];
        int wordIndex=0;
        
        for(int i=0;i<wordCount;i++){
            String word="";
            int start = spaceIndexes[i]+1;
            int end = spaceIndexes[i+1];
            
            for(int j=start;j<end;j++){
                if(text.charAt(j)!=' '){
                    word = word + text.charAt(j);
                }
            }
            
            if(getLength(word)>0){
                words[wordIndex]=word;
                wordIndex++;
            }
        }
        
        return words;
    }
    
    
    // comparing two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        
        if(arr1.length!=arr2.length){
            return false;
        }
        
        for(int i=0;i<arr1.length;i++){
            if(!arr1[i].equals(arr2[i])){
                return false;
            }
        }
        
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter text:");
        String text = input.nextLine();
        
        
        // using custom split method
        String[] words1 = splitText(text);
        System.out.println("\nWords using custom method:");
        for(int i=0;i<words1.length;i++){
            System.out.println(words1[i]);
        }
        
        
        // using built in split
        String[] words2 = text.split(" ");
        System.out.println("\nWords using split() method:");
        for(int i=0;i<words2.length;i++){
            if(words2[i].length()>0){
                System.out.println(words2[i]);
            }
        }
        
        
        // comparing arrays
        boolean result = compareArrays(words1,words2);
        
        if(result){
            System.out.println("\nBoth arrays are equal");
        }
        else{
            System.out.println("\nBoth arrays are not equal");
        }
        
        input.close();
    }
    
}
