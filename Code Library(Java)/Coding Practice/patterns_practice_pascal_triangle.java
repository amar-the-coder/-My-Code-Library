import java.util.Scanner;

public class patterns_practice_pascal_triangle {
    public static void main(String[] args) {
        System.out.println("enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int number = 0;
        for (int i = 1; i <=x; i++) {
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
        sc.close();
    }

}