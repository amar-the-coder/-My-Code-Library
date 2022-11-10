// package recursion;

import java.util.Scanner;

public class moveXtoTheEndofTheString {

	public static void moveAllX(String str, int idx, int count, String newString) {
		if (idx == str.length()) {
			for (int i = 0; i < count; i++) {
				newString += "x";
			}

			System.out.println(newString);

			return;
		}

		char curr = str.charAt(idx);
		if (curr == 'x') {
			count++;

			moveAllX(str, idx + 1, count, newString);
		}

		else {
			newString += curr;
			moveAllX(str, idx + 1, count, newString);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		int idx = 0;
		int count = 0;
		String newString = "";

		moveAllX(str, idx, count, newString);
		sc.close();

	}

}

//////////////////// APPROACH 2 ///////////////////////////////

// public class Recursion2 {
// //to add all 'x' to the end of the string

// public static String addX(int count) {
// String newStr = "x";
// for(int i=1;i<count; i++) {
// newStr += 'x';
// }
// return newStr;
// }
// public static String moveAllX(String str, int idx, int count) {
// if(idx == str.length()) {
// return addX(count);
// }
// if(str.charAt(idx) == 'x') {
// return moveAllX(str, idx+1, count+1);
// } else {
// String nextStr = moveAllX(str, idx+1, count);
// return str.charAt(idx) + nextStr;
// }
// }
// public static void main(String args[]) {
// String str = "abcdefxghxixjxxxk";
// int count = 0;
// String newStr = moveAllX(str, 0, count);
// System.out.println(newStr);
// }
// }
