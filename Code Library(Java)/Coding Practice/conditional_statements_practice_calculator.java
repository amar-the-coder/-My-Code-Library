import java.util.Scanner;

public class conditional_statements_practice_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number");
        int num2 = sc.nextInt();

        System.out.println(
                "enter the operator\n1. '+' for addition\n2. '-' for subtraction\n3. '*' for multiplication\n4. '/' for division");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                if (num1 == 0 || num2 == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(num1 * num2);
                }
                break;
            case '/':

                if (num1 == 0)
                    System.out.println("sorry division not possible bcz first number = 0");

                if (num2 == 0)
                    System.out.println(0);
                else {

                    System.out.println(num1 / num2);
                }
                break;

            default:
                System.out.println("OOPS! you have entered wrong operator");
                break;
        }
sc.close();
    }
}
