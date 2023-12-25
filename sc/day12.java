package sc;

import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // --------- q-1 - Assignment-------------------------------------------
        // int N = sc.nextInt();
        // int i = 1;
        // while (i <= N) {
        // System.out.print(i + " ");
        // i++;
        // }
        // --------- q-2 - Assignment-------------------
        // int N = sc.nextInt();
        // while (N >= 1) {
        // System.out.print(N + " ");
        // N--;
        // }
        // --------- q-3 - Assignment-------------------
        // int N = sc.nextInt();
        // int i = 1;
        // while (i <= N) {
        // if (i % 2 != 0) {

        // System.out.print(i + " ");
        // }
        // i++;
        // }
        // --------- q-4 - Assignment-------------------
        // int N = sc.nextInt();
        // int i = 1;
        // while (i <= N) {
        // if (i % 2 == 0) {

        // System.out.print(i + " ");
        // }
        // i++;
        // }
        // --------- q-5 - Assignment-------------------------------------------
        // int N = sc.nextInt();
        // int i = 1;
        // int sum = 0;
        // while (i <= N) {
        // sum += i;
        // i++;
        // }
        // System.out.print(sum);
        // int N = sc.nextInt();
        // int i = (N * (N + 1) / 2);
        // System.out.println(i);
        // --------- q-1 - Add-------------------------------------------
        // int A = sc.nextInt();
        // int i = 1;
        // int sum = 0;
        // while (i <= A) {
        // if (i % 2 != 0) {
        // sum += i;
        // }
        // i++;
        // }
        // System.out.println(sum);
        // --------- q-2 - Add-------------
        // int A = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while (i <= A) {
        // if (i % 2 == 0) {
        // sum += i;
        // }
        // i++;
        // }
        // System.out.println(sum);
        // --------- q-3 - Add-------------
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int i = 1;
        // int j = 1;
        // while (i <= B) {
        // j *= A;
        // i++;
        // }
        // System.out.println(j);
        // --------- q-4 - Add-------------
        // int a = sc.nextInt();
        // int i = 1;
        // while (i <= 10) {
        // System.out.println(a + "*" + i + "=" + (a * i));
        // i++;
        // }
        // --------- q-5 - Add-------------
        int N = sc.nextInt();
        int j = 1;
        int i = 4;
        while ((j * i) <= N) {
            System.out.println(j + "*" + i + "=" + (j * i));
            j++;
        }
        // int N = sc.nextInt();
        // int i = 1;
        // while (i <= N) {
        // if (i % 4 == 0) {

        // System.out.println(i + " ");
        // }
        // i++;
        // }
        // int N = sc.nextInt();
        // int i = 4;
        // while (i <= N) {
        // System.out.println(i + " ");
        // i = i + 4;
        // }

        sc.close();
    }
}