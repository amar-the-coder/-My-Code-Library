
import java.util.*;

public class checkEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);

		System.out.println("enter the vaue of n");

		int n = Sc.nextInt();

		calcEven(n);

		Sc.close();

	}

	public static void calcEven(int n) {

		if (n % 2 == 0) {
			System.out.println(n + " is even");
		}

		else {
			System.out.println(n + " is not even");
		}

	}

}
