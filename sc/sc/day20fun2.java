package sc;

import java.util.*;

public class day20fun2 {
    // q3- Assignment---
    // static int power(final int a, final int b) {
    // double c = Math.pow((double) a, (double) b);
    // return (int) c;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int result = power(a, b);
    // System.out.println("power : " + result);

    // sc.close();

    // }
    // static int power(final int a, final int b) {
    // int ans = 1;
    // for (int i = 1; i <= b; i++) {
    // ans *= a;
    // }
    // return ans;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int result = power(a, b);
    // System.out.println("power : " + result);

    // sc.close();

    // }
    // q2 Assignment----
    // static double solve(int a) {
    // double area = Math.PI * a * a;
    // return Math.round(area * 100.0) / 100.0;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();

    // double result = solve(a);
    // System.out.println("area : " + result);

    // sc.close();

    // }
    // static double solve(int a) {
    // double PI = 3.1416;
    // double area = PI * a * a;
    // return Math.round(area * 100.0) / 100.0;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();

    // double result = solve(a);
    // System.out.println("area : " + result);

    // sc.close();

    // }
    // q3 Assignment----
    // static int solve(int a) {
    // double volume = (Math.PI * a * a * a * 4) / 3;
    // return (int) Math.ceil(volume);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();

    // int result = solve(a);
    // System.out.println("volume : " + result);

    // sc.close();

    // }
    // q4 Assignment----
    // static int solve(int a, int b, int c) {
    // return Math.min(a / b, c);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();

    // int result = solve(a, b, c);
    // System.out.println("chocolate : " + result);

    // sc.close();

    // }
    // static int solve(int a, int b, int c) {
    // if (a / b >= c) {
    // return c;
    // } else {
    // return a / b;
    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int c = sc.nextInt();

    // int result = solve(a, b, c);
    // System.out.println("chocolate : " + result);

    // sc.close();

    // }
    // // q5 Assignment----
    // static int solve(int a, int b) {
    // return ((a * 3 + b) / 2);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int result = solve(a, b);
    // System.out.println("shake : " + result);

    // sc.close();

    // }
    // q1 Add----
    // static int solve(int n) {
    // int prime = 0;
    // for (int i = 1; i <= n; i++) {
    // int count = 0;
    // for (int j = 1; j <= i; j++) {
    // if (i % j == 0) {
    // count++;
    // }
    // }
    // if (count == 2) {
    // prime++;
    // }
    // }
    // return prime;

    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int result = solve(n);
    // System.out.println("prime : " + result);

    // sc.close();
    // }
    // q2 Add----
    // static double bmiCalc(double a, double b) {
    // a = a / 100;
    // double c = a * a;
    // double bmi = Math.round(b / c * 10) / 10.0;
    // return bmi;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // double a = sc.nextDouble();
    // double b = sc.nextDouble();
    // double bmi = bmiCalc(a, b);
    // if (bmi < 18.5) {
    // System.out.println("Underweight");
    // } else if (bmi >= 18.5 && bmi < 24.9) {
    // System.out.println("Normal Weight");
    // } else if (bmi >= 24.9 && bmi <= 29.9) {
    // System.out.println("Overweight");
    // } else {
    // System.out.println("Obese");
    // }
    // System.out.println("bmi : " + bmi);

    // sc.close();
    // }
    // q3 Add----
    // static int solve(int a) {
    // if (a * a % 2 == 0) {
    // return 1;
    // } else {
    // return 0;
    // }
    // }
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int result = solve(a);
    // System.out.println("perfectSquare : " + result);
    // sc.close();
    // }
    // q4 Add----
    // static int solve(int a) {
    // for (int i = 1; i <= a; i++) {

    // if (i * i == a) {
    // return i;
    // }
    // }
    // return -1;

    // // return (int)(Math.sqrt(A) % 1 == 0 ? Math.sqrt(A) : -1);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int result = solve(a);
    // System.out.println("perfectSquare : " + result);
    // sc.close();
    // }
    // q5 Add----
    static int solve(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {

            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = solve(a);
        System.out.println("evenSum : " + result);
        sc.close();
    }
}
