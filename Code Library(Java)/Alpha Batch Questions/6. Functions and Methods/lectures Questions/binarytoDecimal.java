import java.util.Scanner;

public class binarytoDecimal {

    public static int BinarytoDecimal(int binNum) {
        int power = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, power));

            power++;
            binNum = binNum / 10;

        }

        return binNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the binary number");
        int x = sc.nextInt();

        System.out.println(BinarytoDecimal(x));
        sc.close();
    }
}
