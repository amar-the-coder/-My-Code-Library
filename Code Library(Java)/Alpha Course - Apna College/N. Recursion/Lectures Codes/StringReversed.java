// package recursion;

import java.util.Scanner;

public class StringReversed {
	public static void printrev(String str, int idx) {
		if (idx == 0) {
			System.out.println(str.charAt(idx));
			return;
		}

		System.out.println(str.charAt(idx));
		printrev(str, idx - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();

		printrev(str, str.length() - 1);
		sc.close();

	}

}
