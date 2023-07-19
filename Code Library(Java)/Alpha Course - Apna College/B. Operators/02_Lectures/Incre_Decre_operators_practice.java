
public class Incre_Decre_operators_practice {
    public static void main(String[] args) {

        // pre_increment(++a) and post_increment(a++)
        // 1. Pre_increment ---> phele value ko change karo, phir use karo
        // example

        int a = 10;
        int b = 0;
        b = ++a;
        System.out.println(a);
        System.out.println(b);
        // a= 11, b= 11

        // 2. Post_increment ---> phele value ko use karo, phir change karo
        // example
        int a1 = 10;
        int b1 = 0;
        b1 = a1++;
        System.out.println(a1);
        System.out.println(b1);
        // a= 11; b=10;

        // pre_decrement(--a) and post_decrement(a--)
        // 1. Post_decrement ---> phele value ko change karo, phir use karo
        // example
        int a2 = 10;
        int b2 = 0;
        b2 = --a2;
        System.out.println(a2);
        System.out.println(b2);
        // b= 9, a= 9

        // 2. Post_increment ---> phele value ko use karo, phir change karo
        // example
        int a3 = 10;
        int b3 = 0;
        b3 = a3--;
        System.out.println(a3);
        System.out.println(b3);
        // a= 9, b= 10;
    }
}
