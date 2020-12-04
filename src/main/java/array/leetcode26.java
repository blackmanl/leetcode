package array;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class leetcode26 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            if (map.containsKey(value)) {
                return new int[]{map.get(value) ,i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
