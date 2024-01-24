/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    /**
     * The function searches for the target value in the given array and returns the
     * index where it is found or the index
     * where it should be inserted if not found.
     * 
     * @param nums   An array of integers in ascending order.
     * @param target The target is the value that we are searching for or the value
     *               that we want to insert into the array.
     * @return The method `searchInsert` returns the index at which the `target`
     *         element should be inserted into the `nums`
     *         array. If the `target` element is already present in the array, it
     *         returns the index of that element. If the
     *         `target` element is not present in the array, it returns the index at
     *         which the `target` element should be inserted
     *         to maintain the sorted order of
     * 
     * 
     * @mk - Straight forward solution
     */
    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }

        return nums.length;
    }
}
// @lc code=end
