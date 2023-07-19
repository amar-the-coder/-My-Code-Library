import java.util.Scanner;

public class functions_practice_binomialCoefficient {

    public static int fact(int a) {
        int factorial = 1;
        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int binomial_Coefficient(int n, int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_NminusR = fact(n - r);

        int bino_coeff = fact_n / (fact_r * fact_NminusR);
        return bino_coeff;
    }

    public static void main(String[] args) {
        System.out.println("enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("enter the value of r");
        int r = sc.nextInt();
        System.out.println("the binomial coefficient is : " + binomial_Coefficient(n, r));
        sc.close();
    }
}
