import java.util.Scanner;

public class prime1 {

    public static boolean prime(int num) {

        // corner cases
        if (num == 2)
            return true;

        if (num <= 0 || num == 1)
            return false;

        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;

    }

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i))
                System.out.print(i + " ,");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 1. simple prime
        boolean c = prime(num);
        System.out.println(c);

        // 2. prime in range using range
        primesInRange(num);
        sc.close();
    }
}
