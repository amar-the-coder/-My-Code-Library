package arrays;

import java.util.Scanner;

public class ArrayDeletion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = new int[50];
		 
	       Scanner sc = new Scanner(System.in);
	      System.out.println("enter the size of the array");
	   int n = sc.nextInt();
	   
	   System.out.println("enter the elements in the array");
	   
	   for(int i=0 ; i<n; i++) {
		   arr[i] = sc.nextInt();
	   }
	
	   int  pos;
	   
	   
	   System.out.println("enter the position in which you want to delete the number");
	   pos = sc.nextInt();
	   
	   if(pos<0 || pos>n+1)
	   {
		   System.out.println("invalid position -- can't delete");
	   }
	   
	   else {
		   for(int i=pos-1; i<n-1;i++)
		   {
			   arr[i] = arr[i+1];
		   }
	   }
	   
	   System.out.println("array after deletion");
			
	       for(int i=0 ; i<n-1; i++) 
	       {
	    	System.out.println(arr[i]);
	       }
	       
		
		}
	}
	
	   
	   
	


