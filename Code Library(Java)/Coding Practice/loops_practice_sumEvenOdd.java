import java.util.Scanner;

public class loops_practice_sumEvenOdd {
    public static void main(String[] args) {
        // question: enter user number until his choice and print sum of even and odd
        // numbers which he/she entered
        Scanner sc = new Scanner(System.in);

        int choice, number, evenSum = 0, oddSum = 0;

        do {
            System.out.println("enter the number");
            number = sc.nextInt();

            if (number % 2 == 0)
                evenSum += number;

            else
                oddSum += number;

            System.out.println("enter choice: 1 for continue and 0 for end");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("the sum of even : " + evenSum);
        System.out.println("the sum of odd : " + oddSum);
        sc.close();
    }
}