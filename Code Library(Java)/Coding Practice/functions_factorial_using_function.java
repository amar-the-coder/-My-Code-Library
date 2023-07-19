import java.util.Scanner;

public class functions_factorial_using_function {
    public static int fact(int a) {
        int factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = fact(x);
        System.out.println(ans);

        
        sc.close();
    }
}
