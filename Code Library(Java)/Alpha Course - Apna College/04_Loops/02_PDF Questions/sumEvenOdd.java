import java.util.Scanner;

public class sumEvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int number;
        int even = 0;
        int odd = 0;

        do {
            System.out.println("enter the number");
            number = sc.nextInt();

            if (number % 2 == 0)
                even += number;

            else
                odd += number;

            System.out.println("press 1 for continue and 0 for end the loop");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("the sum of even is " + even);
        System.out.println("the sum of odd is " + odd);

        sc.close();
    }

}