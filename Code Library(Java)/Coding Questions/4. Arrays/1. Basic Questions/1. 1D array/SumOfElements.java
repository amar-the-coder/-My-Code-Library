
// package arrays;
import java.util.Scanner;

public class SumOfElements {
	public static void main(String[] args) {
		int arr[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements in the array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		sc.close();
	}

}
