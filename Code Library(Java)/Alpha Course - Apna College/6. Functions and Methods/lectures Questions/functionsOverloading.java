import java.util.Scanner;

// multiple functions with the same name but different parameters:

// for e.g.
// 1. multiply(int a, int b);
// 2. multiply(int float a, float b);
// 3. multiply(double a, double b);

// special note: function overloading always depend on parameters not return type 

public class functionsOverloading {

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
        Scanner sc = new Scanner(System.in);
        // 1.
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
