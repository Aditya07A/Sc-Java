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
        //     // System.out.print("Row " + (i + 1) + ": "); for show row number
        //     for (int j = 0; j <= m - 1; j++) {
        //         mat[i][j] = sc.nextInt();
        //         System.out.println(mat[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        //q2-Assignment------
        int N = scn.nextInt();
        int M = scn.nextInt();
      
        int[][]mat = new int[N][M];
      
        for(int i=0; i < N;i++) {
            for(int j=0; j < M;j++) {
               mat[i][j] = scn.nextInt();
            }
        }
      
      
        //print col by col
        for(int j=0;j < M;j++) {
            for(int i=0;i < N;i++) {
               System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
        sc.close();
    }}
