import java.util.Scanner;

public class simple_program_practice_rectangle_area {
    public static void main(String[] args) {
        System.out.println("enter the length of the rect");
        System.out.println("enter the breadth of the rect");

        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int bre = sc.nextInt();

        int area_of_rectangle = len * bre;

        System.out.println(area_of_rectangle);
        sc.close();
    }
}
