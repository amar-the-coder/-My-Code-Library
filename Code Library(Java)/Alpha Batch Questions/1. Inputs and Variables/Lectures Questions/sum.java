import java.util.Scanner;

public class sum {

    public static void main(String[] args) {

        // for the calculation of sum
        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = s.nextInt();
        System.out.println("enter the value of b");
        int b = s.nextInt();

        System.out.println("the sum of " + a + "+" + b + " is=" + (a + b));

        // for the calculation of product
        System.out.println("the product of " + a + "+" + b + " is=" + (a * b));

        s.close();
    }
}