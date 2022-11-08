// package bit_Manipulation;

import java.util.Scanner;

public class swapNumberUsingBits {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println("before swaping: a is " + a + " b is " + b);

    System.out.println("after swaping");
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    System.out.println("a is = " + a + " and b is = " + b);

  }

}
