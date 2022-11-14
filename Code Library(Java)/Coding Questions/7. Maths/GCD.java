
// package mathsProblem;
import java.util.Scanner;

public class GCD {
	public static int calcGCD(int a, int b) {
		if (b == 0)
			return a;

		return calcGCD(b, a % b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(calcGCD(a, b));
		sc.close();
	}

}

// Mistakes i done:
// if a>b then (a%b) always equal then a
// if a<b then it will calculate as per divisor method:

// GCD means == sabse bada number jo dono ka factor ho

// LCM means == sabse chota number jo dono se divide ho jaye