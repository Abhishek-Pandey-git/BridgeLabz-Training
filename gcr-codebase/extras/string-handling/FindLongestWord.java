import java.util.Scanner;
public class FindLongestWord {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
		//Taking input
		System.out.println("Enter a sentence");
		String sentence=input.nextLine();
		
		
		
		//using split method to make an string array with words seperated
		String[] wordsArray=sentence.split(" ");
		
		//looping thorugh the array to get the max sized words
		
		String maxLengthWord=wordsArray[0];
		int maxSize=wordsArray[0].length();
		
		for(int i=0;i<wordsArray.length;i++){
			if(maxSize<wordsArray[i].length()){
				maxSize=wordsArray[i].length();
				maxLengthWord=wordsArray[i];
			}
		}
		
		System.out.println("The logest word in the given sentence is: "+maxLengthWord);
		input.close();
    }
}
