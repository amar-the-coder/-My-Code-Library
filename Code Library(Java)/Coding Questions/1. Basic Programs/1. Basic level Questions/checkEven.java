
import java.util.*;

public class checkEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);

		System.out.println("enter the vaue of n");

		int n = Sc.nextInt();

		checkEven(n);

		Sc.close();

	}

	public static void checkEven(int n) {

		if (n % 2 == 0) {
			System.out.println(n + " is even");
		}

		else {
			System.out.println(n + " is not even");
		}

	}

}
