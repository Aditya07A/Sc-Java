package cwh;

import java.util.Scanner;

class Hello {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		// Scanner sc = new Scanner(System.in);
		// System.out.println("enter num1: ");
		// int a = sc.nextInt();
		// System.out.println("enter num2: ");
		// int b = sc.nextInt();
		// int sum = a + b;
		// System.out.println("sum is : ");
		// System.out.println(sum);
		// boolean b1 = sc.hasNextInt();
		// System.out.println(b1);
		// String str = sc.next();
		// String str = sc.nextLine();
		// System.out.println(str);
		// boolean b1 = sc.hasNextFloat();
		// System.out.println(b1);

		Scanner sc = new Scanner(System.in);
		System.out.println("enter total max marks  :-");
		double t1 = sc.nextDouble();
		System.out.println("enter marks of sub1 :-");
		double s1 = sc.nextDouble();
		System.out.println("enter marks of sub2 :-");
		double s2 = sc.nextDouble();
		System.out.println("enter marks of sub3 :-");
		double s3 = sc.nextDouble();
		System.out.println("enter marks of sub4 :-");
		double s4 = sc.nextDouble();
		System.out.println("enter marks of sub5 :-");
		double s5 = sc.nextDouble();
		double totalMarks = s1 + s2 + s3 + s4 + s5;

		double Percentage = (totalMarks / t1) * 100;
		System.out.println("total Marks is : " + totalMarks);
		System.out.println("total percentage is : " + Percentage);
		sc.close();
	}
}