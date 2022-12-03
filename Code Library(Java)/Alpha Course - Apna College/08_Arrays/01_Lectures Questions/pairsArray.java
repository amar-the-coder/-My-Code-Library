public class pairsArray {

    public static void pairsInArray(int arr[]) {
        int total_pairs = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("{" + arr[i] + "," + arr[j] + "} ");
                total_pairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs in the array is: " + total_pairs);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        pairsInArray(arr);
    }
}
