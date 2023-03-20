public class subArrays {

    // print subarrays in O(n^3);

    public static void sub_Arrays(int num[]) {
        int total__subarrays = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k] + ",");
                    total__subarrays++;
                }
                System.out.println();
            }

        }
        System.out.println("The number of subarrays are : " + total__subarrays);
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        sub_Arrays(array);
    }
}
