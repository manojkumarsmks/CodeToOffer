/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
import java.util.HashSet;
import java.util.Map;

class Solution {

    /**
     * The function checks if an array of integers contains any duplicate elements.
     * 
     * @param nums An array of integers
     * @return The method `containsDuplicate` returns a boolean value. It returns
     *         `true` if the input array `nums` contains any
     *         duplicate elements, and `false` otherwise.
     * 
     * @mk - Solution
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }

        return false;
    }

}
// @lc code=end
