import java.util.Scanner;

public class loops_practice_primeNumber {
    public static void main(String[] args) {
        System.out.println("enter the number for which you want to check it is prime or not ");
        Scanner sc = new Scanner(System.in);
        int p_num = sc.nextInt();
        sc.close();

        int count = 0;

        if (p_num == 1 || p_num == 0) {
            System.out.println("Not a prime Number");
            return;

        }

        for (int i = 1; i <= p_num; i++) {
            if (p_num % i == 0) {
                count++;
            }

        }

        if (count == 2) {
            System.out.println("number is prime");
        }

        else {
            System.out.println("not prime");
        }

    }
}
