import java.util.Scanner;

public class patterns_practice_patterns_half_butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of lines");
        int n = sc.nextInt();
        for (int i = 1; i <= 2 * n; i++) {
            int total_stars_in_row = i > n ? 2 * n - i : i;
            for (int j = 1; j <= total_stars_in_row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
