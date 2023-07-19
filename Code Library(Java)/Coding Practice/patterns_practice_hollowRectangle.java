import java.util.Scanner;

public class patterns_practice_hollowRectangle {
    public static void main(String[] args) {
        System.out.println("enter the number of rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("enter the number of cols");
        int cols = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || j == 1 || i == rows || j == cols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
            }
        }
            System.out.println();
        }
        sc.close();
    }
}
