package sc;

import java.util.*;

public class day24Array1d {

    // q1-Assignment----
    public static int[] frequency(int[] a) {
        int n = a.length;
        int[] res = new int[n];
        for (int i = 0; i <= n - 1; i++) {
            int count = 0;
            for (int j = 0; j <= n - 1; j++) {
                if (a[j] == a[i]) {
                    count++;
                }
            }

            res[i] = count;
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] output = frequency(a);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i] + " ");
        }

        sc.close();

    }

}
