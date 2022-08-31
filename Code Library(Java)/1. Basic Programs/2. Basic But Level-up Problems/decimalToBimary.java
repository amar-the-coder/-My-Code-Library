//Approach 1 using ARRAYS

Time complexity: O(logn) 
Auxiliary Space: O(1) 

package programs;
import java.util.Scanner;
public class decimalToBinary {	
	static void dectobin(int n) {
		int [] binaryNum = new int[100000000];
		int i=0;
		while(n>0) {
			binaryNum[i]=n%2;
			n=n/2;
			i++;		
		}
			for(int j=i-1;j>=0;j--) {
			System.out.print(binaryNum[j]);
		}
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	dectobin(n);    
	}

}
