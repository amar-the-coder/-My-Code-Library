package programs;

import java.util.Scanner;

public class printFactorialRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact, currNum;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("the factorial between 1 to " + num);

		System.out.println("number : Factorial");

		for (int i = 1; i <= num; i++) {
			currNum = i;
			fact = 1;
			for (int j = 1; j <= currNum; j++) {
				fact = fact * j;
			}

			System.out.println("the factorial of " + currNum + " is " + fact);
		}

	}

}
