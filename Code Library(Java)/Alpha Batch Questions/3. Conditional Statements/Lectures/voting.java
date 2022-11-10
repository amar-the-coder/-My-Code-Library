import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("congrats you are an adult, you can eligible for both voter card and driving license ");

        }

        else {
            System.out.println("try next time");
        }
        sc.close();

    }
}