package sc;

import java.util.*;

public class day19function1 {
    // q1- Assignment---
    // static int sum(int a, int b) {
    // return a + b;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // { // int result = sum(3, 4);
    // System.out.println("result : " + result);
    // }
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // System.out.println(a + b);

    // sc.close();

    // }
    // // q2- Assignment---
    // static int product(int a, int b) {
    // return a * b;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // System.out.println(a * b);

    // sc.close();

    // }
    // // q3- Assignment---
    // static int square(int a) {
    // return a * a;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();
    // int result = square(a);
    // System.out.println("square : " + result);

    // sc.close();

    // }
    // // q4- Assignment---
    // public static int divide(final int a, final int b) {
    // return (a / b);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int result = divide(a, b);
    // System.out.println("divide : " + result);

    // sc.close();

    // }
    // // q5- Assignment---
    // static int cube(int a) {
    // return a * a * a;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();
    // int result = cube(a);
    // System.out.println("cube : " + result);

    // sc.close();

    // }
    // // q1- Add---
    // static int solve(int a) {
    // double ans = Math.floor(a / 200);
    // return (int) ans;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();

    // System.out.println(solve(a));

    // sc.close();

    // }
    // // q2- Add---
    // static int solve(int a) {
    // double ans = Math.ceil((double) a / 200);
    // return (int) ans;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();

    // System.out.println(solve(a));

    // sc.close();

    // }
    // // q3- Add---
    // static double solve(double celsius) {
    // double farenhit;
    // farenhit = (celsius * 1.8) + 32;
    // double ans = (farenhit * 100 / 100d);
    // return ans;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // double celsius = sc.nextDouble();

    // System.out.println(solve(celsius));

    // sc.close();

    // }
    // // q4- Add---
    static int solve(int a) {
        double ans = Math.round((double) a / 200);
        return (int) ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println(solve(a));

        sc.close();

    }

}
