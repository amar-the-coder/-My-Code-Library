import java.util.Scanner;

public class factorialQues {

    public static int fact(int nums) {
        int fact = 1;

        for (int i = 1; i <= nums; i++) {
            fact = fact * i;

        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int nums = sc.nextInt();
        sc.close();

        fact(nums);
    }
}
