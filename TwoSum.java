package leetcode.homework5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Name:TwoSum
 * Description:
 * <p>
 * Date: 2024/11/11下午1:04
 * Author:Daisy
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 4, 11, 3};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {

        /**
         * 暴力枚举
         */
//        int[] res = new int[2];
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    res[0] = i;
//                    res[1] = j;
//                    break;
//                }
//            }
//        }
//        return res;

        /**
         * 法二
         */
//        int[] res = new int[2];
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(target - num, num);
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (map.containsKey(nums[i])) {
//                for (int j = i + 1; j < nums.length; j++) {
//                    if (map.get(nums[i]) == nums[j]) {
//                        res[0] = i;
//                        res[1] = j;
//                        break;
//                    }
//                }
//            }
//        }
//        return res;

        /**
         * 法三
         */
        int[] res = new int[2];
        if (nums.length == 0 || nums == null) {
            return res;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] == map.get(nums[i])) {
                        res[0] = j;
                        res[1] = i;
                        return res;
                    }
                }
            } else map.put(target - nums[i], nums[i]);
        }
        return res;
    }
}
