import java.util.Scanner;

public class linearSearching {
    public static void main(String[] args) {
        int f = 0;
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the elements in the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the element you want ");
        int value = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (value == arr[i]) {
                System.out.println("element found at index " + i);
                f = 1;
                break;
            }
        }
        if (f == 0) {
            System.out.println("element not found");
        }

        sc.close();

        // another way as function

        int numbers[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int key = 20;

        int index = linearSearch(numbers, key);

        if (index == -1) {
            System.out.println("NOT FOUND");

        }

        else {
            System.out.println("key is at index : " + index);
        }
    }

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] == key) {

                return i;
            }

        return -1;
    }
}
