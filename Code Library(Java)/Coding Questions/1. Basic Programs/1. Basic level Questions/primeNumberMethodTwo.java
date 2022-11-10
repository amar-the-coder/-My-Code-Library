
import java.util.Scanner;

public class primeNumberMethodTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		boolean isPrime = true;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime == true) {
			if (n == 1) {
				System.out.println("it is neither prime not composite");
			}

			else {
				System.out.println(n + " is prime number");
			}
		}

		else {
			System.out.println(n + " is not prime number");

		}

		sc.close();

	}

}
