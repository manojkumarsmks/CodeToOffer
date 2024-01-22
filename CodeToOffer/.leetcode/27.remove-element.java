/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {

    /**
     * The function removes all occurrences of a given value from an array and
     * returns the new length of the array.
     *
     * @param nums An array of integers that may contain the value to be removed.
     * @param val  The value that needs to be removed from the array.
     * @return The method is returning the length of the modified array after
     *         removing all occurrences of the given value.
     * 
     * 
     * @mk - Initially took a approach to rotate the array as soon I I find "val"
     *     while interated,
     *     We run into a problem when there are 2 or more consequtive "vals".
     *     This approach is O(n) time complexity, but O(n) in time and bunch of
     *     reperated work
     * 
     *     This approach removes an loop, still same effeicency little better code
     * 
     *     The latest solution is a very elegant solution. Learned it.
     *     Technique is - updating while iterating need two pointers, one to iterate
     *     while one to update.
     */
    public static int removeElement(int[] nums, int val) {

        int pointer = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[pointer++] = nums[i];
            }
        }

        return pointer;
    }
}
// @lc code=end
