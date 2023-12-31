package sc;

import java.util.Scanner;

public class day18Patteren2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // q1-Assignment----
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {
        // System.out.print("*");
        // for (int j = 1; j <= n; j++) {
        // System.out.print(" ");
        // }
        // System.out.print("*");
        // System.out.println();
        // }
        // q2-Assignment----
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= 2 * (n - i); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }
        // q3-Assignment----
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= (n - i + 1); j++) {
        // System.out.print("*");
        // }
        // for (int j = 1; j <= 2 * (i - 1); j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= (n - i + 1); j++) {
        // System.out.print("*");
        // }

        // System.out.println();
        // }
        // q4-Assignment----
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {

        // int spaces = n - i;
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(0 + " ");
        // }
        // int lim = 2 * i - 1;
        // for (int j = i; j <= lim; j++) {
        // System.out.print(j + " ");
        // }
        // for (int j = lim - 1; j >= i; j--) {
        // System.out.print(j + " ");
        // }
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(0 + " ");
        // }

        // System.out.println();
        // }
        // q5-Assignment----
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {

        // for (int j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }

        // System.out.println();
        // }
        // q1-Add----
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();

    }
}
