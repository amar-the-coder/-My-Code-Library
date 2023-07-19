import java.util.Scanner;

public class loops_practice_reverseNumber {
    public static void main(String[] args) {
        int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        if (num == 0 || num < 10) {
            System.out.println(num);

        }

        while (num != 0) {
            int last_digit = num % 10;
            num /= 10;
            System.out.print(last_digit);
        }
        System.out.println();
        System.out.println("answer with approach 2");
        // approach 2
        System.out.println("enter the second number");
        int num2 = sc.nextInt();
        while (num2 != 0) {
            int last_digit1 = num2 % 10;
            num2 /= 10;
            rev = rev * 10 + last_digit1;
        }
        System.out.print(rev);
        sc.close();
    }
}
