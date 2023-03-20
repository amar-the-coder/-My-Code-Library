// package recursion;

import java.util.Scanner;

public class sumOfNaturalNumbers {

	public static void sumNatural(int num, int i, int sum) {
		if (i == num) {
			sum = sum + i;
			System.out.println("the sum of natural number is " + sum);
			return;

		}

		sum += i;
		sumNatural(num, i + 1, sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");
		int num = sc.nextInt();
		int i = 0;
		int sum = 0;
		sumNatural(num, i, sum);
		sc.close();

	}

}
