import java.util.*;

public class arrays_practice_reverse {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arrayItems[] = new int[x];
        System.out.println("enter the elements in array");
        for (int i = 0; i < x; i++) {
            arrayItems[i] = sc.nextInt();
        }
        reverseArray(arrayItems);
        sc.close();
    }

    public static void reverseArray(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

        System.out.println("printing arrays");
        for (int j2 = 0; j2 < arr.length; j2++) {
            System.out.println(arr[j2]);
        }

    }
}