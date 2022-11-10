// package bit_Manipulation;

import java.util.Scanner;

public class findTwoNonRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// traverse array with performing XOR
		// then store res with temp;
		// divide into two part with two array:
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int res = 0;

		System.out.println("enter the content of array");
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();

		System.out.println("after remove repeating element:");

		for (int i = 0; i < size; i++) {
			res = res ^ arr[i];
		}
		int temp = res;
		for (int i = 0; i < size; i++) {
			int bit = arr[i] & 1;
			if (bit == 1) {
				temp = temp ^ arr[i];
			}
		}
		int a = temp;
		int b = res ^ a;
		System.out.println(a + " " + b);

		sc.close();

	}

}
