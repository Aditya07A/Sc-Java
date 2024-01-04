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

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int N = sc.nextInt(); // N is Size of Array
    // int a[] = new int[N]; // Initializing Array along with size N
    // for (int i = 0; i < N; i++) { // For Loop to take Input
    // a[i] = sc.nextInt();
    // }
    // int product = 1;
    // for (int i = 0; i < N; i++) { // For Loop to print output
    // product *= a[i];
    // }
    // System.out.print(product); // output
    // // q1- Add----
    // int N = sc.nextInt();
    // int[] A = new int[N];
    // for (int i = 0; i <= N - 1; i++) {
    // A[i] = sc.nextInt();
    // if (A[i] < 0) {
    // System.out.println(A[i] + " ");
    // }
    // }
    // q2- Add----
    // public static int[] solve(final int[] a, int b) {
    // int N = a.length;
    // int[] arr = new int[N];

    // for (int i = 0; i < N; i++) {
    // arr[i] = a[i] + b;
    // }
    // return arr;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int N = sc.nextInt();
    // int[] c = new int[N];
    // for (int i = 0; i <= N - 1; i++) {
    // c[i] = sc.nextInt();
    // }
    // int d = sc.nextInt();
    // int[] resultArray = solve(c, d);

    // System.out.print("Resultant Array:");
    // for (int i = 0; i < resultArray.length; i++) {
    // int num = resultArray[i];
    // System.out.print(num + " ");
    // }
    // // for (int num : resultArray) {
    // // System.out.print(num + " ");
    // // }
    // q3- Add----
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int T = sc.nextInt();
    // while (T > 0) {
    // int n = sc.nextInt();
    // int even = 0;
    // int odd = 0;
    // int a[] = new int[n];
    // for (int i = 0; i < a.length; i++) {
    // // for (int i = 0; i < n; i++) {
    // a[i] = sc.nextInt();
    // if (a[i] % 2 == 0) {
    // even++;
    // } else {
    // odd++;
    // }
    // }
    // if (even > odd) {
    // System.out.println("diff: " + (even - odd));
    // } else {
    // System.out.println("diff: " + (odd - even));
    // }
    // // sopln(Math.abs(even-odd));

    // }
    // T--;
    // q4-Add-----
    public static int sum(int[] a) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                even += a[i];
            } else {
                odd += a[i];
            }
        }
        int diff;
        if (even > odd) {
            diff = (even - odd);
        } else {
            diff = (even - odd);
        }

        return diff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            int res = sum(a);
            System.out.println(res);
        }

        sc.close();
    }
}
