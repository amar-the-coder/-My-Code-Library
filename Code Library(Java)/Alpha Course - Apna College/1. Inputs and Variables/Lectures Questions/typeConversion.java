import java.util.Scanner;

public class typeConversion {

    // in this i will do demonstrate how to do type casting in java:

    // 1. Type conversion (widening conversion or implict conversion)
    // Conversion happens for two resons
    // a. type compatible ( number to number and charc to number)
    // b. destination must be bigger than source
    // byte -> short -> int -> float -> long -> double
    // for example:

    public static void main(String[] args) {
        int a = 24;
        long b = a;
        System.out.println("b is" + b);

        // long a1 = 24;
        // int b1 = a1;
        // this will not work bcz we can convert long to int, we cannot

        try (// same As in scanner class
                Scanner sc = new Scanner(System.in)) {
            float number = sc.nextInt();
            System.out.println(number);
        }

        // int num = sc.nextFloat(); -- not work because it can't take float number as
        // int

        // ---------------------------------------------------------------------------------
        // 2. TYPE CASTING (narrow / explicit)
        // syntax = type variable name = (type)variable;

        // for ex->

        float x = 25.12f;
        // this is not allowed int y = x;
        // for this we need to do explicit casting
        int y = (int) x;
        System.out.println(y);

        char z = 'a';
        int num = z;
        System.out.println(num);

        // TYPE PROMOTION IN EXPRESSION

        // 1) Java automatically promotes each byte, short, or char operand to int when
        // evaluating an expression
        // 2) If one operand is long, float, or double the whole expression is promoted
        // to long, float, or double respectively

        // for example --

        short p = 5;
        byte q = 25;
        char r = 'c';
        // byte ans = p + q + r; -- can't work bcz int cannot be change to byte
        byte ans = (byte) (p + q + r);
        System.out.println(ans);

        int e = 10;
        float f = 20.45f;
        long g = 34;
        double h = 678;
        double ans1 = e + f + g + h;
        System.out.println(ans1);

        // important note:

        byte s = 5;
        // wrong
        // s = s*2; can't work because s*2 become an expression and then it means it has
        // converted to int

        // right
        s = (byte) (b * 2);

        System.out.println(s);

    }

}
