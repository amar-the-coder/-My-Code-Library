
import java.util.Scanner;

public class findPrimeRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter upto what u want to find the number");
		int num = sc.nextInt();
		int currNum;

		for (int i = 1; i <= num; i++) {
			currNum = i;
			int count = 0;
			for (int j = 1; j <= currNum; j++) {
				if (currNum % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println(currNum + " is prime");
			}

		}
		sc.close();

	}

}
