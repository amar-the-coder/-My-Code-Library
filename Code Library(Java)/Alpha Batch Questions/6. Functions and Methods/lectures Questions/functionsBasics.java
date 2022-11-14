import java.util.Scanner;

// 1. Syntax of functionsBasics
// returnType functionName(){
// body
// return statement
// }

// 2. syntax with parameters
// returnType name(type param1, type param2){
//body
// return statement;
// }

public class functionsBasics {
    // 1.
    public static void printHello() {
        System.out.println("hello World");
        System.out.println("hello World");
        System.out.println("hello World");
        return;
    }

    // 2.
    public static int calcsum(int a, int b) { // parameters or formal parameter's (function declare)
        int c = a + b;
        return c;

    }

    // 3.
    public static void swap(int a, int b) {
        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    // 4.
    public static void product(int a, int b) {
        int c = a * b;
        System.out.println("the product of 2 numbers is: " + c);
        return;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. simple function
        printHello();

        // 2. function with parameter
        System.out.println("enter the value of A and B");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = calcsum(a, b); // Arguments or actual parameters ( function call )
        System.out.println("the sum is " + c);
        sc.close();

        // call by value --swap function
        System.out.println("before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        swap(a, b);

        // 3. call by value
        System.out.println("looking on the concepts of call by value");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // suppose example
        // changeA(int a){ remember this a is a copy of (a) which is passed by main func

        // a=10; changes a values to 10;
        // }

        // main function{
        // int a=5;
        // changeA(a);
        // System.out.println(a);
        // above line will print the value of a = 5 not 10 bcz
        // 1. the value changes in the a will remain only to declare function
        // 2. after control moved to main the value of a changes to existing value
        // }

        // 4. product function
        product(a, b);
    }
}

// types of methods--

// 1. user defined
// 2. inbuilt functions--