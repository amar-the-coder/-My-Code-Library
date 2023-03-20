import java.util.Scanner;

public class StringReverseApproachTwo {

	public static String revString(String str) {
		if (str.length() == 1)
			return str;

		char curr = str.charAt(0);
		String newString = revString(str.substring(1));
		return newString + curr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();

		String Reversed = revString(str);
		System.out.println(Reversed);
		sc.close();
	}

}
