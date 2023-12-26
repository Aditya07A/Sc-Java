package sc;

import java.util.*;

public class day14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // q1-Assignment--
        // int T = sc.nextInt();
        // for (int i = 1; i <= T; i++) {
        // int N = sc.nextInt();
        // int fd = 0;
        // int ld = 0;
        // ld = N % 10;
        // for (; N > 0; N /= 10) {
        // fd = N % 10;
        // }
        // System.out.println(fd + " " + ld);
        // }
        // q2-Assignment--
        // int N = sc.nextInt();
        // for (int i = 4; i <= N;) {
        // System.out.println(i);
        // i += 4;
        // }
        // for (int i = 1; i <= N; i++) {
        // if (i % 4 == 0) {
        // System.out.println(i);
        // }
        // }
        // q3-Assignment--
        // int N = sc.nextInt();
        // for (int i = 1; i <= N; i++) {
        // System.out.print(i + " ");
        // }
        // q4-Assignment--
        // int N = sc.nextInt();
        // for (int i = N; i >= 1; i--) {
        // System.out.print(i + " ");
        // }
        // q5-Assignment--
        // int N = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i <= N; i++) {
        // sum += i;
        // }
        // System.out.print(sum);
        // q1- Add------
        // int A = sc.nextInt();
        // int rev = 0;
        // for (int i = A; i > 0; i = i / 10) {
        // int ld = i % 10;
        // rev = rev * 10 + ld;
        // }
        // if (rev == A) {
        // System.out.println("yes");
        // } else {
        // System.out.println("no");
        // }
        // q2- Add------
        // int A = sc.nextInt();
        // for (int i = 1; i <= A; i++) {
        // if (i % 2 == 1) {
        // System.out.print(i + " ");
        // }
        // }
        // q3- Add------
        // int A = sc.nextInt();
        // for (int i = 1; i <= A; i++) {
        // if (i % 2 == 0) {
        // System.out.print(i + " ");
        // }
        // }
        // q4- Add------
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // int res = 1;
        // for (int i = 1; i <= B; i++) {
        // res *= A;
        // }
        // System.out.println(res);
        // q5- Add------
        int A = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= 10; i++) {
            ans = A * i;
            System.out.println(A + "*" + i + "=" + ans);
        }
        sc.close();
    }
}
