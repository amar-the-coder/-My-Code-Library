// package arrays;

import java.util.Scanner;

public class productOftwoMatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r1 = sc.nextInt();
		int c1 = sc.nextInt();

		int one[][] = new int[r1][c1];
		System.out.println("enter the content of MAT1");
		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c1; j++) {
				one[i][j] = sc.nextInt();
			}
		}

		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		sc.close();

		int two[][] = new int[r2][c2];
		System.out.println("enter the content of MAT1");
		for (int i = 0; i < r2; i++) {
			for (int j = 0; j < c2; j++) {
				two[i][j] = sc.nextInt();
			}
		}

		if (c1 != r2) {
			System.out.println("invalid multiplication cannot happen");
			return;

		}

		int prod[][] = new int[r1][c2];

		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				for (int k = 0; k < c1; k++) {
					prod[i][j] += one[i][k] * two[k][j];
				}
			}
		}

		for (int i = 0; i < r1; i++) {
			for (int j = 0; j < c2; j++) {
				System.out.print(prod[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
		sc.close();

	}

}
