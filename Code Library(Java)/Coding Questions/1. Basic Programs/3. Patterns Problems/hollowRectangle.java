
public class hollowRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		int m = 5;
		System.out.println("The pattern for the hollow rectangle");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (i == 1 || j == 1 || i == n || j == m) {
					System.out.print("*");
				}

				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

// output::
// The pattern for the hollow rectangle
// *****
// * *
// * *
// *****
