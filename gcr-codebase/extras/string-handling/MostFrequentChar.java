import java.util.Scanner;

//program to find most frequent character
public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("enter string: ");
        String str=input.nextLine();
        
        char mostFrequent=' ';
        int maxCount=0;
        
        //check each character
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int count=0;
            
            //count occurrences of current character
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)==ch)
                {
                    count++;
                }
            }
            
            //update if this character appears more times
            if(count>maxCount)
            {
            maxCount=count;
            mostFrequent=ch;
            }
        }
        
        System.out.println("Most Frequent Character: '"+mostFrequent+"'");
        
        input.close();
    }
}
