// Time complexity -- O(n^2)
package arrays;

import java.util.Scanner;

public class removeDuplicatesMethod2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int size;
		System.out.println("enter the size");
		size= sc.nextInt();
		int arrA[] = new int[size];
		int arrB[] = new int[size];
		int i,j,count=0;
		
		System.out.println("enter the content in array");
		for(i=0; i<size;i++) {
			arrA[i] = sc.nextInt();
		}
		
		//remove duplicate logic 
		// in this if we found equal values then we increase the count and then store that values in another array B and then print the numbers 
		for(i =0; i<size; i++) 
		{
			for(j=0;j<count;j++)
			{
				if(arrA[i]==arrB[j])
					break;
			}
			
			if(j == count) {
				arrB[count]=arrA[i];
				count++;
				}
		}
		System.out.println("content after removing duplicates:");
		
		for(i=0; i<count;i++) {
			System.out.println(arrB[i]+" ");
		}
		
	
		
		
	}

}
