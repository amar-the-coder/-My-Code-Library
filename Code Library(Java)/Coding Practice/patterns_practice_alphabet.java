import java.util.Scanner;

public class patterns_practice_alphabet {
    public static void main(String[] args) {
        System.out.println("enter the rows");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }

}
