// package mathsProblem;

import java.util.Scanner;

public class trailingZerosFactorial {

	public static int trailingZeros(int n) {
		int zeros = 0;
		for (int i = 5; i <= n; i = i * 5) {
			zeros += n / i;
		}

		return zeros;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int ans = trailingZeros(n);
		System.out.println(ans);

	}

}
