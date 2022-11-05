package dsa;

import java.util.Scanner;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers of rows");
	    int	rows = sc.nextInt();
		
		System.out.println("enter the numers of colums");
	    int	columns = sc.nextInt();
		
		int mat[][] = new int[rows][columns];
		
		System.out.println("enter the contents of the matrix");
		for(int i=0 ; i<rows; i++) {
			for(int j=0 ; j<columns; j++) {
			
			mat[i][j] = sc.nextInt();
			}
		}
		
		
		
		int top = 0;
		int bottom = rows-1;
		int left = 0;
		int right = columns-1;
		int i;
		
		while(top<=bottom && left<=right) {
			
			for(i=left; i<=right; i++)
			{
				System.out.print(mat[top][i]);
			}
			top++;
			
			for(i=top; i<=bottom; i++)
			{
				System.out.print(mat[i][right]);
			}
			right--;
			
			if(top<=bottom) {
				for(i=right; i>=left;i--) {
					System.out.print(mat[bottom][i]);
					
				}
		 		bottom--;
			}
			
			
			if(left<=right) {
				for(i=bottom ; i>= top ;i--) {
					System.out.print(mat[i][left]);
					
				}
				left++;
			}
		}
		
	
		
		
		
	}

}
