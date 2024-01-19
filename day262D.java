// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class day262D {
// // q1-Assignment
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the size of the matrix (square matrix): ");
// int matSize = scanner.nextInt();

// List<ArrayList<Integer>> matrix = new ArrayList<>();

// System.out.println("Enter the elements of the matrix row by row:");
// for (int i = 0; i < matSize; i++) {
// ArrayList<Integer> row = new ArrayList<>();
// for (int j = 0; j < matSize; j++) {
// System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) +
// "): ");
// row.add(scanner.nextInt());
// }
// matrix.add(row);
// }

// day262D solution = new day262D();
// int result = solution.solve(matrix);

// if (result == 1) {
// System.out.println("The main diagonal contains only 1s.");
// } else {
// System.out.println("The main diagonal does not contain only 1s.");
// }

// scanner.close();
// }

// public int solve(List<ArrayList<Integer>> A) {
// int matSize = A.size();
// for (int row = 0; row < matSize; row++) {
// if (A.get(row).get(row) != 1) {
// return 0;
// }
// }
// return 1;
// }
// }
// q2-Assignment-------------------
// import java.util.Scanner;

// public class day262D {
// public int[][] solve(int[][] A) {
// int n = A.length;
// int m = A[0].length;
// int[][] B = new int[m][n];
// for (int i = 0; i < n; i++) {
// for (int j = 0; j < m; j++) {
// B[j][i] = A[i][j];
// }
// }
// return B;
// }

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Enter the number of rows in the matrix: ");
// int numRows = scanner.nextInt();
// System.out.print("Enter the number of columns in the matrix: ");
// int numCols = scanner.nextInt();

// int[][] matrix = new int[numRows][numCols];

// System.out.println("Enter the elements of the matrix row by row:");

// for (int i = 0; i < numRows; i++) {
// for (int j = 0; j < numCols; j++) {
// System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) +
// "): ");
// matrix[i][j] = scanner.nextInt();
// }
// }

// day262D solution = new day262D();
// int[][] resultMatrix = solution.solve(matrix);

// System.out.println("Transposed matrix: " + matrixToString(resultMatrix));

// scanner.close();
// }

// private static String matrixToString(int[][] matrix) {
// StringBuilder result = new StringBuilder("[");
// for (int i = 0; i < matrix.length; i++) {
// result.append("[");
// for (int j = 0; j < matrix[0].length; j++) {
// result.append(matrix[i][j]);
// if (j < matrix[0].length - 1) {
// result.append(", ");
// }
// }
// result.append("]");
// if (i < matrix.length - 1) {
// result.append(", ");
// }
// }
// result.append("]");
// return result.toString();
// }
// }

// q3-Assignment-------------------
// import java.util.Scanner;

// public class day262D {

// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// System.out.println("Enter the number of rows for matrices A and B:");
// int rows = scanner.nextInt();

// System.out.println("Enter the number of columns for matrices A and B:");
// int cols = scanner.nextInt();

// // Create matrices A and B with user-specified dimensions
// int[][] A = new int[rows][cols];
// int[][] B = new int[rows][cols];

// // Input for matrix A
// System.out.println("Enter elements for matrix A:");
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// A[i][j] = scanner.nextInt();
// }
// }

// // Input for matrix B
// System.out.println("Enter elements for matrix B:");
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// B[i][j] = scanner.nextInt();
// }
// }

// // Call the solve method and store the result in matrix C
// int[][] C = solve(A, B);

// // Display the result
// System.out.println("Resultant matrix C:");
// for (int i = 0; i < rows; i++) {
// for (int j = 0; j < cols; j++) {
// System.out.print(C[i][j] + " ");
// }
// System.out.println();
// }

// // Close the scanner
// scanner.close();
// }

// public static int[][] solve(int[][] A, int[][] B) {
// int N = A.length;
// int M = A[0].length;
// int[][] C = new int[N][M];

// for (int i = 0; i < N; i++) {
// for (int j = 0; j < M; j++) {
// C[i][j] = A[i][j] - B[i][j];
// }
// }

// return C;
// }
// }
// q3-Add-------------------
// import java.util.Arrays;
// import java.util.Scanner;

// public class day262D {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Take input for the dimensions of matrix A
//         System.out.println("Enter the number of rows for matrix A:");
//         int rows = scanner.nextInt();

//         System.out.println("Enter the number of columns for matrix A:");
//         int cols = scanner.nextInt();

//         // Take input for matrix A
//         int[][] A = takeMatrixInput("A", rows, cols, scanner);

//         // Call the solve method with the input matrix
//         int[] result = solve(A);

//         // Print the result array
//         System.out.println("Result array: " + Arrays.toString(result));

//         // Close the scanner
//         scanner.close();
//     }

//     // Method to take input for a matrix
//     public static int[][] takeMatrixInput(String matrixName, int rows, int cols, Scanner scanner) {
//         System.out.println("Enter elements for matrix " + matrixName + ":");
//         int[][] matrix = new int[rows][cols];
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(matrixName + "[" + i + "][" + j + "]: ");
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }
//         return matrix;
//     }

//     // Method: solves a specific problem (e.g., sum of each row and column)
//     public static int[] solve(int[][] A) {
//         int n = A.length;
//         int m = A[0].length;
//         int[] res = new int[n + m];

//         // Calculate the sum of each row
//         for (int r = 0; r < n; r++) {
//             int rowSum = 0;
//             for (int c = 0; c < m; c++) {
//                 rowSum += A[r][c];
//             }
//             res[r] = rowSum;
//         }

//         // Calculate the sum of each column
//         for (int c = 0; c < m; c++) {
//             int colSum = 0;
//             for (int r = 0; r < n; r++) {
//                 colSum += A[r][c];
//             }
//             res[n + c] = colSum;
//         }

//         return res;
//     }
// }
//'q6-Add------------------------------
// import java.util.Scanner;

class Main {
    static int[][] func(int[][] mat) {
        int[][] A = new int[1][1];
        return A;
    }

    public static void main(String args[]) {
        int[][] A = {
                { 2, 5, 9, 8 },
                { 6, 2, 5, 7 },
                { 1, 3, 0, 4 }
        };
        A = func(A);
        System.out.println(A[0][0]);
    }
}
