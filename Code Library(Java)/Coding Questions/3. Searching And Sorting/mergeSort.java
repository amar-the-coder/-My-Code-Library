package searchingAndSorting;

import java.util.Scanner;

public class mergeSort {
	
	        public static void conquer(int arr[], int l, int m , int r) {
	        	
	        	// GFG code 
	        	// In notebook Jenny explantion code
	       
	        	  int n1 = m - l + 1;
	              int n2 = r - m;
	       
	              /* Create temp arrays */
	              int L[] = new int [n1];
	              int R[] = new int [n2];
	       
	              /*Copy data to temp arrays*/
	              for (int i=0; i<n1; ++i)
	                  L[i] = arr[l + i];
	              for (int j=0; j<n2; ++j)
	                  R[j] = arr[m + 1+ j];
	       
	       
	              /* Merge the temp arrays */
	       
	              // Initial indexes of first and second subarrays
	              int i = 0, j = 0;
	       
	              // Initial index of merged subarray array
	              int k = l;
	              while (i < n1 && j < n2)
	              {
	                  if (L[i] <= R[j])
	                  {
	                      arr[k] = L[i];
	                      i++;
	                  }
	                  else
	                  {
	                      arr[k] = R[j];
	                      j++;
	                  }
	                  k++;
	              }
	       
	              /* Copy remaining elements of L[] if any */
	              while (i < n1)
	              {
	                  arr[k] = L[i];
	                  i++;
	                  k++;
	              }
	       
	              /* Copy remaining elements of R[] if any */
	              while (j < n2)
	              {
	                  arr[k] = R[j];
	                  j++;
	                  k++;
	              }
	              
	        }
	              
	        
	        	// APNA COLLEGE CODE by shardha didi
	              
//	        	int	arrB[] = new int[end-begin+1]; //  making a anew array don't forget this equation
//	        	
//	        	int idx1 = begin;   
//	        	int idx2 = mid+1;
//	        	int k = 0;
//	        	
//	          
//	       
//	          while( idx1<= mid &&  idx2<=end) {
//	        	  if(arrA[idx1]<= arrA[idx2]) {
//	        		  arrB[k++] = arrA[idx1++];
//	        	  }
//	        	  
//	        	  else {
//	        		  arrB[k++] = arrA[idx2++];
//	        	  }  
//	          }
//	          
//	          
//	         while(idx1<=mid) {
//	        	 arrB[k++]  = arrA[idx1++];
//	         }
//	        
//	         while(idx2<=end) {
//	        	 arrB[k++]  = arrA[idx2++];
//	         }
//	         
//	         copying the data of merged array into our array--->>
	              
//	         for ( int i=0, j=idx1; k<arrB.length; i++, j++) {
//	        	 arrA[j]= arrB[i];
//	         }
	        	
	        	
	            
	              
	              
	              
	              
	              
	              
	              
	              
// ------>>>>>> jenny lecture wala code jo mujhe samaj aaya.....................
	        
//	          public static void merge(int a[], int lb, int mid, int ub) {   

//	        	  int	b[] = new int[ub-lb+1];
//	        	 int  i=lb;
//	        	  int  j=mid+1;
//	        	    int k= lb;
	        	   
	        	   
//	        	   while(i<=mid && j<=ub) {
//	        		   if(a[i]<=a[j]) {
//	        			   b[k]=a[i];
//	        			   i++;
//	        		   }
	        		   
//	        		   else {
//	        			   b[k]=a[j];
//        			   j++;
//	        		   }
//	        			   k++;
//	        		   }
	        		   
	        		   
//	        		   if(i>mid) {
//	        			   while(j<=ub) {
//	        				   b[k]= a[j];
//	        				   j++;
//	        				   k++;
	        				   
//	        			   }
//	        		   }
	        		   
	        		   
//	        		   else {
//        			   while(i<=mid) {
//	        				   b[k]=a[i];
//	        				   i++;
//	        				   k++;
//	        			   }
//	        		   }
	        		   
//	        		   for(k=lb; k<=ub ; k++) {
//	        			   a[k] = b[k];
//	        			   }}
	        		   
	            
	     
	           public static void divideMethod(int arrA[], int begin, int end) {
	        	   
	        	  
	        	   if(begin>=end) {    // also can be written as
	        		   return;          // if(begin>mid) { 
 	        	   }					// working of recursion-- (below code)
	        	   					   // }
	        	    
	        		   
	        	    int mid= begin+(end-begin)/2;
	        	   divideMethod(arrA, begin, mid);
	        	   divideMethod(arrA, mid+1, end);
	        	   conquer(arrA, begin , mid , end);
	          	   
	        	   }
	
      public static void main(String[] args) {    		
    		Scanner sc = new Scanner(System.in);
        	System.out.println("enter the size");
    		int size = sc.nextInt();
    		
    		int arrA[] = new int[size];
    		int n = arrA.length;
    		
    		System.out.println("enter the values in array");
 		
   		for(int i=0; i<n;i++) {
   			arrA[i] = sc.nextInt();
   		}
   		
 		int begin =0;
 		int end = n-1;
    		
    		
    		divideMethod(arrA, 0, n-1);
    				
    		// print
    		System.out.println("the sorted array is:");
            for(int i=0; i<n;i++) {
    			
    			System.out.println(arrA[i]);
    		}	
		
	}
}
