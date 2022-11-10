// package arrays;

import java.util.Scanner;

public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int size;

		System.out.println("enter the size of array");

		size = sc.nextInt();
		int n[] = new int[size];
		System.out.println("enter the elments in array");
		for (int i = 0; i < size; i++) {
			n[i] = sc.nextInt();
		}

		System.out.println("the array contains");

		printArray(n);
		sc.close();

	}

	public static void printArray(int n[]) {
		int size = n.length;

		for (int i = 0; i < size; i++) {
			System.out.println(n[i]);
		}

	}
}
