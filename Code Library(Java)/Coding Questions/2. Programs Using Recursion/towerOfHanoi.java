// time complexity --- O(2^n)

// package recursion;

import java.util.Scanner;

class towerOfHanoi {
	public static void calctowerOfHanoi(int n, String src, String helper, String dest) {
		if (n == 1) {
			System.out.println("transfer desk " + n + " from " + src + " to " + dest);
			return;
		}

		calctowerOfHanoi(n - 1, src, dest, helper);
		System.out.println("transfer desk " + n + "from " + src + "to " + dest);
		calctowerOfHanoi(n - 1, helper, src, dest);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int x = sc.nextInt();

		calctowerOfHanoi(x, "S", "H", "D");
		sc.close();
	}

}
