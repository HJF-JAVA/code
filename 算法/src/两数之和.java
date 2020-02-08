package main.java;

import java.util.HashMap;

/**
 * @author 柘木
 * @date 2020/2/5
 */
public class 两数之和 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complete = target - nums[i];
            if (hashMap.containsKey(i)) {
                return new int[]{hashMap.get(complete), i};
            }
            hashMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
