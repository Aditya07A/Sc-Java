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
        int a = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        sc.close();
    }
}
