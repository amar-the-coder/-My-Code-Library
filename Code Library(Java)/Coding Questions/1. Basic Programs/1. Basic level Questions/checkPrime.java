
import java.util.Scanner;

public class checkPrime {

	public static void checkPrime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;

			}
		}
		if (count == 2)
			System.out.println(n + " is prime number");

		else
			System.out.println(n + " is not a prime number");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		checkPrime(n);
	}

}
