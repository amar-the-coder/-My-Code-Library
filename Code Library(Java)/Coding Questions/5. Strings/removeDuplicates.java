// time complexity = O(n)

// package recursion;

import java.util.Scanner;

public class removeDuplicates {

	public static boolean[] StringHaaYaNhi = new boolean[1000];

	public static void removeDuplicates(String str, int idx, String newString) {

		if (idx == str.length()) {
			System.out.println(newString);
			return;
		}

		char curr = str.charAt(idx);
		if (StringHaaYaNhi[curr - 'a']) {
			removeDuplicates(str, idx + 1, newString);
		}

		else {
			newString += curr;
			StringHaaYaNhi[curr - 'a'] = true;
			removeDuplicates(str, idx + 1, newString);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String str = "aman";

		int idx = 0;

		removeDuplicates(str, idx, "");

		sc.close();
	}

}
