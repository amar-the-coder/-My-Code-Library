import java.util.Scanner;

public class average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the marks of OS");
        int n1 = sc.nextInt();

        System.out.println("enter the marks of DBMS");
        int n2 = sc.nextInt();

        System.out.println("enter the marks of CN");
        int n3 = sc.nextInt();

        int total_marks = n1 + n2 + n3;
        System.out.println("the total marks " + total_marks);

        float average_marks = total_marks / 3;

        System.out.println("the avergae marks of the student is " + average_marks);

    }
}
