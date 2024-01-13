package sc;

import java.util.*;

public class day252D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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

        int n = sc.nextInt();
        int mat[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        // Iterating over the columns
        for (int col = 0; col < n; col++) {
            // Iterating over rows
            for (int row = 0; row < n; row++) {
                if ((col % 2) == 1) {
                    System.out.print(mat[n - 1 - row][col]);
                } else {
                    System.out.print(mat[row][col]);
                }
                System.out.print(' ');
            }
        }

        System.out.println();
        sc.close();
    }
}
