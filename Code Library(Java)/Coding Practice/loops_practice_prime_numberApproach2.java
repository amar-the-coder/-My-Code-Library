import java.util.Scanner;

public class loops_practice_prime_numberApproach2 {
    public static void main(String[] args) {

        // logic -->> koi bhi number apne square root tak sirf agar 1 se divisible hai
        // to woh prime hai

        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        boolean is_prime = true;

        if (num == 1 || num == 0) {
            System.out.println("neither prime or composite number");
            return;

        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                is_prime = false;
                break;
            }
        }
        if (is_prime == true) {
            System.out.println("number is prime");
        } else
            System.out.println("number is not prime");

    }
}
