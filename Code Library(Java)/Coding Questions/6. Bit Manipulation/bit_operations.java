// package bit_Manipulation;

import java.util.Scanner;

public class bit_operations {

	public static void main(String[] args) {

		System.out.println("All BIT operations in one code");

		// 1. get bit
		// logic:
		// a. bit mask; 1<<i where i is position (left shift 1 pos times)
		// b. AND operation of num with bit mask. after that if we get non zero then it
		// is one otherwise it is zero

		System.out.println("GET BIT");

		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("enter position");
		int pos1 = sc.nextInt();

		// now

		int bitmask1 = 1 << pos1;
		if ((bitmask1 & num1) == 0)
			System.out.println("Bit is Zero");
		else
			System.out.println("Bit is One");

		// 2. Set bit (koi zero hai to usse one banao )
		// logic:
		// a. bit mask; 1<<i where i is position (left shift 1 pos times)
		// b. OR operation of num with bit mask. After that zero will converted to one.

		System.out.println("SET BIT");

		System.out.println("enter number");

		int num2 = sc.nextInt();
		System.out.println("enter position");
		int pos2 = sc.nextInt();

		// now

		int bitmask2 = 1 << pos2;
		int getbit = bitmask2 | num2;
		System.out.println("after conversion: the bit changes to " + getbit);

		// 3. Clear bit ( 1 ka zero ho jayega )
		// logic:
		// a. bit mask; 1<<i where i is position (left shift 1 pos times)
		// b. AND operation of num with ( not of bit mask).

		System.out.println("Clear BIT");

		System.out.println("enter number");

		int num3 = sc.nextInt();
		System.out.println("enter position");
		int pos3 = sc.nextInt();

		// now

		int bitmask3 = 1 << pos3;
		int notBitmask = ~(bitmask3);
		int clearbit = notBitmask & num3;

		System.out.println(clearbit);

		// 4. update bit
		// a. 1 ka zero already done in clear bit->>
		// b. 0 ko 1 banayo already done in set bit ->>

		System.out.println("Clear BIT");
		System.out.println("enter number");
		int num4 = sc.nextInt();
		System.out.println("enter position");
		int pos4 = sc.nextInt();
		int operator;

		System.out.println(" press 1 for convert 0 to 1: set operation");
		System.out.println(" press 2 for convert 1 to 0: clear operation");
		operator = sc.nextInt();

		int bitmask4 = 1 << pos4;

		if (operator == 1) {
			// set
			int set = bitmask4 | num4;
			System.out.println("after set: 0 convert to 1");
			System.out.println(set);
		}

		else {
			// clear
			int newBitmask = ~(bitmask4);
			int clear = newBitmask & num4;
			System.out.println("after clear : 1 convert to 0");
			System.out.println(clear);

		}

	}

}
