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
     * 
     *      This is sliding window approach, better and efficient approach 
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet();
        
        int j = 0;
        for(int i = 0; i <nums.length; i++) {
            if (set.size() > k) {
                set.remove(nums[j]);
                j++;
            }
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }

        
        return false;
    }
}
// @lc code=end
