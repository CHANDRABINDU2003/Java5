package ArrayString;

import java.util.Scanner;

public class MatrixMulti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Enter the dimensions of the first matrix (rows columns):");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();

        System.out.println("Enter the dimensions of the second matrix (rows columns):");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();

    

        int a[][] = new int[rowsA][colsA];
        int b[][] = new int[rowsB][colsB];

        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        int c[][] = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                c[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(" " + c[i][j]);
            }
            System.out.println("");
        }
    }
}

   

