
// package arrays;
import java.util.*;

public class ArrayInsertion {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      int arr[] = new int[50];
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the size of the array");
      int n = sc.nextInt();

      System.out.println("enter the elements in the array");

      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
      }

      // insertion

      int num, pos;

      System.out.println("enter the number you want to enter");
      num = sc.nextInt();
      System.out.println("enter the position in which you want to insert the number");
      pos = sc.nextInt();

      // insertion process

      for (int i = n - 1; i >= pos - 1; i--) {
         arr[i + 1] = arr[i];
      }
      arr[pos - 1] = num;

      for (int i = 0; i < n; i++) {
         System.out.println("the contents of the array index" + " " + i + " " + arr[i]);
      }

   }

}
