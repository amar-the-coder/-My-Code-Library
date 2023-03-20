public class maxSubArrayKandaneAlgo {

    public static void kandane(int num[]) {
        int maxSum = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < num.length; i++) {
            cs = cs + num[i];
            if (cs < 0)
                cs = 0;
            maxSum = Math.max(cs, maxSum);
        }
        System.out.println("Your maxSum is : " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kandane(arr);

    }
}
