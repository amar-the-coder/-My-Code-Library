
// package mathsProblem;
import java.util.Scanner;

public class fastPower {
	static int fastpower(int a, int b) {
		int res = 1;

		while (b > 0) {
			if ((b & 1) != 0) {
				res = res * a;
			}
			a = a * a;
			b = b >> 1;

		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		System.out.println("enter the number");
		int b = sc.nextInt();
		int ans = fastpower(a, b);
		System.out.println(ans);
		sc.close();

		// approach 2 using modulo ... will adding soon
		// we have to use modulo because the above function cannot handle the big values
		// as it will overflow the value of int.

	}

}
