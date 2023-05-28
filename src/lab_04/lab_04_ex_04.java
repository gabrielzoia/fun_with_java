package lab_04;

import java.util.Scanner;
import java.util.Random;

public class lab_04_ex_04 {
    public static void msg() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Read in the dimensions of the matrix
        System.out.print("Enter the dimension of the square matrix: ");
        int n = scanner.nextInt();

        // Create the matrix and fill it with random elements
        int[][] matrix = new int[n][n];
        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(10); // Generate random element
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate the trace of the matrix
        int trace = 0;
        for (int i = 0; i < n; i++) {
            trace += matrix[i][i]; // Add elements on the diagonal
        }

        // Print out
        System.out.println("The trace of the matrix is: " + trace);
    }
}
