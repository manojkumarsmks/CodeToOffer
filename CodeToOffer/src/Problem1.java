import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1 {

    public static void main(String[] args) {
        int[] nums = { 3, 3 };

        System.out.println(Arrays.toString(twoSumSol(nums, 9)));
    }

    /**
     * The function "twoSum" takes an array of integers and a target integer as
     * input, and returns an array of two indices
     * where the corresponding elements add up to the target.
     * 
     * Basic O(n^2) solution.
     * 
     * @param nums   An array of integers.
     * @param target The target is the sum that we are trying to find in the array.
     * @return The method is returning an array of integers.
     */
    public static int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }

        return res;

    }

    /**
     * The function "twoSumSol" takes an array of integers and a target integer as
     * input, and returns an array of two indices
     * where the corresponding elements add up to the target.
     * 
     * The solution uses Hashmap to store the nums position.
     * 
     * Time complexity - O(n)
     * Space complexity - O(n)
     * 
     * But we iterate through the map twice.
     * 
     * @param nums   An array of integers.
     * @param target The target is the sum that we are trying to find a pair of
     *               numbers for.
     * @return The method `twoSumSol` returns an array of integers.
     */
    public static int[] optimizedTwoSum(int[] nums, int target) {

        int[] res = new int[2];

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff) && map.get(diff) != i) {
                res[0] = i;
                res[1] = map.get(diff);
                return res;
            }
        }

        return null;

    }

}
