package sc;

// import java.util.*;

// public class day24Array1d {

// // q1-Assignment----
// public static int[] frequency(int[] a) {
// int n = a.length;
// int[] res = new int[n];
// for (int i = 0; i <= n - 1; i++) {
// int count = 0;
// for (int j = 0; j <= n - 1; j++) {
// if (a[j] == a[i]) {
// count++;
// }
// }

// res[i] = count;
// }
// return res;
// }

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();

// int[] a = new int[n];
// for (int i = 0; i < a.length; i++) {
// a[i] = sc.nextInt();
// }
// int[] output = frequency(a);
// for (int i = 0; i < output.length; i++) {
// System.out.print(output[i] + " ");
// }

// sc.close();

// }
// // q2-Assignment----
// public static int unique(int[] a) {

// int ans = 0;
// for (int i = 0; i < a.length; i++) {
// int count = 0;
// for (int j = 0; j < a.length; j++) {
// if (a[j] == a[i]) {
// count++;
// }
// }
// if (count == 1) {
// ans = a[i];
// return ans;
// }

// }
// return -1;
// }

// public static void main(String[] args) {

// Scanner sc = new Scanner(System.in);

// int n = sc.nextInt();

// int[] a = new int[n];
// for (int i = 0; i < a.length; i++) {
// a[i] = sc.nextInt();
// }
// int output = unique(a);

// if (output != -1) {
// System.out.println("Unique element: " + output);
// } else {
// System.out.println("No unique element found.");
// }

// sc.close();

// }
import java.util.*;

// // q3-Assignment----
// import java.util.Scanner;

// public class day24Array1d {

//     static class Solution {
//         public int solve(int[] A) {
//             int n = A.length;
//             for (int i = 0; i <= n - 2; i++) {
//                 if (A[i] > A[i + 1]) {
//                     return 0;
//                 }
//             }
//             return 1;
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         int[] a = new int[n];
//         for (int i = 0; i < a.length; i++) {
//             a[i] = sc.nextInt();
//         }

//         Solution solution = new Solution();
//         int result = solution.solve(a);
//         System.out.println("The array is sorted: " + (result == 1));

//         sc.close();
//     }
// }
// q4-Assignment----
import java.util.Scanner;

public class day24Array1d {

    public static class Solution {
        public int solve(int[] A, int B) {
            int n = A.length;
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (A[i] + A[j] == B) {
                        count++;
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int valueB = sc.nextInt();

        Solution solution = new Solution();
        int countOfPairs = solution.solve(a, valueB);

        System.out.println("The count of pairs whose sum is " + valueB + " is: " + countOfPairs);

        sc.close();
    }
}
