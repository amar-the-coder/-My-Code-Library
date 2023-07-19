import java.util.Scanner;

public class arrays_practice_largest {
    public static void main(String[] args) {
        System.out.println("Enter the size of arrays");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();

        }
        int biggestNumber = Integer.MIN_VALUE;
        int SmallestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > biggestNumber)
                biggestNumber = numbers[i];
            if (numbers[i] < SmallestNumber)
                SmallestNumber = numbers[i];
        }

        System.out.println("The biggest value in the array is : " + biggestNumber);
        System.out.println("The smallest value in the array is : " + SmallestNumber);
        sc.close();
    }
}
