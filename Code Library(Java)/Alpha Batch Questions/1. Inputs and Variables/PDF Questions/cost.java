import java.util.Scanner;

public class cost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the price of book");
        float book = sc.nextFloat();

        System.out.println("enter the price of pen");
        float pen = sc.nextFloat();

        System.out.println("enter the price of pencil");
        float pencil = sc.nextFloat();

        float total_cost = book + pen + pencil;
        float gst = (total_cost / 100) * 18;

        float final_cost = total_cost + gst;
        System.out.println("the final price after the gst is " + final_cost);

    }
}
