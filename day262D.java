// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class day262D {
//     // q1-Assignment
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the size of the matrix (square matrix): ");
//         int matSize = scanner.nextInt();

//         List<ArrayList<Integer>> matrix = new ArrayList<>();

//         System.out.println("Enter the elements of the matrix row by row:");
//         for (int i = 0; i < matSize; i++) {
//             ArrayList<Integer> row = new ArrayList<>();
//             for (int j = 0; j < matSize; j++) {
//                 System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
//                 row.add(scanner.nextInt());
//             }
//             matrix.add(row);
//         }

//         day262D solution = new day262D();
//         int result = solution.solve(matrix);

//         if (result == 1) {
//             System.out.println("The main diagonal contains only 1s.");
//         } else {
//             System.out.println("The main diagonal does not contain only 1s.");
//         }

//         scanner.close();
//     }

//     public int solve(List<ArrayList<Integer>> A) {
//         int matSize = A.size();
//         for (int row = 0; row < matSize; row++) {
//             if (A.get(row).get(row) != 1) {
//                 return 0;
//             }
//         }
//         return 1;
//     }
// }

//q2-Assignment----------------
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class day262D {
    public int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int[][] B = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                B[j][i] = A[i][j];
            }
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int numRows = scanner.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int numCols = scanner.nextInt();

        int[][] matrix = new int[numRows][numCols];

        System.out.println("Enter the elements of the matrix row by row:");

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        day262D solution = new day262D();
        int[][] resultMatrix = solution.solve(matrix);

        System.out.println("Transposed matrix: " + matrixToString(resultMatrix));

        scanner.close();
    }

    private static String matrixToString(int[][] matrix) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < matrix.length; i++) {
            result.append("[");
            for (int j = 0; j < matrix[0].length; j++) {
                result.append(matrix[i][j]);
                if (j < matrix[0].length - 1) {
                    result.append(", ");
                }
            }
            result.append("]");
            if (i < matrix.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
