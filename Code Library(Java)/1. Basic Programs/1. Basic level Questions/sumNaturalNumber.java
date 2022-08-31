package programs;
import java.util.Scanner;
public class sumNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the value of n");
     int n = sc.nextInt();
     int sum = 0;
     for(int i=1; i<=n; i++) {
    	 sum = sum+i;
     }
     
     System.out.println("the sum of first "+n+ " natural numbers is " +sum);
     
     
    		 
	}

}
