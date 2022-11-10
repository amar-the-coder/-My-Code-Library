
import java.util.Scanner;

public class SumOfDigits {

	public static void sumDigits(int num) {
		int lastDigit, sum;
		sum = 0;
		while (num > 0) {
			lastDigit = num % 10;
			sum = sum + lastDigit;
			num = num / 10;
		}

		System.out.println("the sum of digits is " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		sumDigits(num);
		sc.close();
	}

}
