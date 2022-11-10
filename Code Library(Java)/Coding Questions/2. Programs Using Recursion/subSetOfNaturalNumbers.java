
// package recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class subSetOfNaturalNumbers {

	public static void printSubset(ArrayList<Integer> subset) {
		for (int i = 0; i < subset.size(); i++) {
			System.out.println(subset.get(i) + " ");
		}

		System.out.println();
	}

	public static void findSubsets(int n, ArrayList<Integer> subset) {
		if (n == 0) {
			System.out.println(subset);
			return;
		}

		// add hoga
		subset.add(n);
		findSubsets(n - 1, subset);

		// add nhi hoga
		subset.remove(subset.size() - 1);
		findSubsets(n - 1, subset);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter n");
		int n = sc.nextInt();

		ArrayList<Integer> Subset = new ArrayList<>();
		findSubsets(n, Subset);
		sc.close();

	}

}
