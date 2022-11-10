// package dsa;

import java.util.Scanner;

public class BinarySearch {

	public static void binarysearch(int arr[], int l, int r, int value) {

		int mid;

		mid = (l + r) / 2;

		while (l <= r) {
			if (arr[mid] == value) {
				System.out.println("value is present at " + mid);
				break;
			}

			else if (arr[mid] < value) {
				l = mid + 1;
			} else {
				r = mid - 1;
			}

			mid = (l + r) / 2;
		}

		if (l > r) {

			System.out.println("element is not present");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the size of the array");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("enter the elements in the array");

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("enter the number you want to search");
		int value = sc.nextInt();
		int r = n - 1;
		binarysearch(arr, 0, r, value);
		sc.close();

	}
}
