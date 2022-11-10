// package recursion;

import java.util.Scanner;

public class printLastAndFirstOcurrenceString {

	public static int first = -1;
	public static int last = -1;

	public static void findOccurence(String str, int idx, char element) {
		if (idx == str.length()) {
			return;
		}

		if (str.charAt(idx) == element) {
			if (first == -1) {
				first = idx;
			}

			else {
				last = idx;
			}
		}

		findOccurence(str, idx + 1, element);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();
		System.out.println("enter the word for which u want to find occurence");
		char el = sc.next().charAt(0);
		int idx = 0;

		findOccurence(str, idx, el);

		System.out.println("first occurence: " + first);
		System.out.println("last occurence: " + last);
		sc.close();
	}

}
