import java.util.Scanner;

public class arrays_practice_basics {
    public static void main(String[] args) {
        // syntax--- datatype arrayName[] = new datatype[size];
        // syntax--- datatype arrayName[] = new datatype{entity1, entity2, entity3};

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the Number of IITs You want to enter");
        int size = sc.nextInt();
        String IIT[] = new String[size];
        for (int i = 0; i < size; i++) {
            IIT[i] = sc.nextLine();
        }

        // printArray(IIT);

        System.out.println("entered colleges are");
        for (int i = 0; i < IIT.length; i++) {
            System.out.println(IIT[i]);
        }

        sc.close();
    }

    public static void printArray(String Colleges[]) {
        System.out.println("entered colleges are");

        for (int i = 0; i < Colleges.length; i++) {
            System.out.println(Colleges[i]);
        }

    }
}
