
import java.util.*;

public class pascalTriangle {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number of lines");
      int n = sc.nextInt();

      int number = 0;
      for (int i = 0; i < n; i++) {
         for (int j = 1; j < n - i; j++) {
            System.out.print(" ");
         }

         number = 1;
         for (int j = 0; j <= i; j++) {
            System.out.print(number + " ");
            number = number * (i - j) / (j + 1);

         }

         System.out.println();
      }
   }

}

// output::
// enter the number of lines
// 10
// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1
// 1 5 10 10 5 1
// 1 6 15 20 15 6 1
// 1 7 21 35 35 21 7 1
// 1 8 28 56 70 56 28 8 1
// 1 9 36 84 126 126 84 36 9 1