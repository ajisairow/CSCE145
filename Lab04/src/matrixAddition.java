//Ronan Param
import java.util.Scanner;

public class matrixAddition {
	//Class recalls index values to add both index values
    public static void print(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        //This is the welcome screen for the matrix adding program
        System.out.println("Welcome to the matrix addition program!");
        System.out.println("Please enter the dimensions of the first matrix:");
        //Row and the columns
        int row1 = ab.nextInt();
        int column1 = ab.nextInt();

        int[][] mat0 = new int[row1][column1];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.println("Enter value at index " + i + " " + j);
                mat0[i][j] = ab.nextInt();
            }
        }

        System.out.println("Please enter the dimensions of the second matrix:");

        int row2 = ab.nextInt();
        int column2 = ab.nextInt();
        //This is the invalid dimensions line
        if (row1 != row2 || column1 != column2) {
            System.out.println("Invalid dimensions! These matrices cannot be added");
        } else {
            int[][] mat1 = new int[row2][column2];
            //Enter value dialogue of each index
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    System.out.println("Enter value at index " + i + " " + j);
                    mat1[i][j] = ab.nextInt();
                }
            }

            // This adds the matrices
            int[][] result = new int[row1][column1];
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    result[i][j] = mat0[i][j] + mat1[i][j];
                }
            }
            //These lines print out the matrix and the result
            System.out.println("Matrix 1:");
            print(mat0);
            System.out.println("Matrix 2:");
            print(mat1);
            System.out.println("=");
            print(result);
        }
    }
}	