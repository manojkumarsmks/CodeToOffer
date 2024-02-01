/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    /**
     * The function checks if two strings are anagrams by comparing the frequency of
     * each character in both strings.
     * 
     * @param s The first string input, s, represents the first word or phrase that
     *          we want to check if it is an anagram.
     * @param t The parameter "t" is a string that we want to check if it is an
     *          anagram of string "s".
     * @return The method is returning a boolean value, either true or false.
     * 
     * @mk - Using Array as an hashmap, index as a key and value as the value
     */
    public boolean isAnagram(String s, String t) {

        int[] array = new int[26];

        for (char c : s.toCharArray()) {
            array[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            array[c - 'a']--;
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                return false;
            }
        }

        return true;

    }
}
// @lc code=end
