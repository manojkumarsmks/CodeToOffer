/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    /**
     * The function takes an array of digits representing a non-negative integer and
     * returns an array representing the
     * integer incremented by one.
     * 
     * @param digits An array of integers representing a number. Each element in the
     *               array represents a digit of the
     *               number, with the least significant digit at index 0.
     * @return The method is returning an array of integers.
     * 
     * 
     * @mk - this is definitely not the elegant code I am proud of
     *     Time Complexity - O(n)
     * 
     *     The new approach is just a genius approached, learned it from
     *     solutions!!Damn
     */
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;

        }

        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;

    }
}
// @lc code=end
