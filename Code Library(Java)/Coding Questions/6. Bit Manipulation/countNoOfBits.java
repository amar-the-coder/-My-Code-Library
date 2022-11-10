// package bit_Manipulation;

import java.util.Scanner;

public class countNoOfBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();  
		int pos = 0;
		int count = 0;

		while (pos <= num) {
			int bitMask = 1 << pos;
			if ((bitMask & num) != 0) {
				count++;
			}
			pos++;
		}

		System.out.println(count);

		sc.close();

	}

}
