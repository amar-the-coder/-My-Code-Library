// Example 1:
// Input: nums = [1, 2, 3, 1]
// Output: true
// Example 2:
// Input: nums = [1, 2, 3, 4]
// Output: false

import java.util.*;

public class numberRepeatTwice {

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicate1(arr));
    }

    // approach 2 using HashSet-- O(n)
    public static boolean containsDuplicate1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }
        return false;

    }
}
