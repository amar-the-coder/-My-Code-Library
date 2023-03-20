import java.util.Scanner;

public class swapUsingBitsManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("before swapping: a is " + a + " b is " + b);

        System.out.println("after swapping");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a is = " + a + " and b is = " + b);

        sc.close();
    }
}
