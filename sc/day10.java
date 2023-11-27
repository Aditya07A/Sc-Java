package sc;

import java.util.Scanner;

public class day10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // q1
    // int A = sc.nextInt();
    // if (A > 0) {
    // System.out.println(1);
    // } else if (A < 0) {
    // System.out.println(-1);
    // } else {
    // System.out.println(0);
    // }
    // q2
    // int A = sc.nextInt();
    // if (A == 1) {
    // System.out.println("January");
    // } else if (A == 2) {
    // System.out.println("Feabuary");
    // } else if (A == 3) {
    // System.out.println("March");
    // } else if (A == 4) {
    // System.out.println("April");
    // } else if (A == 5) {
    // System.out.println("May");
    // } else if (A == 6) {
    // System.out.println("June");
    // } else if (A == 7) {
    // System.out.println("July");
    // } else if (A == 8) {
    // System.out.println("August");
    // } else if (A == 9) {
    // System.out.println("September");
    // } else if (A == 10) {
    // System.out.println("October");
    // } else if (A == 11) {
    // System.out.println("November");
    // } else {
    // System.out.println("December");
    // }
    // q3
    // int A = sc.nextInt();
    // int B = sc.nextInt();
    // int C = sc.nextInt();
    // int D = sc.nextInt();
    // int E = sc.nextInt();
    // int per = ((A + B + C + D + E) / 5);
    // if (per >= 90) {
    // System.out.println("A");
    // } else if (per >= 80 && per < 90) {
    // System.out.println("B");
    // } else if (per >= 70 && per < 80) {
    // System.out.println("C");
    // } else if (per >= 60 && per < 70) {
    // System.out.println("D");
    // } else if (per >= 40 && per < 60) {
    // System.out.println("E");
    // } else {
    // System.out.println(E);
    // }
    // q4
    // int A = sc.nextInt();
    // int B = sc.nextInt();
    // int C = sc.nextInt();
    // if (A == B && A == C) {
    // System.out.println("equilateral");
    // } else if (A != B && B != C && A != C) {
    // System.out.println("scalene");
    // } else {
    // System.out.println("isosceles");
    // }
    // q5
    // int A = sc.nextInt();
    // int B = sc.nextInt();
    // int C = sc.nextInt();
    // if (A > B && A > C) {
    // System.out.println(A);
    // } else if (A < B && B > C) {
    // System.out.println(B);
    // } else {
    // System.out.println(C);
    // }
    // q6
    // int N = sc.nextInt();
    // if (N % 3 == 0 && N % 5 == 0) {
    // System.out.println("FizzBuzz");
    // } else if (N % 3 == 0) {
    // System.out.println("Fizz");
    // } else {
    // System.out.println("Buzz");
    // }
    // q additional 1
    // int M = sc.nextInt();
    // if (M >= 81 && M <= 100) {
    // System.out.println("Pass A");
    // } else if (M >= 50 && M <= 80) {
    // System.out.println("Pass B");
    // } else {
    // System.out.println("Fail");
    // }
    // q additional 2
    // int A = sc.nextInt();
    // if (A == 1) {
    // System.out.println("January");
    // } else if (A == 2) {
    // System.out.println("Feabuary");
    // } else if (A == 3) {
    // System.out.println("March");
    // } else if (A == 4) {
    // System.out.println("April");
    // } else if (A == 5) {
    // System.out.println("May");
    // } else if (A == 6) {
    // System.out.println("June");
    // } else if (A == 7) {
    // System.out.println("July");
    // } else if (A == 8) {
    // System.out.println("August");
    // } else if (A == 9) {
    // System.out.println("September");
    // } else if (A == 10) {
    // System.out.println("October");
    // } else if (A == 11) {
    // System.out.println("November");
    // } else {
    // System.out.println("December");
    // }
    // Q ADDITIONAL 3
    // int A = sc.nextInt();
    // int B = sc.nextInt();
    // int C = sc.nextInt();
    // if ((A + B + C) == 180) {
    // System.out.println(1);
    // } else {
    // System.out.println(0);
    // }
    // Q ADDITIONAL 4
    // int A = sc.nextInt();
    // int B = sc.nextInt();
    // int C = sc.nextInt();
    // if (A < B && A < C) {
    // System.out.println(A);
    // } else if (A > B && B < C) {
    // System.out.println(B);
    // } else {
    // System.out.println(C);
    // }
    // Q ADDITIONAL 5
    int N = sc.nextInt();
    if (N >= 10 && N <= 20) {
      int M = sc.nextInt();
      int sum = N + M;
      System.out.println(sum);
      if (sum >= 100) {
        System.out.println("That is a large sum!");
      }
    } else {
      System.out.println(-1);
    }
    sc.close();
  }
}
