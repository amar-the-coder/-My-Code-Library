
import java.util.*;

public class numberRectangleBoundaryNumber {

     public static void main(String[] args) {
          // TODO Auto-generated method stub
          int n = 5;
          int m = 4;

          Scanner sc = new Scanner(System.in);

          //
          // for(int i=1;i<=n;i++) {
          // for(int j=1;j<=m;j++ ) {
          // if(i==1|| i==n || j==1 ||j==m) {
          // System.out.print("4");
          // }
          //
          // else if(i==2 || i==n-1|| j==2 || j==n-1){
          // System.out.print("3");
          // }
          //
          // else if(i==3|| i==n-2 || j==3||j==n-2) {
          // System.out.print("2");
          // }
          //
          // else if(i==4 && j==4) {
          // System.out.print("1");
          // }
          // else {
          // System.out.print(" ");
          // }
          // }
          // System.out.println();
          //
          // }
          //
          // System.out.println();

          // method 2 from kunal kushwaha video::

          int originalN = n;
          n = 2 * n;

          for (int i = 0; i <= n; i++) {
               for (int j = 0; j <= n; j++) {

                    int atEveryIndex = originalN - Math.min(Math.min(i, j), Math.min(n - i, n - j));

                    System.out.print(atEveryIndex);
               }
               System.out.println();
          }
     }
}

// output::

// 55555555555
// 54444444445
// 54333333345
// 54322222345
// 54321112345
// 54321012345
// 54321112345
// 54322222345
// 54333333345
// 54444444445
// 55555555555