import java.util.Scanner;

public class patterns_practice_reflectedHalfPyramid {
    public static void main(String[] args) {
        System.out.println("enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

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
        sc.close();
    }
}
