import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        // syntax of array
        int marks[] = new int[50];

        int numbers[] = { 1, 2, 3 };

        int moreNumbers[] = { 4, 5, 6 };

        String fruits[] = { "apple", "mango", "orange" };

        // printing array
        System.out.println(marks[1]);
        System.out.println(numbers[1]);
        System.out.println(moreNumbers[1]);
        System.out.println(fruits[1]);

        // taking input in array

        int Marks[] = new int[100];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks now: ");
        // OS Marks
        Marks[0] = sc.nextInt();

        // CN Marks
        Marks[1] = sc.nextInt();

        // DBMS Marks
        Marks[2] = sc.nextInt();

        System.out.println("Marks 1: " + Marks[0]);
        System.out.println("Marks 2: " + Marks[1]);
        System.out.println("Marks 3: " + Marks[2]);

        // Updating Value:
        Marks[0] = 100;

        Marks[0] = Marks[1] - 3;

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("percentage = " + percentage);

        // length of array
        System.out.println(Marks.length);

        // array as arguments->
        int examScores[] = { 98, 99, 100 };

        update(examScores);
        for (int i = 0; i < examScores.length; i++) {
            System.out.println(examScores[i]);
        }

        sc.close();
    }

    public static void update(int examScores[]) {
        for (int i = 0; i < examScores.length; i++) {
            examScores[i] += 1;
        }

    }
}
