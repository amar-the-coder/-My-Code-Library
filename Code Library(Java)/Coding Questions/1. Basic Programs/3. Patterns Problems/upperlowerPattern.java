package patterns;

public class UpperLowerPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 8;
       for(int i=1; i<=n;i++) {
    	   for(int j=1;j<=i;j++)
    	   {
    		   System.out.print("*");
    	   }

           System.out.println();
       }
       
      
     
       for(int i=n;i>=1;i--) { 
    	   for(int j=1; j<n-i+n+1;j++) 
    	   {
    		   System.out.print(" ");
    	   }
    	   for(int j=1;j<=i;j++)
    	   {
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }
	}

}
 
output::
*
**
***
****
*****
******
*******
********
        ********
         *******
          ******
           *****
            ****
             ***
              **
               *