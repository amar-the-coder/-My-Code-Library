package zPratciceRevision;

import java.util.Scanner;

public class josephProblem {
	
	public static int josh(int p, int k) {
		
		if(p==1)
			return 0;
		
		  
		return (josh(p-1,k)+k)%p;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner c = new Scanner(System.in);
           
          System.out.println("enter the value of persons");
          int p = c.nextInt();
          
          System.out.println("enter the value of k");
          int k = c.nextInt();
          
          
         int ans= josh(p,k);
         System.out.println(ans);
           
           
	}

}
