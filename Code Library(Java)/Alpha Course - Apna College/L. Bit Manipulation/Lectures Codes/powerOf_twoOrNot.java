import java.util.Scanner;

public class powerOf_twoOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        boolean isPower = false;

        if ((number & (number - 1)) == 0)
            isPower = true;

        System.out.println(isPower);
        sc.close();
    }
}
