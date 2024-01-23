/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    /*
     * The code is implementing a method called `removeDuplicates` that takes an
     * array of integers `nums` as input
     * and returns an integer.
     */
    public int removeDuplicates(int[] nums) {

        int pointer = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }

        return pointer;
    }
}
// @lc code=end
