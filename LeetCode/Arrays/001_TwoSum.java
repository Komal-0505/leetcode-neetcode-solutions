// LeetCode 1 - Two Sum
// --------------------------------
// Solution 1: Brute Force 
// Time Complexity: O(n^2)
// Space Complexity: O(1)
//
// Solution 2: Optimized using HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

class Solution {

    public int[] twoSum(int[] nums, int target) {
        int len1 = nums.length;
        for (int i = 0; i < len1; i++) {
            for (int j = i + 1; j < len1; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    // Another approach (Optimized)
    public int[] twoSumUsingHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
