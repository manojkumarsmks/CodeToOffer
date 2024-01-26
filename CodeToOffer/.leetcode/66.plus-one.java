/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {

        int carry = 0;
        int temp = 0;
        for (int i = digits.length - 1; i >= 0; i--) {

            // Decider for adding 1 or not;
            if (i == digits.length - 1) {
                temp = digits[i] + carry + 1;
            } else {
                temp = digits[i] + carry;
            }

            // handle the 10 and carry
            if (temp == 10) {
                digits[i] = 0;
                carry = 1;
            } else {
                digits[i] = temp;
                carry = 0;
            }

        }

        // handle if the carry exists
        if (carry == 1) {
            int[] result = new int[digits.length + 1];

            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i - 1];
            }

            result[0] = carry;
            digits = result;
        }

        return digits;

    }
}
// @lc code=end
