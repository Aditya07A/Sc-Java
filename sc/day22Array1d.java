package sc;

import java.util.*;

public class day22Array1d {
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
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
    // int n = sc.nextInt();
    // int a[] = new int[n];
    // for (int i = 0; i < a.length; i++) {
    // // for (int i = 0; i < n; i++) {
    // a[i] = sc.nextInt();
    // }
    // for (int i = 0; i <= n - 1; i++) {
    // System.out.println(a[i] + " ");
    // }
    // Arrays.sort(a);
    // System.out.println(a[a.length - 1] + " &" + a[0]);

    // int n = sc.nextInt();
    // int a[] = new int[n];
    // for (int i = 0; i < n; i++) {
    // a[i] = sc.nextInt();
    // }
    // int min_arr = a[0];
    // int max_arr = a[0];
    // for (int i = 0; i < n; i++) {
    // if (max_arr < a[i]) {
    // max_arr = a[i];
    // } else if (min_arr > a[i]) {
    // min_arr = a[i];
    // }
    // }
    // System.out.print(max_arr + " " + min_arr);

    // static int maxOfArray(int[] a) {
    // int n = a.length;
    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < n; i++) {
    // if (a[i] > max) {
    // max = a[i];
    // }
    // }
    // return max;
    // }

    // static int minOfArray(int[] a) {
    // int n = a.length;
    // int min = Integer.MAX_VALUE;
    // for (int i = 0; i < n; i++) {
    // if (a[i] < min) {
    // min = a[i];
    // }
    // }
    // return min;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int[] arr = new int[n];
    // for (int i = 0; i < n; i++) {
    // arr[i] = sc.nextInt();
    // }
    // sc.close();

    // System.out.print(maxOfArray(arr) + " " + minOfArray(arr));
    // }

    // q3-Assignment----
    // int N = sc.nextInt();
    // int[] A = new int[N];
    // int sum = 0;
    // for (int i = 0; i <= N - 1; i++) {
    // A[i] = sc.nextInt();
    // sum += A[i];
    // }
    // System.out.println(sum);
    // q4-Assignment----
    // public static long solve(ArrayList<Integer> arr) {
    // long ans = 1;
    // // iterating over arr to find product
    // for (int i = 0; i < arr.size(); i++) {
    // ans = ans * arr.get(i);
    // }
    // return ans;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // N is Size of Array
        int a[] = new int[N]; // Initializing Array along with size N
        for (int i = 0; i < N; i++) { // For Loop to take Input
            a[i] = sc.nextInt();
        }
        int product = 1;
        for (int i = 0; i < N; i++) { // For Loop to print output
            product *= a[i];
        }
        System.out.print(product); // output
        sc.close();
    }
}
