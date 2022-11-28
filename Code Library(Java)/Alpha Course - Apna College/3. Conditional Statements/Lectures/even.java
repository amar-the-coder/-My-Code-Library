import java.util.Scanner;

public class even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number");
        int number = sc.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is even");

        else
            System.out.println(number + " is not even");
        sc.close();

    }

}
