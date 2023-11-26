package sc;

import java.util.Scanner;

public class day9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // question 1
        // int A = sc.nextInt();
        // int B = sc.nextInt();
        // if (A > B) {
        // System.out.println(A);
        // } else {
        // System.out.println(B);
        // }
        // question 2
        // int B = sc.nextInt();
        // int A = sc.nextInt();
        // if (A < B) {
        // System.out.println(A);
        // } else {
        // System.out.println(B);
        // }
        // question 3
        // int A = sc.nextInt();
        // if (A % 2 == 0) {
        // System.out.println("it is even" + " " + 0);
        // } else {
        // System.out.println("it is odd" + " " + 1);
        // }
        // question 4
        // int C = sc.nextInt();
        // System.out.println("cost price is:" + C);
        // int S = sc.nextInt();
        // System.out.println("selling price is:" + S);
        // if (C < S) {
        // System.out.println(1);
        // } else {

        // System.out.println(-1);
        // }
        // System.out.println(S - C);
        // question 5
        // int A = sc.nextInt();
        // if ((A % 5 == 0) && (A % 11 == 0)) {
        // System.out.println(1);
        // } else {
        // System.out.println(0);

        // }
        // question 6
        // int age = sc.nextInt();
        // if (age >= 13) {
        // System.out.println("you can ride roller coster!");
        // } else {
        // System.out.println("you can't ride roller coster.");
        // }
        // question additional 1
        // int a1 = sc.nextInt();
        // int a2 = sc.nextInt();
        // int b1 = sc.nextInt();
        // int b2 = sc.nextInt();
        // double A = (double) (a1 + a2) / 2;
        // double B = (double) (b1 + b2) / 2;
        // if (A > B) {
        // System.out.println("true");
        // } else {
        // System.out.println("false");
        // }
        // question additioinal 2
        // int N = sc.nextInt();
        // if (N % 3 == 0) {
        // System.out.print("ROCK");
        // }
        // if (N % 5 == 0) {
        // System.out.print("STAR");
        // }
        // question additioinal 3
        // int n = sc.nextInt();
        // if ((n > 0) && (n % 2 != 0)) {
        // System.out.println("Number is Positive and Odd");
        // } else if ((n > 0) && (n % 2 == 0)) {
        // System.out.println("Number is Positive and even");
        // } else if ((n < 0) && (n % 2 == 0)) {
        // System.out.println("Number is negative and even");
        // } else {
        // System.out.println("Number is negative and odd");
        // }
        // question additioinal 4
        // int X = sc.nextInt();
        // int Y = sc.nextInt();
        // if ((X > 0) && (Y > 0)) {
        // System.out.println("X, Y belongs to First Quadrant");
        // } else if ((X < 0) && (Y > 0)) {
        // System.out.println("X, Y belongs to Second Quadrant");
        // } else if ((X < 0) && (Y < 0)) {
        // System.out.println("X, Y belongs to Third Quadrant");
        // } else {
        // System.out.println("X, Y belongs to Fourth Quadrant");
        // }
        // question additioinal 5
        // String Name = sc.nextLine();

        // int YOS = sc.nextInt();
        // if (YOS > 5) {
        // System.out.println("Yes" + " " + Name + " " + " will recieve bonus");
        // } else {
        // System.out.println("No" + " " + Name + " " + " will not recieve bonus");
        // }
        // question additioinal 11
        int T = sc.nextInt();
        int N = sc.nextInt();
        double att = ((double) N / T) * 100;
        System.out.println(att);
        if (att >= 75) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
