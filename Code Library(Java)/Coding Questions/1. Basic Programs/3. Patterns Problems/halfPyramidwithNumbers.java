package patterns;
import java.util.*;
public class halfPyramidWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         
         int n=5;
         for(int i=1; i<=n;i++)
         {
        	 for(int j=1; j<=i; j++) {
        		 System.out.print(j+"");
        	 }
        	 System.out.println();
         }
	}

}

output::
1
12
123
1234
12345
