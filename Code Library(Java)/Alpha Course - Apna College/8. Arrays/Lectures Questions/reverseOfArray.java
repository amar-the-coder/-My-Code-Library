import java.util.Scanner;

public class reverseOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");

        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        sc.close();
    }

    public static void reverse(int arr[]) {
        int i, j;
        i = 0;
        j = (arr.length) - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

        System.out.println("the reverse of array is");
        for (i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
