import java.util.*;

public class arrays_practice_binary_search {
    public static void main(String[] args) {
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("enter the elements in array");
        int arrayNumbers[] = new int[size];
        for (int i = 0; i < size; i++) {
            arrayNumbers[i] = sc.nextInt();
        }

        System.out.println("enter the number you want to search");
        int key = sc.nextInt();
        int position = binarySearch(arrayNumbers, key);
        if (position == -1) {
            System.out.println("element not found");
        }

        else
            System.out.println("element is found at position " + (position + 1));

    }

    public static int binarySearch(int arr[], int number) {
        int start = 0;
        int end = arr.length - 1;
        // main logic -- comparisons
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number == arr[mid])
                return mid;
            if (number > arr[mid])
                start = mid + 1;
            if (number < arr[mid])
                end = mid - 1;

        }
        return -1;
    }

}
