import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int x = sc.nextInt();
        System.out.println("enter up to what number u want to find the table");
        int y = sc.nextInt();

        for (int i = 1; i <= y; i++) {
            System.out.println("the table of " + x + " is: " + x + "*" + i + " = " + (x * i));
            sc.close();
        }
    }
}
