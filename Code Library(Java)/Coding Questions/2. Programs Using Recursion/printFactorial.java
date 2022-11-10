// package recursion;

import java.util.Scanner;

public class printFactorial {
	public static int calfact(int num) {
		if (num == 1 || num == 0)
			return 1;

		int fact = 1;
		fact = num * (calfact(num - 1));
		return fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number");
		int num = sc.nextInt();

		int ans = calfact(num);
		System.out.println("the factorial of a number  " + ans);

		sc.close();
	}

}
