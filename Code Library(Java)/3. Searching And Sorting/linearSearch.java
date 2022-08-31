package dsa;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 0;
		System.out.println("enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	    int [] arr = new int[n];
		System.out.println("enter the elements in the array");
		for(int i=0; i<n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the element you want ");
		int value = sc.nextInt();
		for(int i = 0; i<n ; i++)
		{
			if(value==arr[i])
			{
				System.out.println("element found at index " +i);
				f =1;
				break;
			}
		}
		if(f==0) {
	System.out.println("element not found");
}
	}

}
