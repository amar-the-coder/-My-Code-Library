
import java.util.*;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int count, n;
		System.out.println("enter the number for which you want to check it is prime or not");
		n = sc.nextInt();
		count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(n + " is prime");
		}

		else {
			System.out.println(n + " is not prime");
		}

	}

}
