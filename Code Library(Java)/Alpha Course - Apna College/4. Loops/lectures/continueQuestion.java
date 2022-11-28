import java.util.Scanner;

public class continueQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("enter the number :");
            int s = sc.nextInt();

            if (s % 10 == 0)
                continue;

            System.out.println("entered number was " + s);
            sc.close();

        } while (true);

    }

}
