package sc;

import java.util.*;

public class day16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // q1-Assignment----
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // q2-Assignment----
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // q3-Assignment----
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // q4-Assignment----
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // if (j % 2 != 0) {
        // System.out.print(j + " ");
        // } else {

        // System.out.print("_");
        // }
        // }
        // System.out.println();
        // }
        // q1-Add----
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i + 1; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j>=i; j--) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // q2-Add----
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= n - i; j++) {
        // System.out.print("_");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // q3-Add----
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();

    }

}
