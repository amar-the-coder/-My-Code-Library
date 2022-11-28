import java.util.Scanner;

public class evenCheck {

    public static boolean even(int n) {

        boolean isEven = false;

        if (n == 0 || n == 1) {
            return false;
        }
        if (n % 2 == 0) {
            isEven = true;
        }
        return isEven;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of number : ");
        int x = sc.nextInt();
        boolean s = even(x);
        System.out.println(s);
        sc.close();

    }
}
