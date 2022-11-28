import java.util.Scanner;

// nCr = n!/r!(n-r)!

public class binomialCoefficient {

    public static int factorial(int nums) {
        int fact = 1;

        for (int i = 1; i <= nums; i++) {
            fact = fact * i;

        }
        return fact;
    }

    public static int binCoeff(int n, int r) {

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binCoeff = fact_n / (fact_r * fact_nmr);

        return binCoeff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n");
        int n = sc.nextInt();

        System.out.println("enter the value of r");
        int r = sc.nextInt();

        int ans = binCoeff(n, r);
        System.out.println("the ans is " + ans);
        sc.close();

    }
}
