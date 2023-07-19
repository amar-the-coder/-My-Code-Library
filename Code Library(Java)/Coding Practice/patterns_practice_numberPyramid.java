import java.util.Scanner;

public class patterns_practice_numberPyramid {
    public static void main(String[] args) {
        System.out.println("enter the numbers of rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j);

            }
            System.out.println();
        }

        sc.close();

    }
}
