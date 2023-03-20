public class binarySearching {
    public static int binarySearch(int num[], int key) {
        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            // calculating mid
            int mid = (start + end) / 2;
            // comparisons
            // 1. element found at mid
            if (num[mid] == key)
                return mid;
            // 2. element bigger than mid found at second half
            else if (num[mid] < key)
                start = mid + 1;
            // 3. element is smaller than mid found at first half
            else
                end = mid - 1;

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14, 15, };

        System.out.println("index for key is: " + binarySearch(arr, 6));

    }
}
