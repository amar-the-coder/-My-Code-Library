// time complexity O(2^n)

import java.util.Scanner;

public class subSequenceString {
	public static void subsequences(String str, int idx, String newString) {
		if (idx == str.length()) {
			System.out.println(newString);
			return;
		}

		char curr = str.charAt(idx);

		// yeh add hona chahta hai
		subsequences(str, idx + 1, newString + curr);

		// add nhi hoga yeh nhi aana chahta
		subsequences(str, idx + 1, newString);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();

		int idx = 0;
		subsequences(str, idx, "");
	}

}
