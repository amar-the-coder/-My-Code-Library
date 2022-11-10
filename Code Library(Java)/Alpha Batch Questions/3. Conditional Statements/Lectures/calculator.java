import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println("enter operator");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b <= 0)
                    System.out.println("sorry invalid");
                else
                    System.out.println(a / b);
                break;

            case '%':
                if (b <= 0)
                    System.out.println("sorry invalid");
                else
                    System.out.println(a % b);
                break;

            default:
                System.out.println("sorry wrong operator");
                break;
        }

        sc.close();
    }
}
