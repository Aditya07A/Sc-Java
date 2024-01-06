package sc;

// public class day23Array1d {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
// q1-Assignment------
// int T = sc.nextInt();
// while (T > 0) {
// int N = sc.nextInt();
// int[] A = new int[N];
// for (int i = 0; i < N; i++) {
// A[i] = sc.nextInt();
// }
// int B = sc.nextInt();
// int exists = 0;
// for (int i = 0; i < N; i++) {
// if (A[i] == B) {
// exists = 1;
// break;
// }
// }
// System.out.println(exists);
// T--;
// }

// ----with function
// boolean searchArr(int[] arr, int B) {
// int n = arr.length;
// for (int i = 0; i < n; i++) {
// int res = arr[i];
// if (res == B) {
// return true;
// }
// }
// return false;
// }

//     sc.close();

// }
// q2-Assignment------
// public class day23Array1d {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//     int n = sc.nextInt();
//     int[] a = new int[n];
//     for (int i = 0; i < a.length; i++) {
//         a[i] = sc.nextInt();
//     }
//     int b = sc.nextInt();
//     int res = frequency(a, b);
//     System.out.println("frequency of B:" + res);
//     sc.close();

// }

// static int frequency(int[] arr, int B) {
//     int n = arr.length;
//     int count = 0;
//     for (int i = 0; i < n; i++) {
//         int res = arr[i];
//         if (res == B) {
//             count++;
//         }
//     }
//     return count;
// }
// q3-Assignment------
// public class day23Array1d {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt();
//         while (T > 0) {
//             int N = sc.nextInt();
//             int[] A = new int[N];
//             for (int i = 0; i < N; i++) {
//                 A[i] = sc.nextInt();
//             }
//             System.out.println();
//             for (int i = 0; i < N; i++) {
//                 if (A[i] % 2 == 0) {
//                     System.out.println(A[i] + " ");
//                 }
//             }
//             System.out.println();
//             for (int i = 0; i < N; i++) {
//                 if (A[i] % 2 == 1) {
//                     System.out.println(A[i] + " ");
//                 }
//             }
//             T--;
//         }
//         sc.close();
//     }

// }
// q4-Assignment-----
import java.util.Scanner;

public class day23Array1d {

    public int[] solve(int[] A, int B) {
        int count = 0;
        int C[] = new int[2];
        C[0] = 0;
        C[1] = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == B) {
                count++;
                C[1] = i;
                if (count == 1)
                    C[0] = i;
            }
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();

        int[] A = new int[length];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length; i++) {
            A[i] = sc.nextInt();
        }

        // Taking the value to search from the user
        System.out.print("Enter the value to search for: ");
        int B = sc.nextInt();

        // Creating an instance of the day23Array1d class
        day23Array1d solution = new day23Array1d();

        // Calling the solve method
        int[] result = solution.solve(A, B);

        // Check if result is not null and not equal to [0, 0]
        if (result != null && !(result[0] == 0 && result[1] == 0)) {
            // Displaying the result
            System.out.println("Indices of " + B + " in the array: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("Value " + B + " not found in the array.");
        }
        sc.close();
    }
}
