package bit_Manipulation;

import java.util.Scanner;

public class findNoOfBitsChangeToAtoB {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        // logic
        // perform a^b first
        // count the no of 1's by using n&(n-1)

        int afterXOR = a ^ b;

        while (afterXOR > 0) {
            if ((afterXOR & (afterXOR - 1)) == 0)
                count++;

        }

        System.out.println("the bits required is " + count);

        // program doesn't but logic is right
    }

}
