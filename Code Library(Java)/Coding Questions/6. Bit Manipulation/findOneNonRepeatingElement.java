package bit_Manipulation;

import java.util.Scanner;

public class findOneNonRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // find one non repeating element in array where all elements repeat twice;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int size= sc.nextInt();
		int arr[] = new int[size];
		int res=0;
		
		System.out.println("enter the content of array");
		for(int i=0; i<size;i++)
			arr[i]= sc.nextInt();
		
		System.out.println("after remove repeating element:");
		
		for(int i=0; i<size;i++) {
			res= res^arr[i];
		}
		
		System.out.println("the non repeating element:" +res);
	}

}
