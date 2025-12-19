import java.util.Scanner;
//Q9
public class MultiToSingleDimention {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     
	   int rows,columns;
       
		// taking input
		System.out.println("Enter number of rows: ");
		rows=input.nextInt();
		System.out.println("Enter Number of columns: ");
		columns=input.nextInt();
		
		// Initialising the array
		int[][] array2D=new int[rows][columns];
		
		
		//Taking input from user
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.println("Enter a value");
				array2D[i][j]=input.nextInt();
				
			}
		}
		
		//declaring single dimension array
		int[] array1D=new int[rows*columns];
		
		//index to track index in the 1D array
		int index=0;
		
		//transferring values from 2D arrays to 1D
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				array1D[index]=array2D[i][j];
				index++;
				
			}
		}
		
		
		//Printing the values
		for(int i=0;i<array1D.length;i++){
			System.out.print(array1D[i]+ ", ");
		}
		
	
        input.close();
    }
}
