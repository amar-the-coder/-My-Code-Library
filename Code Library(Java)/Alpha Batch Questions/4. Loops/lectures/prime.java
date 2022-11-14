import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = sc.nextInt();
        boolean isPrime = true;
        // i<num-1 yeh bhi sahi condition hai

        // for more optimise using maths class
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime == true) {
            if (num == 1)
                System.out.println("neither prime nor composite");

            else
                System.out.println("it is prime");
        }

        else {
            System.out.println("no it is not prime");
        }

        sc.close();
    }
}
