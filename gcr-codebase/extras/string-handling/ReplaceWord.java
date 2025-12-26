import java.util.Scanner;

//program to replace a word in sentence
public class ReplaceWord {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter sentence: ");
        String sentence=input.nextLine();
        
        System.out.println("enter word to replace: ");
        String oldWord=input.nextLine();
        
        System.out.println("enter new word: ");
        String newWord=input.nextLine();
        
        String result=""; //store result here
        String currentWord=""; //to build current word
        
        //loop through each character
        for(int i=0;i<sentence.length();i++)
        {
            char ch=sentence.charAt(i);
            
            //if space or end of sentence
            if(ch==' ')
            {
                //check if current word matches old word
                if(currentWord.equals(oldWord))
                {
                    result=result+newWord;
                }
                else
                {
                result=result+currentWord;
                }
                result=result+' '; //add space
                currentWord=""; //reset current word
            }
            else
            {
                currentWord=currentWord+ch; //build word
            }
        }
        
        //check last word
        if(currentWord.equals(oldWord))
        {
            result=result+newWord;
        }
        else
        {
            result=result+currentWord;
        }
        
        System.out.println("modified sentence: "+result);
        
        input.close();
    }
}
