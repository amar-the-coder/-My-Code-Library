import java.util.Scanner;

public class patterns_practice_hollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            // inner loop for spaces
            for (int j = 1; j <= x - i; j++) {
                System.out.print(" ");
            }

            // for rows
            if (i == 1 || i == x){
            for (int j = 1; j <= x; j++) {
                    System.out.print("*");

            }
        }
            // for rows
            else{
            for (int j = 1; j <= x; j++) {
                if (j == 1 || j == x)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
        }
            System.out.println();
        }
        sc.close();
    }
}