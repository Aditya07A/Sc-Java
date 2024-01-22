
// class Calculator {
//     int a;

//     public int add(int n1, int n2) {

//         int r = n1 + n2;
//         return r;
//     }

// }

// public class demo1 {

//     public static void main(String[] args) {
//         int num1 = 4;
//         int num2 = 5;

//         Calculator calc = new Calculator();
//         int res = calc.add(num1, num2);
//         System.out.println(res);

//     }
// }
// class Calculator1 {
//     int a;

//     public int add(int n1, int n2) {

//         int r = n1 + n2;
//         return r;
//     }

// }

// public class demo1 {

//     public static void main(String[] args) {
//         int num1 = 4;
//         int num2 = 5;

//         Calculator1 calc = new Calculator1();
//         int res = calc.add(num1, num2);
//         System.out.println(res);

//     }}

//     int N = sc.nextInt();if(N>=10&&N<=20)
//     {
//         int M = sc.nextInt();
//         int sum = N + M;
//         System.out.println(sum);
//         if (sum >= 100) {
//             System.out.println("That is a large sum!");
//         }
//     }else
//     {
//   System.out.println(-1);
// }
package sc;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = N - 1;
        for (int i = 1; i < 2 * N; i++) {
            if (i <= N) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= k; j++) {
                    System.out.print("*");
                }
                k = k - 1;
            }
            System.out.println();
        }
        sc.close();

    }
}