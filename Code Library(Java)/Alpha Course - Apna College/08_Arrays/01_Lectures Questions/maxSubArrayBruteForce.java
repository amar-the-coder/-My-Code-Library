public class maxSubArrayBruteForce {

    public static void printSubArraySum(int num[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    // calculating subArray Sum

                    currSum += num[k];

                }
                System.out.print("(" + currSum + ")");

                if (maxSum < currSum)
                    maxSum = currSum;

            }
            System.out.println();

        }
        System.out.println();
        System.out.println("max sum : " + maxSum);

    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        printSubArraySum(arr);
    }
}
