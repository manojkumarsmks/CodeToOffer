/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    // The code is implementing the `strStr` function, which is used to find the
    // index of the first occurrence of a substring
    // (`needle`) within a larger string (`haystack`).
    public int strStr(String haystack, String needle) {

        if (haystack.length() < needle.length())
            return -1;

        for (int i = 0; i < haystack.toCharArray().length; i++) {

            if (haystack.charAt(i) == needle.charAt(0)) {

                if (i + needle.length() > haystack.length()) {
                    return -1;
                }
                if (haystack.subSequence(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }

        }
        return -1;

    }
}
// @lc code=end
