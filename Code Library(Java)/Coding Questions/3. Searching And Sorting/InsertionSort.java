// package searchingAndSorting;

import java.util.Scanner;

public class InsertionSort {
	public static void printArray(int arr[]) {
		System.out.println("after implementing insertion sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lenghth");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("enter content in array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > current) {
				// Keep swapping
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}
		printArray(arr);
		sc.close();
	}
}
