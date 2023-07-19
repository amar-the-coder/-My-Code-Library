import java.util.Scanner;

public class functions_practice_basics {

    public static void printHello() {
        System.out.println("welcome to the world of functions");
        System.out.println("welcome to the world of functions");
        System.out.println("welcome to the world of functions");

    }

    public static int sumzz(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void know_concept_of_callByValue(int s) {
        s = 240;
        System.out.println("the value of s in static function " + s);
    }

    public static void product(int a, int b) {
        int c = a * b;
        System.out.println("the product of a and b is " + c);

    }

    // 1. function overloading using different parameters:-

    public static int sum(int a, int b) {
        return a + b;

    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // 2. function overloading using data types

    public static int sum1(int a, int b) {
        return a + b;

    }

    public static float sum1(float a, float b, float c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("initiate Hello world");

        printHello();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x");
        int x = sc.nextInt();
        System.out.println("enter the value of y");
        int y = sc.nextInt();
        int sum = sumzz(x, y);
        System.out.println("the sum of a and b is " + sum);
        System.out.println("now call by value");
        int s = 100;
        know_concept_of_callByValue(s);
        System.out.println("the value s in main function " + s);
        System.out.println("now product");
        product(x, y);
        System.out.println("Function overloading concept ");
        System.out.println("enter the value of A,B and C");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ans1 = sum(a, b);
        int ans2 = sum(a, b, c);

        System.out.println(ans1);
        System.out.println(ans2);

        // 2.
        System.out.println(sum1(2, 5));
        System.out.println(sum1(3.4f, 4.5f, 5.6f));
        sc.close();
    }
}
