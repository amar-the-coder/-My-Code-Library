// properties of modulo.....
// 1. (a+b)%n = (a%n+b%n)%n
// 2. (a-b)%n = (a%n-b%n)%n
// 3. (a*b)%n = (a%n*b%n)%n

// logic make  numbers as long becuase if we take int then it will not able to handle the values. 

// package mathsProblem;

import java.util.Scanner;

public class fastPowerUsingModulo {

	static long fastpower(long a, long b, long n) {
		long res = 1;

		while (b > 0) {
			if ((b & 1) != 0) {
				res = (res * a * n) % n;
			}
			a = (a % n * a % n) % n;
			b = b >> 1;

		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		long a = sc.nextLong();
		System.out.println("enter the number");
		long b = sc.nextLong();
		long ans = fastpower(a, b, 1000000000);
		System.out.println(ans);
		sc.close();

	}
}

// progam doesn't produce any output i hope it will resolve the issue.....
