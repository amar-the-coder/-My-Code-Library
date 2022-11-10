
// package arrays;
import java.util.*;

public class checkAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array");
		int size = sc.nextInt();
		int numbers[] = new int[size];
		// input
		System.out.println("input contents");
		for (int i = 0; i < size; i++) {
			numbers[i] = sc.nextInt();
		}
		Boolean isAscending = true;

		for (int i = 0; i < numbers.length - 1; i++) { // NOTICE numbers.length - 1 as termination condition

			if (numbers[i] > numbers[i + 1]) { // This is the condition for descending order

				isAscending = false;
			}
		}
		if (isAscending) {
			System.out.println("The array is sorted in ascending order");
		} else {
			System.out.println("The array is not sorted in ascending order");
		}
		sc.close();

	}

}
