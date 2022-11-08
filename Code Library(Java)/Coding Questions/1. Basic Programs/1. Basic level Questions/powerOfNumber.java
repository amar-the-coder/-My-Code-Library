import java.util.Scanner;

public class powerOfNumber {

       public static void main(String[] args) {
              // TODO Auto-generated method stub
              Scanner sc = new Scanner(System.in);
              System.out.println("enter the number");
              int num = sc.nextInt();

              System.out.println("enter the power");
              int power = sc.nextInt();

              int ans = 1;

              for (int i = 1; i <= power; i++) {
                     ans *= num;
              }

              System.out.println(ans);
       }

}
