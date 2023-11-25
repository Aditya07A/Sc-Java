package sc;

import java.util.Scanner;

public class day8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // question 1
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 = sc.nextInt();
        // System.out.println("Number 1 is " + n1);
        // System.out.println("Number 2 is " + n2);
        // System.out.println("Number 3 is " + n3);

        // System.out.println("(n1 > n2) condition is " + (n1 > n2));
        // System.out.println("(n2 <= n3) condition is " + (n2 <= n3));
        // System.out.println(
        // "(n1 < n2) || ((n2 == n3) && (n1 < n3)) condition is " + ((n1 < n2) || ((n2
        // == n3) && (n1 < n3))));
        // question 2
        // int n1 = sc.nextInt();
        // int n2 = sc.nextInt();
        // int n3 = sc.nextInt();
        // System.out.println("Number 1 is " + n1);
        // System.out.println("Number 2 is " + n2);
        // System.out.println("Number 3 is " + n3);
        // System.out.println("(n1 < n2) condition is " + (n1 < n2));
        // System.out.println("(n2 == n3) condition is " + (n2 == n3));
        // System.out.println("(n1 < n2) && (n2 == n3) condition is " + ((n1 < n2) &&
        // (n2 == n3)));
        // question 3
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("Number 1 is " + n1);
        System.out.println("Number 2 is " + n2);
        System.out.println("Number 3 is " + n3);
        System.out.println("Number 3 is " + n3);
        System.out.println((n1 < 50) || (n2 > n3) || (n1 == n3));
        sc.close();
    }
}
