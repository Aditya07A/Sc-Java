package sc;

import java.util.*;

public class day23Array1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] A = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            int B = sc.nextInt();
            int exists = 0;
            for (int i = 0; i < N; i++) {
                if (A[i] == B) {
                    exists = 1;
                    break;
                }
            }
            System.out.println(exists);
            T--;
        }
        sc.close();
    }

}
