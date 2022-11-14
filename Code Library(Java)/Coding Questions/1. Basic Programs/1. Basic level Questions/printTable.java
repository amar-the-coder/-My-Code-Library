
import java.util.Scanner;

public class printTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value");
		int n = sc.nextInt();
		calcTable(n);
		sc.close();
	}

	public static void calcTable(int n) {

		for (int i = 1; i <= 10; i++) {

			System.out.println(n + "*" + i + "=" + n * i);
		}

	}

}
