// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
// Notice that the solution set must not contain duplicate triplets.
// Example 1:
// Input: nums = [-1, 0, 1, 2, -1, -4]
// Output: [ [-1, -1, 2] , [-1, 0, 1] ]

// Example 2:
// Input: nums = [ ]
// Output: [ ]
// Example 3:
// Input: nums = [ 0 ]
// Output: [ ]

//  EXPLANATION:

// This algorithm involves the following steps:
// 1. Use three loops to generate all possible triplets for the given array, with each loop variable keeping track of 1 triplet element each.
// 2. Next we calculate the sum for each triplet generated in step 1.
// 3. If the sum is equal to 0 we need to check if it is a unique triplet (not already in our result set). We can ensure the triplets in our result set are unique by sorting the triplets and adding it to a hashmap (hashmap overwrites data if the same value is written to the same key multiple times thereby eliminating duplicates).
// 4. Once we have added all the triplets whose sum is equal to 0 into the hashmap, we iterate through the hashmap and add it to our result array.
// 5. Finally we return the result array.
import java.util.*;

public class triplet {

    public static List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(arr));
    }
}
