public class countSorting {
    public static void main(String[] args) {

        int arr[] = { 7, 8, 9, 6, 3, 2, 4, 5 };
        countSortingTechnique(arr);
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print("}");

    }

    public static void countSortingTechnique(int arr[]) {
        int largest = Integer.MIN_VALUE;
        // calculating the largest value
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);

        }

        int count[] = new int[largest + 1];
        // calculating frequency
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;

        }

        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}
