package programs;

import java.util.Scanner;

public class CountZeroPositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("press 1 to continue & 0 to stop");
        int input= sc.nextInt();
        int zero=0, pos=0, neg=0;
        while(input==1){
        	System.out.println("enter the numbers");
        	int n = sc.nextInt();
        	
        	if(n==0) {
        		zero++;
        	}
        	
        	if(n>0) {
        		pos++;
        	}
        	
        	if(n<0) {
        		neg++;
        	}
        	  System.out.println("press 1 to continue & 0 to stop");
               input= sc.nextInt();
        }
        
        
        System.out.println("the number of positive is" +pos);
        System.out.println("the number of negative is" +neg);
        System.out.println("the number of zeros is" +zero);
	}

}
