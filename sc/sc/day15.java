package sc;

import java.util.*;

public class day15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // q1 Assignment ---
        // int n = sc.nextInt();
        // int count = 0;
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // count++;
        // }
        // }
        // System.out.println(count);
        // q2 Assignment ---
        // int a = sc.nextInt();
        // int count = 0;
        // for (int i = 1; i <= a; i++) {
        // if (a % i == 0) {
        // count++;
        // }
        // }
        // if (count == 2) {
        // System.out.println("yes");
        // } else {
        // System.out.println("no");
        // }
        // int a = sc.nextInt();
        // boolean flag = true;
        // for (int i = 2; i < a; i++) {
        // if (a % i == 0) {
        // flag = false;
        // break;
        // }
        // }
        // if (flag == true) {
        // System.out.println("yes");
        // } else {
        // System.out.println("no");
        // }
        // q3 Assignment ---
        // int T = sc.nextInt();
        // while (T > 0) {
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i < n; i++) {
        // if (n % i == 0) {
        // sum += i;
        // }
        // }
        // if (sum == n) {
        // System.out.println("yes");
        // } else {
        // System.out.println("no");
        // }
        // T--;
        // }
        // q4-Assignment-----
        // int n = sc.nextInt();
        // int sum = 0;
        // for (int i = 1; i < n; i++) {
        // if (i % 2 == 1) {
        // sum += i;
        // }
        // }
        // System.out.println(sum);
        // q1-Add-----
        // int a = sc.nextInt();
        // for (int i = 2; i < a; i++) {
        // boolean flag = true;
        // for (int j = 2; j < i; j++) {
        // if (i % j == 0) {
        // flag = false;
        // break;
        // }
        // }
        // if (flag == true) {
        // System.out.println(i);
        // }
        // }
        // // q2-Add-----
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int ans = 0;
        // for (int i = 1; i <= a && i <= b; i++) {
        // // for (int i = 1; i <= Math.min(a,b); i++) {
        // if (a % i == 0 && b % i == 0) {
        // ans = i;
        // }
        // }
        // System.out.println(ans);
        // q3-Add-----
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int lcm = 0;
        // for (int i = 1; i <= (a * b); i++) {
        // if (i % a == 0 && i % b == 0) {
        // lcm = i;
        // break;
        // }
        // }
        // System.out.println(lcm);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int mx = Math.max(a, b);
        // for (; true; mx++) {
        // if (mx % a == 0 && mx % b == 0) {

        // break;
        // }
        // }
        // System.out.println(mx);
        // q10- add----
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
