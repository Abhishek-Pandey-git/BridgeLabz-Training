import java.util.Scanner;

//computer guesses number game
public class NumberGuessingGame {
    
    //generate random guess between min and max
    public static int makeGuess(int min,int max)
    {
        int guess=min+(int)(Math.random()*(max-min+1));
        return guess;
    }
    
    //get feedback from user
    public static char getFeedback(Scanner input,int guess)
    {
        System.out.println("computer guessed: "+guess);
        System.out.println("enter 'h' if too high, 'l' if too low, 'c' if correct: ");
        char feedback=input.next().charAt(0);
        return feedback;
    }
    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("think of a number between 1 and 100");
        System.out.println("press enter when ready");
        input.nextLine();
        
        int min=1;
        int max=100;
        int attempts=0;
        boolean found=false;
        
        //keep guessing until correct
        while(!found)
        {
            attempts++;
            int guess=makeGuess(min,max);
            
            char feedback=getFeedback(input,guess);
            
            if(feedback=='c')
            {
                found=true;
                System.out.println("computer guessed it in "+attempts+" attempts");
            }
            else if(feedback=='h')
            {
            max=guess-1; //guess was too high
            }
            else if(feedback=='l')
            {
                min=guess+1; //guess was too low
            }
        }
        
        input.close();
    }
}
