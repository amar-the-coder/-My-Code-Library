
public class invertedHalfPyramidWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		// method 1
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		// method 2

		int n1 = 5;
		for (int i = 1; i <= n1; i++) {
			for (int j = 1; j <= n1 - i + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

// output::from both
// the approaches::1 2 3 4 1 2 3 1 2 1

// 1 2 3 4 5 1 2 3 4 1 2 3 1 2
// 1