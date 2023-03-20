// package recursion;

import java.util.Scanner;

public class printfibonacciOfNumber {

	public static void printfib(int a, int b, int n) {

		if (n == 0)
			return;

		int c = a + b;
		System.out.println(c);

		printfib(b, c, n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");
		int num = sc.nextInt();

		int a = 0;
		int b = 1;

		System.out.println(a);
		System.out.println(b);

		printfib(a, b, num - 2);

		sc.close();

	}

}
