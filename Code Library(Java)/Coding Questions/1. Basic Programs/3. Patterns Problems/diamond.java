
public class diamond {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 10;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == 2 * i - 1)// if I remove this line it will print rhombus/diamond otherwise hollow
                                             // rhombus
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == 2 * i - 1) // if I remove this line it will print rhombus otherwise hollow rhombus
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

}

// output::

// *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// * *
// *
