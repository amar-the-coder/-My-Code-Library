import java.util.Scanner;

public class naturalNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i <= num) {
            sum += i;
            i++;
        }

        System.out.println("the sum of the " + num + " numbers is " + sum);
        sc.close();
    }
}
