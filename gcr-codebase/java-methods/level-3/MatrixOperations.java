
import java.util.Scanner;

public class MatrixOperations {

    // create random matrix
    static int[][] createMatrix(int r, int c) {
        int[][] m = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                m[i][j] = (int)(Math.random() * 9) + 1;
            }
        }
        return m;
    }

    // add two matrices
    static int[][] addMatrix(int[][] a, int[][] b) {
        int[][] sum = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    // subtract two matrices
    static int[][] subMatrix(int[][] a, int[][] b) {
        int[][] sub = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sub[i][j] = a[i][j] - b[i][j];
            }
        }
        return sub;
    }

    // multiply two matrices
    static int[][] mulMatrix(int[][] a, int[][] b) {
        int[][] mul = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    mul[i][j] = mul[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return mul;
    }

    // print matrix
    static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of matrix A: ");
        int r1 = sc.nextInt();
        System.out.print("Enter columns of matrix A: ");
        int c1 = sc.nextInt();

        System.out.print("Enter rows of matrix B: ");
        int r2 = sc.nextInt();
        System.out.print("Enter columns of matrix B: ");
        int c2 = sc.nextInt();

        int[][] A = createMatrix(r1, c1);
        int[][] B = createMatrix(r2, c2);

        System.out.println("\nMatrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);

        if (r1 == r2 && c1 == c2) {
            System.out.println("\nAddition:");
            printMatrix(addMatrix(A, B));

            System.out.println("\nSubtraction:");
            printMatrix(subMatrix(A, B));
        } else {
            System.out.println("\nAddition and Subtraction not possible");
        }

        if (c1 == r2) {
            System.out.println("\nMultiplication:");
            printMatrix(mulMatrix(A, B));
        } else {
            System.out.println("\nMultiplication not possible");
        }

        sc.close();
    }
}

