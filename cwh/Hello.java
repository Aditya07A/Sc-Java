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

		// Scanner sc = new Scanner(System.in);
		// System.out.println("enter total max marks :-");
		// double t1 = sc.nextDouble();
		// System.out.println("enter marks of sub1 :-");
		// double s1 = sc.nextDouble();
		// System.out.println("enter marks of sub2 :-");
		// double s2 = sc.nextDouble();
		// System.out.println("enter marks of sub3 :-");
		// double s3 = sc.nextDouble();
		// System.out.println("enter marks of sub4 :-");
		// double s4 = sc.nextDouble();
		// System.out.println("enter marks of sub5 :-");
		// double s5 = sc.nextDouble();
		// double totalMarks = s1 + s2 + s3 + s4 + s5;

		// double Percentage = (totalMarks / t1) * 100;
		// System.out.println("total Marks is : " + totalMarks);
		// System.out.println("total percentage is : " + Percentage);

		// strings
		// String a = "adi";
		// String a1 = new String("aditya");
		// System.out.println(a1);
		// System.out.println(a);
		// String name = "adi";
		// int value = name.length();
		// System.out.println(value);
		// System.out.println(value);
		// String lstring = name.toLowerCase();
		// System.out.println(lstring);

		// String ustring = name.toUpperCase();
		// System.out.println(ustring);
		// Scanner sc = new Scanner(System.in);
		// int a = sc.nextInt();
		// if (a >= 18) {
		// System.out.println("you can drive");
		// } else {
		// System.out.println("You cannot drive");
		// }
		// Scanner sc = new Scanner(System.in);
		// System.out.println("enter age");
		// int age = sc.nextInt();
		// if (age > 50) {
		// System.out.println("u r a");
		// } else if (age > 40) {
		// System.out.println("u r b");
		// } else if (age > 30) {
		// System.out.println("u r c");
		// } else {
		// System.out.println("u r d");
		// }
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter button");
		int button = sc.nextInt();
		switch (button) {
			case 1:
				System.out.println("Namaste");
				break;
			case 2:
				System.out.println("Hello");
				break;
			default:
				System.out.println("Invalid");
		}

		sc.close();
	}
}