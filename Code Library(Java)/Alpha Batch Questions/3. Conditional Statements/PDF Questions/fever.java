import java.util.Scanner;

public class fever {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter temperature");
        double temp = s.nextDouble();
        if (temp > 100) {
            System.out.println("You have a fever");
        } else {
            System.out.println("You don't have a fever");
        }
        s.close();

    }
}
