import java.util.Scanner;

public class decimaltoBinary {

    public static int decimalToBinary1(int n) {
        int bin = 0;
        int power = 0;
        int rem = 0;
        while (n > 0) {
            rem = n % 2;
            n /= 2;
            bin = bin + (rem * (int) Math.pow(10, power));
            power++;
        }
        return bin;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value in decimal");
        int x = sc.nextInt();

        int ans = decimalToBinary1(x);
        System.out.println("the binary form is " + ans);

        sc.close();

    }
}
