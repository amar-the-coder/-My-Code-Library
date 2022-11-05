package arrays;

import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int size1, size2;
         System.out.println("enter the size of arr 1");
         size1 = sc.nextInt();
         
         System.out.println("enter the size of arr 2");
         size2 = sc.nextInt();
         
         int n1[] = new int[size1];
         int n2[] = new int[size2];
         System.out.println("enter the elements in arr 1");
         for(int i=0; i<size1; i++) {
        	 n1[i] = sc.nextInt();
         }
         
         System.out.println("enter the elements in arr 2");
         for(int i=0; i<size2; i++) {
        	 n2[i] = sc.nextInt();
         }
         
         int n1_len = n1.length;
         int n2_len = n2.length;
         int n3_len =n1.length + n2.length;
         int n3[] = new int[n3_len];
         for(int i=0; i<n1.length; i++) {
        	 n3[i] = n1[i];
         }
         
         for(int i=0; i<n2.length; i++) {
        	 n3[n1.length+i] = n2[i];
         }
      
         System.out.println("the merge array is");
        	 for(int i=0; i<n3_len; i++) {
        		 System.out.println(n3[i]);
        	 }
         }
         
	}


