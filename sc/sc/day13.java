package sc;

import java.util.*;

public class day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // q1-Assignment--
        // int a = sc.nextInt();
        // int i = 1;
        // while ((i * i) <= a) {
        // System.out.print(i * i + " ");
        // i++;
        // }
        // q2-Assignment--
        // long N = sc.nextLong();

        // int i = 0;
        // while (i <= 0) {
        // int opt = sc.nextInt();
        // if (opt == 1) {
        // long amt1 = sc.nextLong();
        // N = N + amt1;
        // System.out.print(N);
        // } else if (opt == 2) {
        // long amt2 = sc.nextLong();
        // if (amt2 < N) {
        // N = N - amt2;
        // System.out.println(N);
        // } else {
        // System.out.println("Insufficent balance");
        // }
        // i++;
        // }
        // }
        // q3-Assignment--
        // int T = sc.nextInt();
        // while (T != 0) {
        // int N = sc.nextInt();
        // int count = 0;
        // if (N == 0) {
        // System.out.println(1);
        // } else {
        // while (N >= 1) {
        // N = N / 10;
        // count++;
        // }
        // System.out.println(count);
        // }
        // T--;
        // }
        // q4-Assignment--
        // int N = sc.nextInt();
        // int x = 0;
        // int y = 0;
        // while (N > 0) {
        // int ld = N % 10;
        // N = N / 10;
        // if (ld % 2 == 0) {
        // x += ld;
        // } else {
        // y += ld;
        // }
        // }
        // System.out.println(x);
        // System.out.println(y);

        // q5-Assignment--
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int i = A;
        // while (i <= B) {
        // System.out.print(i + " ");
        // i++;
        // }
        // q1-Add--
        // int T = sc.nextInt();
        // while (T > 0) {
        // int N = sc.nextInt();
        // int sum = 0;
        // while (N > 0) {
        // int ld = N % 10;
        // sum += ld;
        // N /= 10;
        // }
        // System.out.println(sum);
        // }
        // T--;
        // q2-Add--
        // int N = sc.nextInt();
        // int i = 1;
        // while (i <= N) {
        // int j = i;
        // int sum = 0;
        // while (j > 0) {
        // int ld = j % 10;
        // sum += (ld * ld * ld);
        // j /= 10;
        // }
        // if (sum == i) {
        // System.out.println(i);
        // }
        // i++;
        // }
        // q3-Add--
        // int T = sc.nextInt();
        // while (T > 0) {
        // int N = sc.nextInt();
        // int ld = 0;
        // int fd = 0;
        // ld = N % 10;
        // while (N > 0) {
        // fd = N % 10;
        // N = N / 10;

        // }
        // System.out.println(fd + " " + ld);

        // }
        // T--;
        // q4-Add--
        // int N = sc.nextInt();
        // int x = 0;
        // int y = 0;
        // while (N > 0) {
        // int ld = N % 10;
        // N /= 10;
        // if (ld % 2 == 0) {
        // x += ld;
        // } else {
        // y += ld;
        // }
        // }
        // System.out.println(x);
        // System.out.println(y);
        // q5-Add--
        int N = sc.nextInt();
        int i = 0;
        while (N > 1) {
            N = N / 2;
            i++;
        }
        System.out.println(i);
        sc.close();
    }
}
