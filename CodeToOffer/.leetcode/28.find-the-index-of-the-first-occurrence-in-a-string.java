/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    /*
     * The code is implementing the `strStr` function, which is used to find the
     * index of the first occurrence of a substring
     * (`needle`) within a larger string (`haystack`).
     * 
     * Basic solution, using of subSequence() might not be very efficient?!
     * time complexity - O(n^2)
     * 
     * the latest one is a better and elegant solution
     */

    public int strStr(String haystack, String needle) {

        int m = haystack.length();
        int n = needle.length();

        for (int i = 0; i < m - n + 1; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;

    }
}
// @lc code=end
