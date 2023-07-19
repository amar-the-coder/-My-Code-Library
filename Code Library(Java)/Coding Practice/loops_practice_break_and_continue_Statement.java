import java.util.Scanner;

public class loops_practice_break_and_continue_Statement {
    public static void main(String[] args) {
        // write code for that in which you have to ask user to enter the number till it
        // become divisible by 10, when it become divisible break from the loop

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter the number");
            int number = sc.nextInt();

            if (number % 10 == 0)
                break;

            System.out.println(number);

        } while (true);

        // continue question
        // if number not divisible by 10 then break; if number divisible by 10 then
        // continue
        do {
            System.out.println("enter the number");
            int number = sc.nextInt();

            if (number % 10 == 0)
                continue;

            System.out.println(number);
            System.out.println("number divisible out of loop");
            sc.close();

        } while (true);

    }
}
