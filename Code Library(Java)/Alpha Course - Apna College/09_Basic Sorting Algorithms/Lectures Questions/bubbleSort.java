import java.util.Scanner;

public class bubbleSort {
    public static void printArray(int arr[]) {
        System.out.println("After implementing Bubble sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter lenghth");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("enter content in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);

        sc.close();
    }

}
