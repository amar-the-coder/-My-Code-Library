// package recursion;

import java.util.Scanner;

public class powerOfNumberProblemOptimized {
	public static int calcpower(int x, int n) {
		if (x == 0)
			return 0;

		if (n == 0)
			return 1;

		if ((n & 1) == 0) {
			return calcpower(x, n / 2) * calcpower(x, n / 2);
		}

		else
			return x * calcpower(x, n / 2) * calcpower(x, n / 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		System.out.println("enter the power");
		int b = sc.nextInt();
		int ans = calcpower(x, b);
		System.out.println("the power of " + x + " to " + b + " is: " + ans);
		sc.close();
	}

}
