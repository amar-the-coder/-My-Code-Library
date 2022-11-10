// package Strings;

import java.util.Scanner;

public class String3Questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// question 1: Take an array of string input from the user & find the
		// cummulative(combined) length of all those strings.
		System.out.println("enter the length");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		String array[] = new String[size];
		int totalLength = 0;

		for (int i = 0; i < size; i++) {
			array[i] = sc.next();
			totalLength += array[i].length();
		}

		System.out.println("the total length is " + totalLength);

		sc.close();

		// question 2: input a string from the user create a new String called 'result'
		// in which you will replace the letter 'e' in the original string with letter
		// 'i'
		System.out.println("enter string question 2- 'e' will be replace with 'i'");

		Scanner Sc = new Scanner(System.in);
		String Str = Sc.nextLine();

		String result = "";

		for (int i = 0; i < Str.length(); i++) {
			if (Str.charAt(i) == 'e') {
				result += 'i';
			}

			else {
				result += Str.charAt(i);
			}
		}
		System.out.println(result);
		Sc.close();

		// question 3: input an email from the user and you have to create a substring
		// from the email by deleting the part that comes after '@'

		Scanner w = new Scanner(System.in);
		System.out.println("enter string for question 3- it will return string befor '@'");
		String email = w.nextLine();

		String userName = "";

		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@') {
				break;
			}

			else
				userName += email.charAt(i);
		}

		System.out.println(userName);
		w.close();

	}

}
