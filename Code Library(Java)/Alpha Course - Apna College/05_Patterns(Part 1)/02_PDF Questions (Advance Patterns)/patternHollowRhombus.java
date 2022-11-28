import java.util.Scanner;

public class patternHollowRhombus {

    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) { // for spaces
                System.out.print(" ");
            }
            // print stars after spaces
            // print stars for each solid rows
            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            }
            // stars for hollow rows
            else {
                for (int j = 1; j <= n; j++) {
                    if (j == 1 || j == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            // move to the next line/row

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("the pattern is : ");
        sc.close();
        hollowRhombus(n);
        sc.close();

    }

}

// to be completed soon
