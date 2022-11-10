// package arrays;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.println("enter the size of array");

        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elemensts in array");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int i, j;
        i = 0;
        j = size - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

        System.out.println("the reverse of array is");
        for (i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }

    }

}
