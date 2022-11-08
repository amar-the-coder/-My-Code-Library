
import java.util.Scanner;

public class fibonacci {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number");
      int num = sc.nextInt();
      int a = 0;
      int b = 1;
      int c;

      for (int i = 1; i <= num; i++) {
         c = a + b;
         System.out.print(c + " ");
         a = b;
         b = c;
      }
   }

}
