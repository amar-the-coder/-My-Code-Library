import java.util.Scanner;



public class functions_practice_palindrome {

    public static boolean checkPalindrome(int number) {

        int palindrome = number; // copy variable so that i can check further
        int reversed = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            number /= 10;
            reversed = reversed * 10 + lastDigit;
        }

        if (reversed == palindrome) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (checkPalindrome(s))
            System.out.println("true number is palindrome");

        else
            System.out.println("false number is not palindrome");

        sc.close();
    }

}
