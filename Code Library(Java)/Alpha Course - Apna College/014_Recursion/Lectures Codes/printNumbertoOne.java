// recursion function introduction

// package recursion;
import java.util.Scanner;

public class printNumbertoOne {

	public static void printNumber(int n) {
		if (n == 0)
			return;

		System.out.println(n);
		printNumber(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();

		printNumber(n);

		sc.close();

	}

}
