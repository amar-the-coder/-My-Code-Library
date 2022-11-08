// time complexity--- O(n!)

// package recursion;

import java.util.Scanner;

public class permuOfString {

	public static void printPermutation(String str, String permutation) {
		if (str.length() == 0) {
			System.out.println(permutation);
			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			String newstr = str.substring(0, i) + str.substring(i + 1);
			printPermutation(newstr, permutation + curr);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();

		String permutation = "";
		printPermutation(str, permutation);

	}

}
