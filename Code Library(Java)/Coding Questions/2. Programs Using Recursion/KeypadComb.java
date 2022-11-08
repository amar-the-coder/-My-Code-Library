// time complexity ----- )(
// package recursion;

import java.util.Scanner;

public class KeypadComb {

	public static String[] keypad = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

	public static void printComb(String str, int idx, String Combination) {
		if (idx == str.length()) {
			System.out.println(Combination);
			return;
		}
		// logic
		char curr = str.charAt(idx);
		String mapping = keypad[curr - '0'];
		for (int i = 0; i < mapping.length(); i++) {
			printComb(str, idx + 1, Combination + mapping.charAt(i));
		}

		// it can also be writen as:

		// for(int i=0; i<keypad[str.charAt(idx)-'0'].length();i++{
		// char curr = keypad[str.charAt(idx)-'0'].charAt(i);
		// printComb(str, idx, curr+combination);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();

		int idx = 0;
		String Combination = "";

		printComb(str, idx, "");

	}

}
