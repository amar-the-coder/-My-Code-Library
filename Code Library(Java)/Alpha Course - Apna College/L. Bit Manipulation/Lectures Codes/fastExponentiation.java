import java.util.Scanner;

public class fastExponentiation {

    public static void main(String[] args) {
        int number, power;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        power = sc.nextInt();
        int ans = fastPower(number, power);
        System.out.println(ans);
        sc.close();
    }

    public static int fastPower(int number, int power) {
        int ans = 1;
        while (power > 0) {
            if ((power & 1) != 0) {
                ans = ans * number;

            }
            number *= number;
            power = power >> 1;
        }
        return ans;
    }
}
