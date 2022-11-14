import java.util.Scanner;

public class print1to10 {

    public static void main(String[] args) {

        // printing 1 to 10
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        // printing 1 to N
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N");
        int n = sc.nextInt();
        int j = 1;
        while (j <= n) {
            System.out.print(j + " ");
            j++;
        }
        sc.close();

    }
}
