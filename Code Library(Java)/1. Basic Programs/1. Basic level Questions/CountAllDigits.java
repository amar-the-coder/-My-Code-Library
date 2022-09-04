package programs;

import java.util.Scanner;

public class CountAllDigits {
   public static int countDigits(int num) {
	   int count=0;
	   
	   while(num>0) {
		   num= num/10;
		   count++;
		   
	   }
	   
	   return count;
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner Sc= new Scanner (System.in);
        int num = Sc.nextInt(); 
        int ans = countDigits(num);
         System.out.println(ans);
        
	}

}
