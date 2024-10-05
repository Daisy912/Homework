package leetcode;

import java.util.Scanner;

/**
 * Name:Index
 * Description:
 * <p>
 * Date: 2024/9/22上午11:32
 * Author:Daisy
 */

public class ClimbStairs2 {
//        if (台阶格数为1) {
//            只有一种方法
//        }
//        if (台阶格数为2) {
//            有两种方法
//        }
//        int[] 容器 = new int[容器长度];
//        dp[0阶] = 0;
//        dp[1阶] = 1;
//        dp[2阶] = 2;
//        for (int i = 3; i < 阶数; i++) {
//            dp[i阶台阶的方法数] = dp[到i-1阶的方法数] + dp[到i-2阶的方法数];
//        }
//        return 到n阶的方法数;
    public int climbStairs2(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
