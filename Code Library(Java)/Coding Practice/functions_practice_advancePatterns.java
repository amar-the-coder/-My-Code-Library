import java.util.Scanner;

public class functions_practice_advancePatterns {
    public static void alphabetPattern(int rows) {
        char ch = 'A';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }

    public static void butterfly(int x) {

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (x - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = x; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            int spaces = 2 * (x - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = x; i >= 1; i--) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void floydTriangle(int x) {
        int count = 1;

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void halfNumberPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void invertedStar(int rows) {
        for (int i = rows; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int x) {
        for (int i = 1; i <= x; i++) {
            // inner loop for spaces
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }

            // for rows
            if (i == 1 || i == x) {
                for (int j = 1; j <= x; j++) {
                    System.out.print("*");

                }
            }
            // for rows
            else {
                for (int j = 1; j <= x; j++) {
                    if (j == 1 || j == x)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromicPattern(int x) {
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
    }

    public static void pascalTriangle(int x) {
        int number = 1;
        for (int i = 1; i <= x; i++) {
            // for spaces
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }
            number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void halfButterfly(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int total_stars_in_row = i > n ? 2 * n - i : i;
            for (int j = 1; j <= total_stars_in_row; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reflectedhalfpyramid(int x) {
        for (int i = 1; i <= x; i++) {

            // first inner loop for spaces
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }

            // second inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidrhombus(int x) {
        for (int i = 1; i <= x; i++) {
            // inner loop for spaces
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }

            // inner loop for stars
            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void zeroOneTriangle(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("enter the numbers of rows ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println("Alphabet Patterns");
        alphabetPattern(x);
        System.out.println("Butterfly Pattern");
        butterfly(x);
        System.out.println("Diamond patterns");
        diamondPattern(x);
        System.out.println("Floyd patterns");
        floydTriangle(x);
        System.out.println("Half Number Pyramid Pattern");
        halfNumberPyramid(x);
        System.out.println("Inverted star pattern");
        invertedStar(x);
        System.out.println("Number Pyramid pattern");
        numberPyramid(x);
        System.out.println("Number palindromic pattern");
        palindromicPattern(x);
        System.out.println("Pascal triangle Pattern");
        pascalTriangle(x);
        System.out.println("Pattern half Butterfly Pattern");
        halfButterfly(x);
        System.out.println("Reflected Half Pyramid");
        reflectedhalfpyramid(x);
        System.out.println("Solid Rhombus");
        solidrhombus(x);
        System.out.println("Zero and One Pattern");
        zeroOneTriangle(x);
        System.out.println("Happy Coding");
        sc.close();

    }
}
