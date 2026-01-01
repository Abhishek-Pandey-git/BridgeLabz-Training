import java.util.Scanner;

public class OnlineQuiz {
	
	//Questions Array
	static String[][] questions = {
    {
        "What is the capital of India?",
        "Mumbai",
        "Delhi",
        "Kolkata",
        "Chennai",
        "2"
    },
    {
        "Which language is used for web applications?",
        "Python",
        "Java",
        "JavaScript",
        "C++",
        "3"
    },
    {
        "Who is the father of C language?",
        "Dennis Ritchie",
        "Bjarne Stroustrup",
        "James Gosling",
        "Guido van Rossum",
        "1"
    },
    {
        "Which is not an OOP concept?",
        "Encapsulation",
        "Inheritance",
        "Compilation",
        "Polymorphism",
        "3"
    },
    {
        "Which symbol is used for multi-line comments in C?",
        "//",
        "/* */",
        "#",
        "$",
        "2"
    }
};
	
	
	public static final String RESET = "\u001B[0m";
	public static final String RED = "\u001B[31m";
	public static final String GREEN = "\u001B[32m";
	public static final String YELLOW = "\u001B[33m";
	public static final String ORANGE = "\u001B[38;5;208m"; 
	
	
    public static void main(String[] args) throws InterruptedException{
		
      Scanner input=new Scanner(System.in);
	   //loop to start from 0h and zero minutes
	   
	  System.out.println("========================================");
	  System.out.println(ORANGE+"========== WELCOME TO QUIZ ==============="+RESET);
	  System.out.println("========================================");
	  System.out.println();
	  System.out.println("LETS START");
	  
	  int Score=0;
	  for(int i=0;i<questions.length;i++){
		  // presenting the question
		System.out.println(YELLOW+"Q"+(i+1)+". "+questions[i][0]+RESET);
		System.out.printf("1. %-40s 2. %-40s \n",questions[i][1],questions[i][2]);
		
		System.out.printf("3. %-40s 4. %-40s",questions[i][3],questions[i][4]);
		System.out.println();
		System.out.println(ORANGE+"Enter your choice: "+RESET);
		int answer=input.nextInt();
		
		int finalAnswer=Integer.parseInt(questions[i][5]);
		//using advanced switch for answer checking
		boolean ans=switch(answer){
			case 1->{yield 1==Integer.parseInt(questions[i][5]);}
			case 2->{yield 2==Integer.parseInt(questions[i][5]);}
			case 3->{yield 3==Integer.parseInt(questions[i][5]);}
			case 4->{yield 4==Integer.parseInt(questions[i][5]);}
			default ->{ yield false;}
		};
		
		if(ans==true){
			Score++;
			System.out.println(GREEN+"Correct!!!! Your Score: "+Score+RESET);
		}else{
			System.out.println(RED+"Not quite!!!"+RESET+" Your Score: "+Score);
		}
		System.out.println();
		
		
	  }
	  
	  System.out.println("========================================");
	  System.out.println(ORANGE+"Your Final Score: "+Score+RESET);
	  System.out.println("========================================");
	  System.out.println();
	  input.close();
	  
    }
}
