
import java.util.Scanner;

class Hello {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num1: ");
		int a = sc.nextInt();
		System.out.println("enter num2: ");
		int b = sc.nextInt();
		int sum = a + b;
		System.out.println("sum is : ");
		System.out.println(sum);
	}
}