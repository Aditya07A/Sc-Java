package cwh;

import java.util.Scanner;

public class cwh_practice2 {
    public static void main(String[] args) {

        // ---question 1 ---------------------------
        // float a = 7 / 4 * 9 / 2; result = 4.0(wrong value)
        // float a = 7 / 4 =1.75
        // 1.75*9=15.75
        // 15.75/2 =7.85 (correct value)

        // float a = 7 / 4.0f * 9 / 2.0f; result = 7.85(correct value)
        // System.out.println(a);

        // ---question 2 ---------------------------
        // char grade = 'B';
        // grade = (char) (grade + 8);
        // System.out.println(grade);

        // // decrypt
        // grade = (char) (grade - 8);
        // System.out.println(grade);

        // ---question 3 ---------------------------
        Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // System.out.println(num > 10);

        // ---question 4 ---------------------------
        // int v = 7;
        // int u = 3;
        // int a = 2;
        // int s = 2;
        // int k = ((v * v) - (u * u)) / 4 * a * s;
        // System.out.println(k);

        // ---question 5 ---------------------------
        // int x = 7;
        int a = 7 * 49 / 7 + 35 / 7;// result = 54
        System.out.println(a);
        sc.close();
    }
}
