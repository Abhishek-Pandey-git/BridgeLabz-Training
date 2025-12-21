import java.util.Scanner;
// Program to find Transpose, Inverse and Determinant of matrices
public class MatrixTransposeDeterminantAndInverse {

    //Method to generate matrix
    public static int[][] generateMatrix(int rows,int columns){
        int[][] matrix=new int[rows][columns];

        //loping to generate matrix
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j]=(int)(Math.random()*100);
            }
        
        }
        return matrix;
    }

    //Method to print a matrix
    public static void printMatrix(int[][] matrix){
        
        for(int i=0;i<matrix.length;i++){
            System.out.print("| ");
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("| ");
        }
    }


    //Method to tranpose a matrix
    public static void transposeMatrix(int[][] matrix){
        int[][] tempMatrix=new int[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                tempMatrix[j][i]=matrix[i][j];
            }
        }

        //Pritning transpose
        printMatrix(tempMatrix);

    }

    //methodfor determinant of 2x2 matrix
    public static int determinant2x2Matrix(int[][] matrix){
        int determinant=(matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);
        return determinant;

        
    }

    //method for determinant of 3x3 matrix
    public static int determinant3x3Matrix(int[][] matrix){
        int determinant=(matrix[0][0]*((matrix[1][1]*matrix[2][2])-(matrix[1][2]*matrix[2][1])))
                        -
                        (matrix[0][1]*((matrix[1][0]*matrix[2][2])-(matrix[1][2])*matrix[2][0]))
                        +
                        (matrix[0][2]*((matrix[1][0]*matrix[2][1])-(matrix[1][1]*matrix[2][0])));
        return determinant;
    }

    //method to find inverse of 2x2 matrix
    public static void inverse2x2Matrix(int[][] matrix){
         int[][] inverseMatrix = new int[2][2];

         int determinant=determinant2x2Matrix(matrix);

            int firstElement  = matrix[0][0];
            int secondElement = matrix[0][1];
            int thirdElement  = matrix[1][0];
            int fourthElement = matrix[1][1];

            inverseMatrix[0][0] =  fourthElement / determinant;
            inverseMatrix[0][1] = -secondElement / determinant;
            inverseMatrix[1][0] = -thirdElement / determinant;
            inverseMatrix[1][1] =  firstElement / determinant;

            System.out.println("Inverse of the matrix:");
            printMatrix(inverseMatrix);
    }

    //method to calculate inverse of 3x3 matrix
    public static void inverse3x3Matrix(int[][] matrix){
        int a = matrix[0][0];
        int b = matrix[0][1];
        int c = matrix[0][2];

        int d = matrix[1][0];
        int e = matrix[1][1];
        int f = matrix[1][2];

        int g = matrix[2][0];
        int h = matrix[2][1];
        int i = matrix[2][2];

        // Calculate determinant
        int determinant =determinant3x3Matrix(matrix);

            int[][] inverseMatrix = new int[3][3];

            inverseMatrix[0][0] =  (e * i - f * h) / determinant;
            inverseMatrix[0][1] = -(b * i - c * h) / determinant;
            inverseMatrix[0][2] =  (b * f - c * e) / determinant;

            inverseMatrix[1][0] = -(d * i - f * g) / determinant;
            inverseMatrix[1][1] =  (a * i - c * g) / determinant;
            inverseMatrix[1][2] = -(a * f - c * d) / determinant;

            inverseMatrix[2][0] =  (d * h - e * g) / determinant;
            inverseMatrix[2][1] = -(a * h - b * g) / determinant;
            inverseMatrix[2][2] =  (a * e - b * d) / determinant;

            System.out.println("Inverse of the matrix:");
            printMatrix(inverseMatrix);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Taking input for rows and columns
        System.out.println("Enter number of rows for your matrix");
        int rows=input.nextInt();
          System.out.println("Enter number of columns for your matrix");
        int columns=input.nextInt();

        //Calling fn to generate matrix
        int[][] matrix=generateMatrix(rows, columns);

        //Printing a matrix
        printMatrix(matrix);
        System.out.println();

        //Transpose
        transposeMatrix(matrix);

        //conditions or matrix determinant
        if(rows==columns){
            if(rows==2 && columns==2){
               int determinant= determinant2x2Matrix(matrix);
               System.out.println("The determinant of given 2x2 matrix is: " +determinant);
               if(determinant==0){
                System.out.println("inverse of this 2x2 matrix cannot be found as determinant is 0");
               }
               else{
                inverse2x2Matrix(matrix);
               }


            }
            else if(rows==3 && columns==3){
                int determinant=determinant3x3Matrix(matrix);
                System.out.println("The determinant od given 3x3 matrix is: "+ determinant);
                if(determinant==0){
                System.out.println("inverse of this 2x2 matrix cannot be found as determinant is 0");
               }
               else{
                inverse3x3Matrix(matrix);
               }
            }
        }
        else{

            System.out.println("The matrix is not a square matrix. Thus,no determinant can be found");
        }


        input.close();
        
    }
    
}
