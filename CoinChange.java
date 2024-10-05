package leetcode;

import java.util.Arrays;

/**
 * Name:CoinChange
 * Description:
 * <p>
 * Date: 2024/9/28下午12:52
 * Author:Daisy
 */
public class CoinChange {
    /**
     * @param coins  零钱数组
     * @param amount 目标
     * @return 最少零钱
     */
//    int[] 容器 = new int[长度];
//    Arrays.fill(目标容器, 不可能出现的硬币个数); //初始化
//    dp[0元] = 0;  //目标金钱是0，则该金钱的组合数为0
//        for (遍历零钱数组coins中的零钱 coin) {
//          for (int i = coin; i < amount + 1; i++) {
//            if (i元 - 该次遍历的零钱后的钱可以被组合) {
//                dp[i元] = 最少零钱数(该次的组合, i-coin的组合+1);
//            }
//        }
//    }
//        return dp[目标金钱] 是 初始化的值 ? 无组合 : 方法数;

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1]; //容器
        Arrays.fill(dp, amount + 1); //零钱个数不能超过amount，所以如果有该amount可组合的，则dp[amount]<=amount
        dp[0] = 0; //amount=0，则有0种组合
        for (int coin : coins) {
            for (int i = coin; i < amount + 1; i++) {
                if (dp[i - coin] != amount + 1) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
