package cwh;

import java.util.Scanner;

public class cwh_practice4 {
    public static void main(String[] args) {
        // question 2
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter marks of sub1");
        // int sub1 = sc.nextInt();
        // System.out.println("enter marks of sub2");
        // int sub2 = sc.nextInt();
        // System.out.println("enter marks of sub3");
        // int sub3 = sc.nextInt();
        // float avg = (sub1 + sub2 + sub3) / 3.0f;
        // if (avg >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
        // System.out.println("pass");

        // } else {
        // System.out.println("fail");
        // }
        // question 3
        // System.out.println("enter income in lakhs");
        // float tax = 0;
        // float income = sc.nextFloat();
        // if (income <= 2.5) {
        // tax = tax + 0;
        // } else if (income > 2.5f && income <= 5f) {
        // tax = tax + 0.05f * (income - 2.5f);
        // } else if (income > 5f && income <= 10.0f) {
        // tax = tax + 0.05f * (5.0f - 2.5f);
        // tax = tax + 0.2f * (income - 5f);
        // } else if (income > 10.0f) {
        // tax = tax + 0.05f * (5.0f - 2.5f);
        // tax = tax + 0.2f * (10.0f - 5f);
        // tax = tax + 0.3f * (income - 10.0f);
        // }
        // System.out.println("total tax is:- " + tax);
        // question 4
        // int day = sc.nextInt();
        // switch (day) {
        // case 1:
        // System.out.println("sunday");
        // break;
        // case 2:
        // System.out.println("monday");
        // break;
        // case 3:
        // System.out.println("tuesday");
        // break;
        // case 4:
        // System.out.println("wednesday");
        // break;
        // case 5:
        // System.out.println("thrusday");
        // break;
        // case 6:
        // System.out.println("friday");
        // break;
        // default:
        // System.out.println("saturday");
        // }
        // question 6
        String name = sc.nextLine();
        if (name.endsWith(".org")) {
            System.out.println("organisation");
        } else if (name.endsWith(".com")) {
            System.out.println("commercial");
        } else {
            System.out.println("Indian website");
        }
        sc.close();
    }
}
