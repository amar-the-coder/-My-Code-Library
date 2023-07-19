import java.util.Scanner;

public class functions_practice_primeNumber {

    public static boolean primeNumber(int number) {

        if (number == 1 || number == 0) {
            System.out.println("neither prime or composite");
            return false;
        }
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean ans = primeNumber(number);
        System.out.println(ans);
        sc.close();
    }
}
