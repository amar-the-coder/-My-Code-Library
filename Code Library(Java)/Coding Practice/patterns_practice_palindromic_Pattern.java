import java.util.Scanner;

public class patterns_practice_palindromic_Pattern {
    public static void main(String[] args) {
        System.out.println("enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            // for spaces
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            // for backwards numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // for forward numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        sc.close();
    }
}
