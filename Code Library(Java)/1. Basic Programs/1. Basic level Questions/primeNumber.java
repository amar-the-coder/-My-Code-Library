
package programs;
import java.util.*;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int count, n;
      System.out.println("enter the number for which you want to check it is prime or not");
      n = sc.nextInt();
      count = 0;
      for(int i=1; i<=n; i++) {
    	  if(n%i==0) {
    		  count++;
    	  }
      }
      
      if(count==2) {
    	  System.out.println(n+ " is prime");
      }
      
      else {
    	 System.out.println(n+ " is not prime");
      }
		

	}

}


// Approach 2 using loop ends to n/2

package programs;
import java.util.Scanner;
public class primeNumberMethodTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	   long n = sc.nextLong();
	   boolean isPrime = true;
	   for(int i=2; i<n/2;i++) {
		   if(n%i==0) {
			   isPrime= false;
			   break;
		   }
	   }
		   
		   if(isPrime==true) {
			   if(n==1) {
				   System.out.println("it is neither prime not composite");
			   }
			   
			   else {
				   System.out.println(n+ " is prime number");
			   }   
		   }
		   
		   else {
			   System.out.println(n+ " is not prime number");
		   
	   }

	}

}
