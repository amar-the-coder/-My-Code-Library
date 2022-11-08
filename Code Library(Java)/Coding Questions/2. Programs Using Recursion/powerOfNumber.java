// find x raise to the power with the help of recursion 
// Approach 1::

// main work = x^n = x*x^n-1;
// store x*x^n-1 in var with recursive call; and
// multiply var with x and store it in another variable;

// package recursion;
import java.util.Scanner;

public class powerOfNumber {
	public static int calcpower(int x, int n) {
		if (x == 0)
			return 0;

		if (n == 0)
			return 1;

		int powercalc = calcpower(x, n - 1);
		int power = x * powercalc;
		return power;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();
		System.out.println("enter the power");
		int b = sc.nextInt();
		int ans = calcpower(x, b);
		System.out.println("the power of " + x + " to " + b + " is: " + ans);
	}
}
