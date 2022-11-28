import java.util.Scanner;

public class allPatterns {

    public static void butterFly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == 2 * i - 1)// if I remove this line it will print rhombus/diamond otherwise hollow
                                             // rhombus
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == 2 * i - 1) // if I remove this line it will print rhombus otherwise hollow rhombus
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void floyd(int n) {
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void hollowRectangle(int n, int m) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

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
    // another way of hollow rhombus
    // for (int i = 1; i <= n; i++) {
    // for(int j = 1;j<=(n-i);j++){
    // System.out.print(" "); }
    // for(int j = 1;j<=m;j++){
    // if (i == 1 || j == 1 || i == n || j == n)
    // System.out.print("*");
    // else
    // System.out.print(" ");

    // }System.out.println();
    // }

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

    public static void NumberHalfPyramidInverted(int n) {
        // can also solved as
        // for(int i =1; i<=n;i++){
        // for(int j=1;j<=n-i+1;i++){
        // System.out.println(j);
        // }
        // System.out.println();
        // }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();
        }

    }

    public static void pyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palinpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void amarjeet(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

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

    public static void advancedPatterns(int n) {

        System.out.println("The butterfly pattern :");
        butterFly(n);

        System.out.println("The Hollow Diamond pattern :");
        diamond(n);

        System.out.println("The Floyd Triangle pattern :");
        floyd(n);

        System.out.println("The Hollow Rhombus pattern :");
        hollowRhombus(n);
        System.out.println("The Inverted and Rotated pyramid pattern :");
        InvertedandRotated(n);
        System.out.println("The Inverted Half Pyramid Number pattern :");
        NumberHalfPyramidInverted(n);
        System.out.println("The Number Pyramid pattern :");
        pyramid(n);
        System.out.println("The PalindromicPyramid pattern :");
        palinpyramid(n);
        System.out.println("The Solid Rhombus pattern :");
        amarjeet(n);
        System.out.println("The Zero to One pattern :");
        zeroOne(n);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        sc.close();

        System.out.println("The Advanced Patterns are : ");

        advancedPatterns(n);
    }
}
