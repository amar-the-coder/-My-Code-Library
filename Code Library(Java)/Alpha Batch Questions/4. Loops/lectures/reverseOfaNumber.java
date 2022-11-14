import java.util.Scanner;

public class reverseOfaNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if (num == 0)
            System.out.println("0");

        while (num != 0) {
            int lastDigit = num % 10;
            System.out.print(lastDigit);
            num /= 10;

            // another way
            // int rev =0(as global variable)
            // rev = rev*10+lastdigit
        }

        sc.close();

    }
}
