// time complexity ---average case O(nlogn)
// time complexity ---worst case   O(n^2)

package searchingAndSorting;

import java.util.Scanner;

public class quickSortAlgo {
	
	public static void swap(int arr[], int i , int j) {	
		arr[i]= arr[i]^arr[j];
		arr[j]= arr[i]^arr[j];
		arr[i]= arr[i]^arr[j];		
	}
	     
	public static int partition(int arr[], int l, int h) {
		
		int pivot = arr[l];  //first element as pivot
		int i = l;           
		int j = h;
		
		while(i<j) {
			
			while(arr[i]<= pivot && i<h) 
				i++;       // less than pivot or equal to pivot simply increment it
			    
			while(arr[j]>pivot && j>l) 
				j--;       // yeh step tab hoga jab pivot se bada element milega aur start aur start ruk jayega, jab hume end ke sath khelna hai agar pivot se bada element mile to decrement karta rah, jab pivot se chota elemnet milega tab ruk jana hai.
			
			if(i < j)   // swap of start with end
			  swap(arr,i,j);
		
		}
		

		if(j!=l)  // when they cross each other, swap pivot with end 
			swap(arr,j,l );
		
		return j; // pivot element ka index mil gya
		
	}
	
	
	public static void quickSort( int arr[], int left, int right) {
		
		if(left<right) { // don't forget this condition
		
		int pivotIndex = partition(arr, left , right);
		quickSort(arr, left, pivotIndex-1);
		quickSort(arr, pivotIndex+1, right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter the values in array");
		
		for(int i=0; i<size;i++) {
			
			arr[i] = sc.nextInt();
		}
		
		
		int left =0;
		int right = size-1;
		
		
		quickSort(arr, left, right);
				
		// print the array
		
		System.out.println("the sorted array is:");
		
		
        for(int i=0; i<size;i++) {
			
			System.out.println(arr[i]);
		}
			
		
		
	}

}
