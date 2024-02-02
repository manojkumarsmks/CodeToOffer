/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

class Solution {
    /**
     * The function checks if a given string contains valid parentheses, brackets,
     * and braces.
     * 
     * @param s The parameter "s" is a string that represents a sequence of
     *          parentheses, brackets, and braces. The method
     *          checks if the sequence is valid, meaning that every opening
     *          parenthesis, bracket, or brace has a corresponding
     *          closing parenthesis, bracket, or brace in the correct order.
     * @return The method is returning a boolean value.
     * 
     * 
     * @mk This is the standrad stack problem
     */
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();

        Set<Character> set = new HashSet<>();
        set.add('(');
        set.add('{');
        set.add('[');

        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (char c : s.toCharArray()) {
            if (set.contains(c)) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (map.get(c) == stack.peek()) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        return stack.empty();

    }
}
// @lc code=end
