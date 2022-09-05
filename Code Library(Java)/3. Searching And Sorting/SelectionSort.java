//time complexity-- o(n)

package searchingAndSorting;

import java.util.Scanner;

public class SelectionSort {
     
	public static void printArray(int arr[]) {
		System.out.println("After implementing selection sort");
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter lenghth");
		int size = sc.nextInt();
			int arr[] = new int[size];
			
			System.out.println("enter content in array");
			for(int i=0; i<size; i++) {
			arr[i]=sc.nextInt();
				}
			
			for(int i=0; i<arr.length-1; i++) {
				int smallest = i;
				for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[smallest]) {
				smallest = j;
				}
				}
				//swap
				int temp = arr[smallest];
				arr[smallest] = arr[i];
				arr[i] = temp;
				}
				printArray(arr);
	}

}
