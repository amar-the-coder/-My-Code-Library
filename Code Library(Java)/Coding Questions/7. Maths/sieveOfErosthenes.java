// time complexity O(root(n))
// take a boolean array function 
// take a boolean array with size n+1
// now fill all values with true
// arr[0] and arr[1] = false;
// main logic of SOE
// for(int i=2 ; i*i<=n ;i++) { // goes upto root of n
//		for(int j=2*i ; j<=n ; j+=i) { // jumps and mark the multiples of number false like in 2 it will false on 4,6, 8 ,.....so on and then in 3 no need to mark on 6 , 12 as it is already mark by 2....so on 
//			isprime[j] = false;          // multiple are not prime
//		}
//	}

// package mathsProblem;

import java.util.Arrays;
import java.util.Scanner;

public class sieveOfErosthenes {

	public static boolean[] SOE(int n) {
		boolean isprime[] = new boolean[n + 1];
		Arrays.fill(isprime, true);
		isprime[0] = false;
		isprime[1] = false;

		for (int i = 2; i * i <= n; i++) {
			for (int j = 2 * i; j <= n; j += i) {
				isprime[j] = false;
			}
		}

		return isprime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		boolean isprime[] = SOE(n);

		for (int i = 0; i <= n; i++) {
			System.out.println(i + " " + isprime[i]);
		}
	}

}
