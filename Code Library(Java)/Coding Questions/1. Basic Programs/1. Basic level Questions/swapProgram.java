
package programs;
import java.util.*;


public class swapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 Scanner sc = new Scanner(System.in);
 int a, b;
 System.out.println("Enter the value of a");
 a = sc.nextInt();
 System.out.println("Enter the value of b");
 b = sc.nextInt();
 
 System.out.println("After Swapping");
 int temp = a;
 a = b;
 b = temp;
 System.out.println("the new value of a is " +a);
 System.out.println("the new value of b is " +b);
 
	}

}
