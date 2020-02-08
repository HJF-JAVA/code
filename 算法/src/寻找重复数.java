package main.java;


/**
 * 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。
 * <p>
 * 不能更改原数组（假设数组是只读的）。
 * 只能使用额外的 O(1) 的空间。
 * 时间复杂度小于 O(n2) 。
 * 数组中只有一个重复的数字，但它可能不止重复出现一次。
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author 柘木
 * @date 2020/2/3
 */
public class 寻找重复数 {
    public int findDuplicate(int[] nums) {
        int key = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (Integer i : nums) {
            if (hashMap.get(i) == null) {
                hashMap.put(i, 1);
            } else {
                hashMap.put(i, hashMap.get(i) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entries : hashMap.entrySet()) {
            if (entries.getValue() > 1) {
               key=entries.getKey();
            }
        }
        return key;
    }

    public int findDuplicate2(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (Integer integer:nums) {
            if(set.contains(integer)){
                return integer;
            }
            set.add(integer);
        }
        return -1;
    }
}
