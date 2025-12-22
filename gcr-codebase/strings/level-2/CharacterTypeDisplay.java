import java.util.Scanner;

public class CharacterTypeDisplay {
    
    // checking if character is vowel or consonant
    public static String checkCharType(char ch) {
        
        // converting uppercase to lowercase
        if(ch>='A' && ch<='Z') {
            ch = (char)(ch+32);
        }
        
        // checking for vowel
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
            return "Vowel";
        }
        
        // checking for consonant
        if(ch>='a' && ch<='z'){
            return "Consonant";
        }
        
        return "Not a Letter";
    }
    
    
    // creating 2D array with character and type
    public static String[][] getCharacterTypes(String str) {
        String[][] result = new String[str.length()][2];
        
        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            
            result[i][0] = String.valueOf(ch);
            
            // getting type
            String type = checkCharType(ch);
            result[i][1]=type;
        }
        
        return result;
    }
    
    
    // displaying table
    public static void displayTable(String[][] data) {
        System.out.println("\nCharacter and Type:");
        
        for(int i=0;i<data.length;i++){
            System.out.println(data[i][0] + " - " + data[i][1]);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String text = input.nextLine();
        
        
        // getting character type array
        String[][] charTypeArray = getCharacterTypes(text);
        
        
        // displaying in tabular format
        displayTable(charTypeArray);
        
        input.close();
    }
    
}
