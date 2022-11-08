// package bit_Manipulation;

import java.util.Scanner;

public class checkEvenOdd {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("enter the number");
        Scanner Sc = new Scanner(System.in);
        int num = Sc.nextInt();

        if ((num & 1) == 0)
            System.out.println(num + " is even");

        else
            System.out.println(num + " is odd");
    }

}
