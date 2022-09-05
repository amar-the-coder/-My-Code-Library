package arrays;

import java.util.Scanner;

public class removesDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //METHOD 1
		Scanner sc= new Scanner(System.in);
		int size;
		System.out.println("enter the size");
		size= sc.nextInt();
		int arr[] = new int[1000];
		int i,j,k;
		
		System.out.println("enter the content in array");
		for(i=0; i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(i=0;i<size;i++) 
		{
			for(j=i+1; j<size;) 
			{
				if(arr[j]== arr[i])
				{
					for(k=j;k<size;k++)
					{
						arr[k]=arr[k+1];
					}
					size--;
				}
				else {
					j++;
				}
			}
		}
		System.out.println("after deletion");
		for(i=0; i<size;i++) {
			System.out.println(arr[i]+ " ");
		}
	}

}


// code is working after initializing 100 to the size


