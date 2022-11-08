
import java.util.Scanner;

class countMazeProblems {

	public static int countPaths(int i, int j, int n, int m) {
		if (i == n || j == m)
			return 0;

		if (i == n - 1 || j == m - 1)
			return 1;

		// move downwards
		int downpaths = countPaths(i + 1, j, n, m);

		// move rightwards
		int rightpaths = countPaths(i, j + 1, n, m);

		return downpaths + rightpaths;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the rows");
		int n = sc.nextInt();

		System.out.println("enter the columns");
		int m = sc.nextInt();

		int totalPaths = countPaths(0, 0, n, m);

		System.out.println("the number of paths " + totalPaths);

	}

}
