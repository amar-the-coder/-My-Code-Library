
import java.util.Scanner;

public class checkArrayIsSorted {

	public static boolean isSorted(int arr[], int idx) {

		if (idx == arr.length - 1)
			return true;

		if (arr[idx] < arr[idx + 1])
			return isSorted(arr, idx + 1);

		else
			return false;

		// Approach alternative

		// instead of it we also can write
		// arr[idx] >= arr[idx+1];

		// false

		// isSorted(arr , idx+1)

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("enter values in array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		boolean ans = isSorted(arr, 0);
		System.out.println(ans);
		sc.close();

	}

}
