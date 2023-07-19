import java.util.Scanner;

public class opearors_practice_ternaryOperator {

    public static void main(String[] args) {
        // check for voting eligible or not

        System.out.println("enter age for check ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String ans = (age > 18) ? "yes eligible" : "not eligible";
        System.out.println(ans);
        sc.close();
    }
}
