import java.util.Scanner;

public class invertedStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        sc.close();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// another logic
// for(int i = 1;i<=n;i++){ incrementing i and inner loop goes to n-i+1
// for(int s=1;s<=n-i+1;s++){
// System.out.print("*");
// }
// System.out.println();
// }

// output--
// enter the value of n = 10
// **********
// *********
// ********
// *******
// ******
// *****
// ****
// ***
// **
// *
