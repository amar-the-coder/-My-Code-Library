// printing one to 100 using recursion

// package recursion;

import java.util.Scanner;

public class print1toN {
	public static void printNumber(int n) {

		if (n == 101)
			return;

		System.out.println(n);
		printNumber(n + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc = new Scanner(System.in);
		int n = 1;
		System.out.println("printing 1 to 100 using recursion");
		printNumber(n);

		sc.close();

	}

}
