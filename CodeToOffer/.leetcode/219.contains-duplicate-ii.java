/*
 * @lc app=leetcode id=219 lang=java
 *
 * [219] Contains Duplicate II
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    /**
     * The function checks if there are any duplicate elements in an array within a
     * given distance.
     * 
     * @param nums An array of integers.
     * @param k    The parameter `k` represents the maximum distance between two
     *             indices `i` and `j` such that `nums[i]` and
     *             `nums[j]` are equal. In other words, it determines how close the
     *             duplicate elements can be in the array for the method
     *             to return `true`.
     * @return The method is returning a boolean value. It returns true if there are
     *         any duplicate elements in the given array
     *         `nums` that are at most `k` indices apart. Otherwise, it returns
     *         false.
     * 
     * 
     * @mk - This is a decent approach, happy about the ability to solve the problem
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
// @lc code=end
