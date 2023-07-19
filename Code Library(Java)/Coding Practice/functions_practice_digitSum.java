import java.util.Scanner;

public class functions_practice_digitSum {
    public static int digitSum(int a) {
        int sumDigit = 0;
        while (a > 0) {
            int lastDigit = a % 10;
            a /= 10;
            sumDigit += lastDigit;
        }
        return sumDigit;

    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sumDigit = digitSum(a);
        System.out.println("the sum of digits is: " + sumDigit);
        sc.close();
    }
}
