// package searchingAndSorting;

import java.util.Scanner;

public class quickSortAlgo {

	public static void swap(int arr[], int i, int j) {

		arr[i] = arr[i] ^ arr[j];
		arr[j] = arr[i] ^ arr[j];
		arr[i] = arr[i] ^ arr[j];
	}

	public static int partition(int arr[], int l, int h) {

		int pivot = arr[l]; // first element as pivot
		int i = l;
		int j = h;

		while (i < j) {

			while (arr[i] <= pivot && i < h)
				i++;

			while (arr[j] > pivot && j > l)
				j--;

			if (i < j)
				swap(arr, i, j);

		}

		if (j > i) // or we can say like this also if(j!=l)
			swap(arr, j, l);

		return j;

	}

	public static void quickSort(int arr[], int left, int right) {

		if (left < right) {

			int pivotIndex = partition(arr, left, right);
			quickSort(arr, left, pivotIndex - 1);
			quickSort(arr, pivotIndex + 1, right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("enter the values in array");

		for (int i = 0; i < size; i++) {

			arr[i] = sc.nextInt();
		}

		int left = 0;
		int right = size - 1;

		quickSort(arr, left, right);

		// print

		System.out.println("the sorted array is:");

		for (int i = 0; i < size; i++) {

			System.out.println(arr[i]);
		}
		sc.close();
	}

}
