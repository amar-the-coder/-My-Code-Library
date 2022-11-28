import java.util.Scanner;

public class patternZeroOneTriangle {

    public static void zeroOne(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0)
                    System.out.print("1 ");

                else
                    System.out.print("0 ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();

        System.out.println("the pattern is : ");
        zeroOne(n);
        sc.close();

    }
}
