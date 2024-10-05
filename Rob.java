package leetcode;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Name:Rob
 * Description:
 * <p>
 * Date: 2024/9/30下午2:48
 * Author:Daisy
 */
public class Rob {
//    if (只有一个人) {
//        只能偷他的;
//    }
//    int[] 容器 = new int[长度];
//    dp[0个人] = 0;
//    dp[1个人] = nums[0];
//        for (int i = 2; i <= nums.length; i++) {
//        dp[i个人] = 找最大值(i不偷, 偷i);
//    }
//        return n个人最多能偷到的钱 ;

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i-1] + dp[i - 2]);
        }
        return dp[nums.length];
    }
}
