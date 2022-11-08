
import java.util.Scanner;

public class RevNumber {

	public static void revNumber(int num) {

		int lastDigit;
		int rev = 0;

		while (num > 0) {
			lastDigit = num % 10;

			rev = (rev * 10) + lastDigit;
			num = num / 10;
		}

		System.out.println("the reverse of the number is " + rev);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the num");

		int num = sc.nextInt();

		revNumber(num);

	}

}
