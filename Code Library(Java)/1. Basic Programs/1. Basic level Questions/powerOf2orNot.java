package programs;

import java.util.Scanner;

public class powerOf2orNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		//logic::
		// 1. take a boolean var and mark it as true
		// 2. run while loop until number is not equal to 2
		//3. if num%2!=0 then mark boolean as false
		// 4. then num = num/2;
		 boolean power = true;
		while(num!=2) {
			if(num%2!=0) {
				power = false;
			}
			
			num= num/2;
			
		}
		
		if(power==true)
		{
			System.out.println("it is in power");
		}
		
		else{
			System.out.println("no it is not in power");
		}
	
	}

}
