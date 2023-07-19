import java.util.Scanner;

public class arrays_practice_average {
    public static void main(String[] args) {
        System.out.println("enter the no of subjects");
        Scanner sc = new Scanner(System.in);
        int no_of_subjects = sc.nextInt();
        int marks[] = new int[no_of_subjects];
        System.out.println("enter the marks for the subjects");
        for (int i = 0; i < no_of_subjects; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("the entered marks are");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        System.out.println("the average is: " + average(marks));
        sc.close();
    }

    // finding average
    public static int average(int marks[]) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        return sum / marks.length;
    }
}
