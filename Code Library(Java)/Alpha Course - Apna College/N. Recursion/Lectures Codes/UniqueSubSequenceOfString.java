
import java.util.Scanner;
import java.util.HashSet;

public class UniqueSubSequenceOfString {
	public static void uniqueSub(String str, int idx, String newString, HashSet<String> allSeq) {
		if (idx == str.length()) {
			if (allSeq.contains(newString)) {
				return;
			}

			else
				System.out.println(newString);
			allSeq.add(newString);
			return;
		}

		char curr = str.charAt(idx);

		// to be choose

		uniqueSub(str, idx + 1, newString + curr, allSeq);

		// not to choose
		uniqueSub(str, idx + 1, newString, allSeq);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String str = sc.nextLine();

		HashSet<String> allSeq = new HashSet<>();

		uniqueSub(str, 0, "", allSeq);
		sc.close();

	}

}
