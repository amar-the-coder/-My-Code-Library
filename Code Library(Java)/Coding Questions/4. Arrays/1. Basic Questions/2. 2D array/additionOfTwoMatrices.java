// package arrays;

import java.util.Scanner;

public class additionOfTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of first array");
		int n1 = sc.nextInt();

		System.out.println("enter the size of second array");
		int n2 = sc.nextInt();

		int arr1[][] = new int[n1][n1];
		int arr2[][] = new int[n2][n2];

		System.out.println("enter the contents of the array1");
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n1; j++) {

				arr1[i][j] = sc.nextInt();
			}
		}

		System.out.println("enter the contents of the array2");
		for (int i = 0; i < n2; i++) {
			for (int j = 0; j < n2; j++) {

				arr2[i][j] = sc.nextInt();
			}
		}

		int n3 = 2;
		int arr3[][] = new int[2][2];

		for (int i = 0; i < n3; i++) {
			for (int j = 0; j < n3; j++) {

				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		System.out.println("the addition of the matrices");

		for (int i = 0; i < n3; i++) {
			for (int j = 0; j < n3; j++) {
				System.out.println(arr3[i][j] + " ");

			}
		}
		sc.close();

	}

}
