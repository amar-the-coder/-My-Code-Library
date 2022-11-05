package patterns;
import java.util.*;
public class InvertedHalfPyramidRotated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);


		int n;
		System.out.println("enter the value");
		n= sc.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++ ) {
				System.out.print(" ");
	 		}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

output::

enter the value
10
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
