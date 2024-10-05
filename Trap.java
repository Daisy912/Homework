package leetcode;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Name:Trap
 * Description:
 * <p>
 * Date: 2024/10/6上午12:14
 * Author:Daisy
 */
public class Trap {
//    if (只有两个格子) {
//        不能蓄水;
//    }
//    int max = 最高点;
//    int maxIndex = 0;
//        for (int i = 0; i < height.length; i++) {
//        if (height[i] == max) {
//            maxIndex = i; //找到最高点所在的位置
//            break;
//        }
//    }
//
//    int 蓄水量 total = 0;
//    int[] dp = new int[height.length];
//    dp[0] = height[0];
//    dp[height.length - 1] = height[height.length - 1];
//    //上升型蓄水
//        for (int i = 1; i <= maxIndex; i++) {
//        dp[i] = Math.max(dp[i - 1], height[i]);
//        total += dp[i] - height[i];
//    }
//    //下降型蓄水
//        for (int i = height.length - 2; i > maxIndex; i--) {
//        dp[i] = Math.max(dp[i + 1], height[i]);
//        total += dp[i] - height[i];
//    }
//        return 蓄水量;


    public int trap(int[] height) {
        if (height.length < 3) {
            return 0;
        }
        int max = Arrays.stream(height).max().getAsInt();
        int maxIndex = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] == max) {
                maxIndex = i;
                break;
            }
        }

        int total = 0;
        int[] dp = new int[height.length];
        dp[0] = height[0];
        dp[height.length - 1] = height[height.length - 1];
        for (int i = 1; i <= maxIndex; i++) {
            dp[i] = Math.max(dp[i - 1], height[i]);
            total += dp[i] - height[i];
        }
        for (int i = height.length - 2; i > maxIndex; i--) {
            dp[i] = Math.max(dp[i + 1], height[i]);
            total += dp[i] - height[i];
        }
        return total;
    }
}
