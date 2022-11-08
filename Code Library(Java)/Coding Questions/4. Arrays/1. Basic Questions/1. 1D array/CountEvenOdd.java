// package arrays;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int n;
		int even = 0, odd = 0;
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();

		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0)
				even++;

			else
				odd++;

		}
		System.out.println("Even in array " + even + " odd in array " + odd);

	}

}
