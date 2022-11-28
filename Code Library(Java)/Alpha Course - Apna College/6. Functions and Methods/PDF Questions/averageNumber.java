import java.util.Scanner;

public class averageNumber {

    public static int calcAverage(int n, int m, int o) {
        int ans = (n + m + o) / 3;
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of marks I subject");
        int x = sc.nextInt();
        System.out.println("enter the value of marks II subject");
        int y = sc.nextInt();
        System.out.println("enter the value of marks III subject");
        int z = sc.nextInt();

        int ans = calcAverage(x, y, z);
        System.out.println("the average is : " + ans);
        sc.close();
    }

}