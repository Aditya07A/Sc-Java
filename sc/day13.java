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
        int N = sc.nextInt();
        int x = 0;
        int y = 0;
        while (N > 0) {
            int ld = N % 10;
            N = N / 10;
            if (ld % 2 == 0) {
                x += ld;
            } else {
                y += ld;
            }
        }
        System.out.println(x);
        System.out.println(y);

        sc.close();
    }
}
