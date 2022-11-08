
import java.util.Scanner;

public class hcf {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();

        while (a != b) {
            if (a > b)
                a = a - b;

            else
                b = b - a;

            System.out.println("the hcf is  " + b);
        }
    }

}
