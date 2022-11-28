import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of a");
        int firstNumber = sc.nextInt();
        System.out.println("enter the value of b");
        int secondNumber = sc.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(+firstNumber + " is largest");
        }

        else {
            System.out.println(+secondNumber + " is largest");
        }

        if (firstNumber == secondNumber) {
            System.out.println("both are equal");
        }
        sc.close();
    }
}
