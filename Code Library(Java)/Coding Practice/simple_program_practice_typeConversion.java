import java.util.Scanner;

public class simple_program_practice_typeConversion {
    public static void main(String[] args) {
        // 1. type conversion, type wielding, implicit conversion
        // a. type compatible (boolean to int)
        // b. destination type > source type
        // byte -> short -> int -> float -> long -> double
        int a = 10;
        long b = a;
        System.out.println(b);

        long a1 = 100;
        // int b1 = a1; did not work well
        System.out.println(a1);

        // case of user enter
        Scanner sc = new Scanner(System.in);
        // float x = sc.nextInt(); works well
        // int y = sc.nextFloat(); java does not allow this

        // 2. type casting, narrow, explicit casting(zabarsasti karte hai, hum isko)
        // syntax: type variable name = (type) var;

        int p = 10;
        byte q = (byte) p;
        System.out.println(p + " , " + q);

        char ch = 'a';
        int num = ch;
        System.out.println(num);

        // another concept ---- type promotion(only in expressions)

        // 1. java automatically each byte, short, or char operand to int when
        // evaluating an expression.
        // 2. if one operand is long, flat or double the whole expression is promoted to
        // long, float or double respectively.

        // example
        char p1 = 'a';
        char p2 = 'b';
        System.out.println(p2 - p1); // changes to int

        // case 1
        short abc = 5;
        byte efg = 25;
        char pgr = 'c';

        int ans = abc + efg + pgr; // works well
        System.out.println(ans);
        // ans1 = (byte)(abc+efg+pgr);

        // case 2
        int a11 = 10;
        float b22 = 20.0f;
        long c22 = 25;
        double d22 = 30;
        double ans3 = a11 + b22 + c22 + d22; // changes to double
        System.out.println(ans3); 
        sc.close();
    }
}
