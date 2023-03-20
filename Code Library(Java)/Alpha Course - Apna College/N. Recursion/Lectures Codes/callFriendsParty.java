// find the no of ways in which you can invite N people to your party, single or in pairs.

import java.util.Scanner;

public class callFriendsParty {

	public static int calGuest(int n) {
		if (n <= 1) {
			return 1;
		}
		// way 1 --- single bula lo party m
		// simple hai (n-1) ko call lagado
		int way1 = calGuest(n - 1);

		// Way 2 ---- pair m bula lo party m
		// simple hai way1(n-1) se call phir + (n-2)
		int way2 = (n - 1) * calGuest(n - 2);

		return way1 + way2;

		// the above logic can be also written as
		// return calGuest(n-1) + (n-1)*calGuest(n-2); s

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of people");
		int n = sc.nextInt();

		int waystoCall = calGuest(n);
		System.out.println(waystoCall);
		sc.close();

	}

}
