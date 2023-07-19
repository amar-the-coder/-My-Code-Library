import java.util.Scanner;

public class loops_practice_sum_of_natural_number {
    public static void main(String[] args) {
        System.out.println("enter the number up to which you find the sum");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;

        }
        System.out.println(sum);

    }
}
