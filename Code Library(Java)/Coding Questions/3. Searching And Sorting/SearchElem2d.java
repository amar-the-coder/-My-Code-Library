import java.util.Scanner;

public class SearchElem2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int f = 0;
		System.out.println("enter the rows of the array");
		int rows = sc.nextInt();
		System.out.println("enter the rows of the array");
		int colums = sc.nextInt();

		int[][] arr = new int[rows][colums];
		System.out.println("enter the elements in the array");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colums; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("enter the element you want search ");
		int value = sc.nextInt();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < colums; j++) {
				if (arr[i][j] == value) {
					System.out.println("element found at location (" + i + "," + j + ")");
					f = 1;
					break;
				}
			}
		}
		if (f == 0) {
			System.out.println("element not found");
		}
	}
}
