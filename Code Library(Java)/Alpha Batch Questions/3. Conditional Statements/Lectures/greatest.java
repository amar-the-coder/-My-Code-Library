import java.util.Scanner;

public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("enter the value of b");
        int b = sc.nextInt();
        System.out.println("enter the value of c");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is greatest");

        }

        else if (b > c) {
            System.out.println(b + "is greatest");
        }

        else if (a == b && b == c) {
            System.out.println("all are equal");
        }

        else {
            System.out.println(c + "is greatest");
        }

        sc.close();

    }
}
