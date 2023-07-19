import java.util.Scanner;

public class arrays_practice_linearSearch {
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arrayItems[] = new int[x];
        System.out.println("enter the elements in array");
        for (int i = 0; i < x; i++) {
            arrayItems[i] = sc.nextInt();
        }

        System.out.println("enter the value you want to search");
        int searchingValue = sc.nextInt();

        for (int i = 0; i < arrayItems.length; i++) {
            if (searchingValue == arrayItems[i])
                System.out.println(searchingValue + " is found at : " + (i + 1) + " position ");
        }
        sc.close();
    }
}
