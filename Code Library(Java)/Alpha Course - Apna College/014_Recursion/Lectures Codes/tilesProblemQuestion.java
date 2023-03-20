// question places tiles......
// place tiles of size 1Xm in a floor of size nXm

// tile size... 1 X M
// floor size .... N X M

// package recursion;

import java.util.Scanner;

public class tilesProblemQuestion {
	public static int placeTiles(int n, int m) {
		if (n == m)
			return 2;

		if (n < m)
			return 1;

		// vertically
		int verticalPlacement = placeTiles(n - m, m);

		// horizontal
		int horizontalPlacement = placeTiles(n - 1, m);

		// add both

		return verticalPlacement + horizontalPlacement;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows");
		int n = sc.nextInt();

		System.out.println("enter the columns");
		int m = sc.nextInt();

		int ans = placeTiles(n, m);
		System.out.println(ans);
		sc.close();
	}

}
