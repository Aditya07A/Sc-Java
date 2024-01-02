package sc;

import java.util.*;

public class day22Array1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // // q1-Assignment----
        // int n = sc.nextInt();
        // int a[] = new int[n];
        // for (int i = 0; i < a.length; i++) {
        // // for (int i = 0; i < n; i++) {
        // a[i] = sc.nextInt();
        // }
        // for (int i = n - 1; i >= 0; i--) {
        // System.out.print(a[i] + " ");
        // }
        // q2-Assignment----
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            // for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <= n - 1; i++) {
            System.out.println(a[i] + " ");
        }
        Arrays.sort(a);
        System.out.println(a[a.length - 1] + " &" + a[0]);

        sc.close();
    }
}
