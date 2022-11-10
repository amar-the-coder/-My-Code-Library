import java.util.Scanner;

public class circleArea {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float pi = 3.14f;
        System.out.println("enter the value of radius");
        float rad = s.nextInt();

        System.out.println("the area of the circle is = " + (rad * rad * pi));
        s.close();
    }
}
