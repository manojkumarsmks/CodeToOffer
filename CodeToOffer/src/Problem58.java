/**
 * https://leetcode.com/problems/length-of-last-word/description/
 */
public class Problem58 {

    public static void main(String[] args) {

        String s = " ";

        System.out.println(lengthOfLastWord(s));

    }

    /**
     * The function returns the length of the last word in a given string.
     * 
     * @param s The parameter "s" is a string that represents a sentence or a
     *          phrase.
     * @return The method is returning the length of the last word in the given
     *         string.
     */
    public static int lengthOfLastWord(String s) {

        s = s.trim();

        int i = s.length() - 1;
        int counter = 0;

        while ((i >= 0) && s.charAt(i) != ' ') {
            counter++;
            i--;
        }

        return counter;
    }

}