import java.util.Scanner;

public class functions_practice_factorialNumber {

    public static int factorial(int number) {

        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;

        }
        return fact;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        int ans = factorial(number);
        System.out.println("The factorial of the number is:" + ans);
        sc.close();

    }
}
