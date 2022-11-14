import java.util.Scanner;

public class halfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();

    }
}

// output
// enter the value of n = 7
// 1
// 12
// 123
// 1234
// 12345
// 123456
// 1234567