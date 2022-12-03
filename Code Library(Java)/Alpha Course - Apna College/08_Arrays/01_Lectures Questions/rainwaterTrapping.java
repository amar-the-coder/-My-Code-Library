public class rainwaterTrapping {

    public static int trappedWater(int waterHeight[]) {
        int h = waterHeight.length;
        // calculate left max boundary
        int leftMax[] = new int[waterHeight.length];
        leftMax[0] = waterHeight[0];

        for (int i = 1; i < waterHeight.length; i++)
            leftMax[i] = Math.max(waterHeight[i], leftMax[i - 1]);

        // calculate right max boundary
        int rightMax[] = new int[waterHeight.length];
        rightMax[h - 1] = waterHeight[h - 1];

        for (int i = h - 2; i >= 0; i--)
            rightMax[i] = Math.max(waterHeight[i], rightMax[i + 1]);

        int trappedWater = 0;

        // calculate water level
        for (int i = 0; i < h; i++) {
            // waterlevel = math.min(leftmaxBoundary, rightmaxBoundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trapped water = waterlevel-height[i];
            trappedWater += waterLevel - waterHeight[i];

        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };

        System.out.println(trappedWater(arr));
    }
}
