import java.util.Scanner;

//program to count vowels and consonants
public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        //ask user for input
        System.out.println("enter a string: ");
        String str=input.nextLine();
        
        int vowels=0; //to store vowel count
        int consonants=0; //to store consonant count
        
        //loop through each character
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            
            //check if vowel
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
                vowels++;
            }
            //check if consonant
            else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            {
                consonants++;
            }
        }
        
        //print results
        System.out.println("vowels: "+vowels);
        System.out.println("consonants: "+consonants);
        
        input.close();
    }
}
