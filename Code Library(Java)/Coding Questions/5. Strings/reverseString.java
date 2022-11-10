// package Strings;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder("Amarjeet");

		for (int i = 0; i < s.length() / 2; i++) {
			int front = i;
			int back = s.length() - 1 - i;

			char front_char = s.charAt(front);
			char back_char = s.charAt(back);

			s.setCharAt(front, back_char);
			s.setCharAt(back, front_char);
		}

		System.out.println(s);

		// Approach 2

		String s1;
		System.out.println("enter the string");
		s1 = sc.nextLine();
		String rev = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			rev += s1.charAt(i);
		}
		System.out.println(rev);
		sc.close();
	}

}
