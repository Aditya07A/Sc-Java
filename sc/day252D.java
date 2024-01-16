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
// package sc;

// import java.util.Scanner;

// public class day252D {

// public int[] solve(int[][] A) {
// int n = A.length, m = A[0].length;
// int ans[] = new int[n];
// for (int i = 0; i < n; i++) {
// int temp = 0;
// // Finding sum of elements of ith row
// for (int j = 0; j < m; j++) {
// temp += A[i][j];
// }
// ans[i] = temp;
// }
// return ans;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// // Get the number of rows and columns from the user
// System.out.print("Enter the number of rows: ");
// int rows = sc.nextInt();

// System.out.print("Enter the number of columns: ");
// int cols = sc.nextInt();

// // Create a 2D array based on user input
// int[][] inputArray = new int[rows][cols];

// System.out.println("Enter the elements of the array:");
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// inputArray[i][j] = sc.nextInt();
// }
// }

// // Create an instance of the class containing the solve method
// day252D solver = new day252D();

// // Call the solve method and store the result in the resultArray
// int[] resultArray = solver.solve(inputArray);

// // Print the result
// System.out.println("Result:");
// for (int result : resultArray) {
// System.out.print(result + " ");
// }
// sc.close();
// }
// }
// 
// q1-Add--------------------
// package sc;

// import java.util.Scanner;

// public class day252D {

//     public static class Solution {
//         public int solve(int[][] A, int[][] B) {
//             for (int i = 0; i < A.length; i++) {
//                 for (int j = 0; j < A[0].length; j++) {
//                     if (A[i][j] != B[i][j]) {
//                         return 0;
//                     }
//                 }
//             }
//             return 1;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Get the number of rows and columns from the user
//         System.out.print("Enter the number of rows: ");
//         int rows = sc.nextInt();

//         System.out.print("Enter the number of columns: ");
//         int cols = sc.nextInt();

//         // Create a 2D array based on user input
//         int[][] inputArray = new int[rows][cols];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 inputArray[i][j] = sc.nextInt();
//             }
//         }

//         // Create an instance of the static class containing the solve method
//         Solution solver = new Solution();

//         // Call the solve method and store the result
//         System.out.println("Enter the elements of the second array:");
//         int[][] secondArray = new int[rows][cols];
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 secondArray[i][j] = sc.nextInt();
//             }
//         }

//         int result = solver.solve(inputArray, secondArray);

//         // Print the result
//         System.out.println("Result: " + result);
//         sc.close();
//     }
// }
// q2-Add--------------------
// package sc;

// import java.util.Scanner;

// public class day252D {

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// // Get the dimensions of the matrices from the user
// System.out.print("Enter the number of rows for matrices A and B: ");
// int rows = scanner.nextInt();

// System.out.print("Enter the number of columns for matrices A and B: ");
// int columns = scanner.nextInt();

// // Initialize matrices A and B
// int[][] A = new int[rows][columns];
// int[][] B = new int[rows][columns];

// // Get input for matrix A
// System.out.println("Enter elements for matrix A:");
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < columns; j++) {
// System.out.print("A[" + i + "][" + j + "]: ");
// A[i][j] = scanner.nextInt();
// }
// }

// // Get input for matrix B
// System.out.println("Enter elements for matrix B:");
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < columns; j++) {
// System.out.print("B[" + i + "][" + j + "]: ");
// B[i][j] = scanner.nextInt();
// }
// }

// // Create an instance of the MatrixSubtractor class
// MatrixSubtractor matrixSubtractor = new MatrixSubtractor();

// // Call the solve function
// int[][] result = matrixSubtractor.solve(A, B);

// // Print the result
// System.out.println("Resulting matrix after subtraction:");
// for (int i = 0; i < result.length; i++) {
// for (int j = 0; j < result[0].length; j++) {
// System.out.print(result[i][j] + " ");
// }
// System.out.println();
// }

// // Close the scanner
// scanner.close();
// }
// }

// class MatrixSubtractor {

// // Subtract matrix B from matrix A
// public int[][] solve(int[][] A, int[][] B) {
// int rows = A.length;
// int columns = A[0].length;
// int[][] result = new int[rows][columns];

// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < columns; j++) {
// result[i][j] = A[i][j] - B[i][j];
// }
// }

// return result;
// }
// }
// // q3-Add--------------------
// package sc;

// import java.util.Scanner;

// public class day252D {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Get input for A (number of rows)
//         System.out.print("Enter the number of rows (A): ");
//         int A = scanner.nextInt();

//         // Get input for B (number of columns)
//         System.out.print("Enter the number of columns (B): ");
//         int B = scanner.nextInt();

//         // Initialize matrix C
//         int[][] C = new int[A][B];

//         // Get input for matrix C
//         System.out.println("Enter elements for matrix C:");
//         for (int i = 0; i < A; i++) {
//             for (int j = 0; j < B; j++) {
//                 System.out.print("C[" + i + "][" + j + "]: ");
//                 C[i][j] = scanner.nextInt();
//             }
//         }

//         // Create an instance of the Solution class
//         Solution solution = new Solution();

//         // Call the solve function
//         int[] result = solution.solve(A, B, C);

//         // Print the result
//         System.out.println("Resulting array after column-wise sum:");
//         for (int j = 0; j < B; j++) {
//             System.out.print(result[j] + " ");
//         }

//         // Close the scanner
//         scanner.close();
//     }
// }

// class Solution {
//     public int[] solve(int A, int B, int[][] C) {
//         int[] ans = new int[B];

//         for (int j = 0; j < B; j++) {
//             int sum = 0;
//             for (int i = 0; i < A; i++) {
//                 sum += C[i][j];
//             }
//             ans[j] = sum;
//         }

//         return ans;
//     }
// }

//q4--Add----------------
package sc;

import java.util.Scanner;

public class day252D {
    public int[] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            // Finding maximum element of ith row
            for (int j = 0; j < m; j++) {
                ans[i] = Math.max(ans[i], A[i][j]);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for the number of rows (n)
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Get input for the number of columns (m)
        System.out.print("Enter the number of columns: ");
        int m = scanner.nextInt();

        // Initialize matrix A
        int[][] A = new int[n][m];

        // Get input for matrix A
        System.out.println("Enter elements for matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }

        // Create an instance of the Solution class
        day252D solution = new day252D();

        // Call the solve method
        int[] result = solution.solve(A);

        // Print the result
        System.out.println("Maximum element in each row: ");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Row " + i + ": " + result[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
