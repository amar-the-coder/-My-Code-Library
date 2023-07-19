import java.util.Scanner;

public class functions_convertDecimalToBinary {

    public static int decimal_to_binary(int decimalNumber) {

        int binaryNumber = 0;
        int power = 0;
        int remainder = 0;
        while (decimalNumber > 0) {
            remainder = decimalNumber % 2;
            decimalNumber = decimalNumber / 2;
            binaryNumber = binaryNumber + (remainder * (int) Math.pow(10, power));
            power++;
        }

        return binaryNumber;
    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ans = decimal_to_binary(number);
        System.out.println(ans);
        sc.close();
    }
}
