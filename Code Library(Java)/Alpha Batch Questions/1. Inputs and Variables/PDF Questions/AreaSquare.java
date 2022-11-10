import java.util.Scanner;

public class AreaSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the side of square");
        int side = sc.nextInt();

        System.out.println("The area of the square is " + (side * side));
        sc.close();
    }
}