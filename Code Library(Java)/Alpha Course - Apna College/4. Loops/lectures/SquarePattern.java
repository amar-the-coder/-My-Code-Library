import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the same values for N and M as it is a square matrix");
        System.out.println("enter the values of N and M");
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // using O(1)

        int line = sc.nextInt();

        for (int i = 1; i <= line; i++)
            System.out.println("****");

        sc.close();

    }
}
