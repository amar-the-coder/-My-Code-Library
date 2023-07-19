import java.util.Scanner;

public class functions_convertBinaryToDecimal {

    public static int bin_to_dec(int binaryNumber) {
        int decimalNumber = 0;
        int power = 0;
        while (binaryNumber > 0) {
            int lastDigit = binaryNumber % 10;
            decimalNumber = decimalNumber + (int) (lastDigit * Math.pow(2, power));
            power++;
            binaryNumber = binaryNumber / 10;
        }

        return decimalNumber;
    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ans = bin_to_dec(number);
        System.out.println(ans);
        sc.close();
    }
}
