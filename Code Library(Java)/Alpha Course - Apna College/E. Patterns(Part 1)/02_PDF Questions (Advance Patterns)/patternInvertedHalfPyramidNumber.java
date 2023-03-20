import java.util.Scanner;

public class patternInvertedHalfPyramidNumber {

    public static void NumberHalfPyramidInverted(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("the pattern is :");
        NumberHalfPyramidInverted(n);
        sc.close();
    }
}
