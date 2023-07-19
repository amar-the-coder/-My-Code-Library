import java.util.Scanner;

public class conditional_statement_practice_leapYear {
    public static void main(String[] args) {
        // conditions of leap year---
        // 1. year must be completely divisible by 4
        // 2. year must not be completely divisible by 100
        // 3. if year is completely divisible by 100 then, it must be completely
        // divisible by 400

        // note:::: one statement must be true between 2 and 3

        System.out.println("enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean c1 = (year % 4 == 0);
        boolean c2 = (year % 100 != 0);
        boolean c3 = (year % 100 == 0) && (year % 400 == 0);

        if (c1 && (c2 || c3))
            System.out.println("year is leap ");

        else
            System.out.println("not leap year");

        sc.close();

    }
}
