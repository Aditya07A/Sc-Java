// package sc;

// import java.util.*;

// public class day252D {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// q1-Assignment
// int n = sc.nextInt();
// int m = sc.nextInt();

// int[][] mat = new int[n][m];
// for (int i = 0; i <= n - 1; i++) {
// // System.out.print("Row " + (i + 1) + ": "); for show row number
// for (int j = 0; j <= m - 1; j++) {
// mat[i][j] = sc.nextInt();
// System.out.println(mat[i][j] + " ");
// }
// System.out.println();
// }
// q2-Assignment------
// int N = sc.nextInt();
// int M = sc.nextInt();

// int[][] mat = new int[N][M];

// for (int i = 0; i < N; i++) {
// for (int j = 0; j < M; j++) {
// mat[i][j] = sc.nextInt();
// }
// }

// // print col by col
// for (int j = 0; j < M; j++) {
// for (int i = 0; i < N; i++) {
// System.out.print(mat[i][j] + " ");
// }
// System.out.println();
// }

// q3-Assignment------

// int n = sc.nextInt();
// int mat[][] = new int[n][n];

// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// mat[i][j] = sc.nextInt();
// }
// }
// // Iterating over the columns
// for (int col = 0; col < n; col++) {
// // Iterating over rows
// for (int row = 0; row < n; row++) {
// if ((col % 2) == 1) {
// System.out.print(mat[n - 1 - row][col]);
// } else {
// System.out.print(mat[row][col]);
// }
// System.out.print(' ');
// }
// }

// System.out.println();

// q4-Assignment------
// int n = sc.nextInt();
// int[][] mat = new int[n][n];
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < n; j++) {
// mat[i][j] = sc.nextInt();
// }
// }
// for (int row = 0; row < n; row++) {
// if (row % 2 == 0) {
// for (int col = 0; col < n; col++) {
// System.out.print(mat[row][col] + " ");
// }

// } else {
// for (int col = n - 1; col >= 0; col--) {
// System.out.print(mat[row][col] + " ");
// }

// }
// }
//
// q5-Assignment--
package sc;

import java.util.Scanner;

public class day252D {

    public int[] solve(int[][] A) {
        int n = A.length, m = A[0].length;
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = 0;
            // Finding sum of elements of ith row
            for (int j = 0; j < m; j++) {
                temp += A[i][j];
            }
            ans[i] = temp;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of rows and columns from the user
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Create a 2D array based on user input
        int[][] inputArray = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                inputArray[i][j] = sc.nextInt();
            }
        }

        // Create an instance of the class containing the solve method
        day252D solver = new day252D();

        // Call the solve method and store the result in the resultArray
        int[] resultArray = solver.solve(inputArray);

        // Print the result
        System.out.println("Result:");
        for (int result : resultArray) {
            System.out.print(result + " ");
        }
        sc.close();
    }
}
