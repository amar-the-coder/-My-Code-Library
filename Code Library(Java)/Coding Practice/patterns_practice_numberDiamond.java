import java.util.Scanner;

public class patterns_practice_numberDiamond {
    public static void main(String[] args) {
        System.out.println("enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            int column = i > x ? 2 * x - i : i;
            for (int j = 1; j <= x - column; j++) {
                System.out.print(" ");
            }

            for (int col = i; col >= 1; col--) {
                System.out.print(col + "");
            }

            for (int col = 2; col <= column; col++) {
                System.out.print(col + "");
            }
            System.out.println();
        }
        sc.close();
    }
}
