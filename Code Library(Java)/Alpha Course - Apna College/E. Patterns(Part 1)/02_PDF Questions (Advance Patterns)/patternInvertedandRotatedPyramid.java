import java.util.Scanner;

public class patternInvertedandRotatedPyramid {
    public static void InvertedandRotated(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("the pattern is :");
        InvertedandRotated(n);

        sc.close();
    }
}
