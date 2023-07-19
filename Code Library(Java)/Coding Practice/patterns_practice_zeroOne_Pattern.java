import java.util.Scanner;

public class patterns_practice_zeroOne_Pattern {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
        sc.close();
    }
}
